public class Cylinder extends Circle {

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height < 0 ? 0 : height ;
    }

    private double height;

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return getArea() * getHeight();
    }
}
