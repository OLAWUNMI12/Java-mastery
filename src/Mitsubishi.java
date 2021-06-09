public class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " engine Starting";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() +  " accelerating";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " is breaking";
    }
}
