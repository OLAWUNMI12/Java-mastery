import java.util.Scanner;

public class MinimumElement {

    private static Scanner scanner = new Scanner(System.in);

    private static int[] readElements(int count){
        int[] array = new int[count];
        for(int i = 0; i < array.length; i++){
            int num = scanner.nextInt();
            scanner.nextLine();
            array[i] = num;
        }
        return array;
    }

    private static int findMin(int[] array){
        int min =Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
