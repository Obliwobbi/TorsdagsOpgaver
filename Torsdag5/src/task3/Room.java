package task3;

public class Room {

    private int numberOfLamps;
    private int numberOfWindows;

    public Room (int numberOfLamps, int numberOfWindows){

        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;

    }

    //Getters and setters for numberOfLamps
    public int getNumberOfLamps (){
        return numberOfLamps;
    }
    public void setNumberOfLamps(int numberOfLamps){
        this.numberOfLamps = numberOfLamps;
    }

    //Getters and setters for numberOfWindows
    public int getNumberOfWindows(){
        return numberOfWindows;
    }
    public void setNumberOfWindows(int numberOfWindows){
        this.numberOfWindows = numberOfWindows;
    }


}
