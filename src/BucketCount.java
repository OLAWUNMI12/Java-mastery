public class BucketCount {

    public static int getBucketCount(double width , double height , double areaPerBucket, int extraBuckets){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }
        double area = width * height;
        int numberOfBuckets = (int) Math.ceil(area/areaPerBucket);
        return numberOfBuckets - extraBuckets;
    }

    public static int getBucketCount(double width , double height , double areaPerBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }
        double area = width * height;
        return (int) Math.ceil(area/areaPerBucket);
    }

    public static int getBucketCount(double area , double areaPerBucket){
        if(area <= 0 || areaPerBucket <= 0){
            return -1;
        }
        return (int) Math.ceil(area/areaPerBucket);
    }


    public static void main(String[] args) {
        System.out.println(getBucketCount(0.75, 0.75));
    }
}
