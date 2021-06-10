import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int size){
        int[] ints = new int[size];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < (ints.length); i++){
            ints[i] = scanner.nextInt();
        }
        return ints;
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length ; i++ ){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
        int temp;
        boolean flag = true;
        while(flag){
            flag = false;
            for(int i = 0; i < (array.length - 1); i++){
                if(array[i] < array[i+1]){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    flag = true;
                }
            }
        }
        return array;
    }
}
