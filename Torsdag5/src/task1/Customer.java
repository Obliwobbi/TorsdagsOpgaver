package task1;

public class Customer {

    private String firstName;
    private String lastName;
    private String userName;
    private int id;
    static int counter;

    Customer (String firstName, String lastName, String userName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;

        counter += 1;
        this.id = counter;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    @Override
    public String toString(){
        String s = "Customer ID: "+id+"\nCustomer Username: "+userName+"\nCustomer Name: "+lastName+", "+firstName+"\n";
        return s;
    }

}
