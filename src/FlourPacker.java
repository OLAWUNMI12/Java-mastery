public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return  false;
        }
        if(goal == 0 && (bigCount > 0 || smallCount > 0) ){
            return false;
        }
        int bigCountValue = 5;

        if(goal <= smallCount){
            return  true;
        }
        if(goal == (bigCountValue * bigCount)){
            return  true;
        }

        if((bigCount != 0)){
            if(goal > (bigCountValue * bigCount)){
                int remainder = goal - (bigCountValue * bigCount);
                if(remainder <= smallCount){
                    return  true;
                }
            }else{
                int remainder = goal % bigCountValue;
                if(remainder == 0 || remainder <= smallCount){
                    return true;
                }
            }
        }
       return  false;
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println( canPack(2,7,18));
    }

}
