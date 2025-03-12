package task2;

public class Main {
    public static void main(String[] args) {

        Cafe cafe = new Cafe();
        cafe.loadMenuData();

        for ( String c : cafe.getList()){
            System.out.println(c);
        }

    }
}
