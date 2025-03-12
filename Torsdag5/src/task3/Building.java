package task3;

import java.util.ArrayList;

public class Building {

    private ArrayList<Room> rooms = new ArrayList<>();
    private int numberOfFloors;

    public Building (ArrayList<Room> room, int numberOfFloors){

        this.rooms = room;
        this.numberOfFloors = numberOfFloors;

    }

    //Getter and setter for rooms
    public ArrayList<Room> getRooms (){
        return this.rooms;
    }
    public void setRooms (ArrayList<Room> rooms){
        this.rooms = rooms;
    }

    // Getter and setter for numberOfFloors
    public int getNumberOfFloors (){
        return this.numberOfFloors;
    }
    public void setNumberOfFloors (int numberOfFloors){
        this.numberOfFloors = numberOfFloors;
    }

}
