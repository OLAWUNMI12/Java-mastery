public class DiagonalStar {
    public static void printSquareStar(int number){
        if(number < 5){
            System.out.println("Invalid Value");
        }else {
            for(int i = 1; i <= number; i++){
                System.out.println("");
                for(int j = 1; j <= number; j++){
                    String print = " ";
                    if(i == 1 || j == 1 || i == number || j == number){
                        print = "*";
                    }
                    if (i == j) {
                        print = "*";
                    }
                    if( j == j -i +1){
                        print = "*";
                    }
                    if( i == number - j + 1){
                        print = "*";
                    }
                    System.out.print(print);
                }
            }
        }
    }
    public static void main(String[] args) {
       printSquareStar(86);
    }
}
