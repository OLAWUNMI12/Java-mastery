public class Moon extends HeavenlyBody{

    public Moon(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.MOON);
    }

    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if(BodyTypes.MOON == moon.getKey().getBodyType()){
            return super.addSatellite(moon);
        }
        return false;
    }
}
