import java.util.Scanner;

public class InputThenPrintSumAndAverage {

    public static void inputThenPrintSumAndAverage(){
        int number = 0 , count = 0;
        double average = 0.0,  sum = 0;
        Scanner scanner = new Scanner(System.in);
        while(true){
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                number = scanner.nextInt();
                sum += number;
                count++;
            }else {
                break;
            }
        }
        if(count > 0 || sum > 0){
            average = Math.round(sum / count);
        }
        System.out.println("SUM = " + (int) sum + " AVG = " + (int) average);
    }
    public static void main(String[] args) {
      inputThenPrintSumAndAverage();
    }
}
