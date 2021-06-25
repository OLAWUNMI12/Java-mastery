public class DwarfPlanet extends HeavenlyBody{


    public DwarfPlanet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.DWARF_PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if(BodyTypes.MOON == moon.getKey().getBodyType()){
            return super.addSatellite(moon);
        }
        return false;
    }
}
