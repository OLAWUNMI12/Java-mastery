public class MainClass
{
    public static boolean hasSameLastDigit(int number1, int number2, int number3){
        if(!isValid(number1) || !isValid(number2)|| !isValid(number3)){
            return false;
        }
        int lastDigit1 = 0 , lastDigit2 = 0, lastDigit3 = 0, temp2= number2, temp3 = number3;
        int count1 = 0 ,  count2 = 0 , count3 = 0;
        boolean sharedDigitFound = false;
        while(number1 > 0){
            if(sharedDigitFound || count1 > 1){
                break;
            }
            lastDigit1 = number1 % 10;
            number1 /= 10;
            number2 = temp2;
            count1++;
            count2 = 0;
            while(number2 > 0){
                if(sharedDigitFound || count2 > 1){
                    break;
                }
                count2++;
                lastDigit2 = number2 % 10;
                number2 /= 10;
                if((lastDigit1 == lastDigit2) && (count1 == 1) && (count2 == 1)){
                    sharedDigitFound = true;
                    break;
                }
                number3 = temp3;
                count3 = 0;
                while(number3 > 0){
                    lastDigit3 = number3 % 10;
                    number3 /= 10;
                    count3++;
                    if((lastDigit1 == lastDigit3) && (count1 == 1) && (count3 == 1)){
                        sharedDigitFound = true;
                        break;
                    }
                    if((lastDigit2 == lastDigit3) && (count3 == 1) && (count2 == 1)){
                        sharedDigitFound = true;
                        break;
                    }
                }

            }

        }
        return sharedDigitFound;
    }

    public static boolean isValid(int num){
        if(num > 1000 || num < 10 ){
            return false;
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println( hasSameLastDigit(24, 23, 34));
    }
}
