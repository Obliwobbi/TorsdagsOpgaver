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

    public String getLasttName(){
        return lastName;
    }
    public void setLasttName(String lastName){
        this.lastName = lastName;
    }

    @Override
    public String toString(){
        String s = "";
        return s;
    }

}
