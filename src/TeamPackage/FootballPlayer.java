package TeamPackage;

public class FootballPlayer extends Player {

    public FootballPlayer(String name) {
        super(name);
    }

    @Override
    public void identify() {
        super.identify();
        System.out.println(getName() + " a football player");
    }
}
