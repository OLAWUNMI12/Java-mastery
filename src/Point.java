public class Point {

    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        return distance(new Point(0,0));
    }

    public double distance(int x , int y){
        this.x = x;
        this.y = y;
        return distance(new Point(0,0));
    }

    public double distance(Point point){
        return Math.sqrt((Math.pow(point.getX()- getX(),2)) + (Math.pow(point.getY() - getY(),2)));
    }

    public static void main(String[] args) {
        System.out.println(new Point().distance(6,5));
    }}
