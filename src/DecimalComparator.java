public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double paper, double pencil){
        boolean paperNegative = paper < 0;
        boolean pencilNegative = pencil < 0;
        String paperText = Double.toString(Math.abs(paper));
        int paperDecimalPlaces = paperText.length() - (paperText.indexOf('.')) - 1;

        String pencilText = Double.toString(Math.abs(pencil));
        int pencilDecimalPlaces = pencilText.length() - (pencilText.indexOf('.')) - 1;

        if(paperDecimalPlaces > 3){
            paperText = paperText.substring(0, (paperText.indexOf('.') + 4));
        }

        if(pencilDecimalPlaces > 3){
            pencilText = pencilText.substring(0,  (pencilText.indexOf('.') + 4));
        }

        paper = Double.parseDouble(paperText);
        pencil = Double.parseDouble(pencilText);

        if(paperNegative){
            paper = 0 - paper;
        }
        if(pencilNegative){
            pencil = 0 - pencil;
        }
        return paper == pencil;
    }
}
