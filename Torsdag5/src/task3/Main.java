package task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Creating 3 different rooms of Room type
        Room room1 = new Room(2,4);
        Room room2 = new Room(3,1);
        Room room3 = new Room(4,2);

        //Creating an array with Room object and adding the 3 different rooms created
        ArrayList<Room> roomList = new ArrayList<>();
        roomList.add(room1);
        roomList.add(room2);
        roomList.add(room3);

        //Creating a building and adding the Array of 3 different rooms plus 4 floors.
        Building building1 = new Building(roomList,4);

        countLampsInBuilding(building1);
        countWindowsInBuilding(building1);
        int roomsInBuilding = countRoomsInBuilding(building1);
        System.out.println("Total number of rooms: "+roomsInBuilding);
        Boolean normal = isNormal(building1);
        System.out.println("Are there more rooms than floors? (Floors: "+building1.getNumberOfFloors()+"): "+normal);

    }

    public static void countLampsInBuilding (Building building){
        int totalLamps = 0;
        for (Room r : building.getRooms()){
            totalLamps += r.getNumberOfLamps();
        }
        System.out.println("Total number of lamps: "+totalLamps);

    }

    public static void countWindowsInBuilding (Building building){
        int totalWindows = 0;
        for ( Room r : building.getRooms()){
            totalWindows += r.getNumberOfWindows();
        }
        System.out.println("Total number of windows: "+totalWindows);
    }

    public static int countRoomsInBuilding(Building building){
        int totalRooms = 0;
        for ( Room r : building.getRooms()){
            totalRooms++;
        }
        //System.out.println("Total number of rooms: " + totalRooms);
        return totalRooms;
    }

    public static Boolean isNormal(Building building){
        Boolean normal = building.getNumberOfFloors() <= countRoomsInBuilding(building);
        return normal;
    }
}
