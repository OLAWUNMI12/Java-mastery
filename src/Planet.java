public class Planet extends HeavenlyBody{
    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }
    // write code here

    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if(BodyTypes.MOON == moon.getKey().getBodyType()){
            return super.addSatellite(moon);
        }
        return false;
    }
}