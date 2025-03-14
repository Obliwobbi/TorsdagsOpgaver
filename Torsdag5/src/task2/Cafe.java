package task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {

    //Attribute(s) in class:
    private ArrayList<String> coffeeMenu = new ArrayList<>();

    //No constructor made here since we're only creating a simple list.

    //Going on to methods
    public ArrayList<String> getList (){
        return coffeeMenu;
    }

    public void loadMenuData(){

        try {
            File file = new File("Torsdag5/data/coffee.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                coffeeMenu.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not found",e);
            // Rettet fra nedenstående under undervisningen med Tobias
            // System.out.println("File not found");
        }


    }


}
