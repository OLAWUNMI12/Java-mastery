package TeamPackage;

public class BasketBallPlayer extends Player {

    public BasketBallPlayer(String name) {
        super(name);
    }

    @Override
    public void identify() {
        super.identify();
        System.out.println(getName() + " a basket ball player");
    }
}
