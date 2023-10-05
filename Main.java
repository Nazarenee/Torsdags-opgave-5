import java.sql.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Room r1 = new Room(2, 5, 3);
        Room r2 = new Room(6, 9, 6);
        Room r3 = new Room(4, 1, 7);

        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(r1);
        rooms.add(r2);
        rooms.add(r3);

        Building b1 = new Building(rooms, 4, 4, true);

        System.out.println(countLampsInBuilding(b1));
        System.out.println(isNormal(b1));

    }

    public static int countLampsInBuilding(Building b) {
        ArrayList<Room> rooms =b.getrooms();
        int sum = 0;
        for (Room s : rooms) {
            sum += s.getNumberoflamps();
        }
        return sum;
    }

    public static boolean isNormal(Building b) {
        int numberoffloors = b.getNumberOfFloors();
        int numberofrooms = b.getrooms().size();
        if (numberoffloors > numberofrooms) {
            return true;
        } else {
            System.out.println("skørt");
            return false;
        }
    }

}
