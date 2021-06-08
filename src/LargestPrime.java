public class LargestPrime {

    public static int getLargestPrime(int number){
        if(number < 0){
            return  -1;
        }
        if(number == 2){
            return  2;
        }
        int largestPrime = -1;
        for(int i = 2; i< number; i++) {
            while(number%i == 0) {
               if(i > largestPrime){
                   largestPrime = i;
               }
                number = number/i;
            }
        }
        if(number >2) {
            if(number > largestPrime){
                largestPrime = number;
            }
        }

        return largestPrime;
    }
}
