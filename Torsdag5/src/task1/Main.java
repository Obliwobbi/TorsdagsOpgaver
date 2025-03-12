package task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(new Customer("Kylo","Ren","Kylo4th"));
        customers.add(new Customer("Luke","Skywalker","notMyFather"));
        customers.add(new Customer("Obi-Wan","Kenobi","elloThere"));
        customers.add(new Customer("Toby","Hartzberg","obli"));

       printCustomers(customers);

    }

    public static void printCustomers(ArrayList<Customer> customers){

        for (Customer c : customers){
            System.out.println(c);
        }

    }
}