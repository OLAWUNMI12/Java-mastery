package TeamPackage;

public class Player {

    private String name ;

    public Player(String name) {
        this.name = name;
    }

    public void identify(){
        System.out.println("I am a TeamPackage.Player and I am " + name );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
