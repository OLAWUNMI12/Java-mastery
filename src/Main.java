/*
    Only add/edit code where it is stated in the description.
*/

import java.util.*;

public class Main {
    private Map<Integer, Location> locations = new HashMap<Integer, Location>();
    private Map<String, String> vocabulary = new HashMap<>();



    public Main() {
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java",null));

        Map<String, Integer> tempExits = new HashMap<>();
        tempExits.put("W", 2);
        tempExits.put("E", 3);
        tempExits.put("S", 4);
        tempExits.put("N", 5);
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building", tempExits));

        tempExits = new HashMap<>();
        tempExits.put("N", 5);
        locations.put(2, new Location(2, "You are at the top of a hill", tempExits));

        tempExits = new HashMap<>();
        tempExits.put("W", 1);
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring", tempExits));

        tempExits = new HashMap<>();
        tempExits.put("N", 1);
        tempExits.put("W", 2);
        locations.put(4, new Location(4, "You are in a valley beside a stream", tempExits));

        tempExits = new HashMap<>();
        tempExits.put("S", 1);
        tempExits.put("W", 2);
        locations.put(5, new Location(5, "You are in the forest", tempExits));

    }

    public void command() {
        // write code here
        Scanner scanner = new Scanner(System.in);
        vocabulary.put("SOUTH", "S");
        vocabulary.put("NORTH", "N");
        vocabulary.put("WEST", "W");
        vocabulary.put("EAST", "E");
        vocabulary.put("QUIT", "Q");
        int locationId = 1;
        while(true){
            Map<String, Integer> exits = null;
            System.out.println(locations.get(locationId).getDescription());
            if(locationId == 0){
                break;
            }
            exits = locations.get(locationId).getExits();
            System.out.print("Available exits are ");
            for(String key : exits.keySet()){
                System.out.print(key + ", ");
            }
            System.out.println();
            String location = scanner.nextLine().toUpperCase();
            List list  = Arrays.asList(location.split(" "));
            String key = "" ;
            if(list != null && list.size() > 0){
                for(String route : vocabulary.keySet()){
                    if(list.contains(route)){
                        key = vocabulary.get(route);
                        break;
                    }
                }
            }

            if(exits.containsKey(key)){
                locationId = exits.get(key);
            }else {
                System.out.println("You cannot go in that direction");
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.command();
    }
}