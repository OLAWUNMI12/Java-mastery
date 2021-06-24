/*
    Do not change anything in this class
*/

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description,  Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        this.exits = exits != null ? new HashMap<>(exits) : new HashMap<>();
        this.exits.put("Q", 0);
    }


    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}