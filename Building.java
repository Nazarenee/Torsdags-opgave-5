import java.util.ArrayList;
public class Building {
   private ArrayList<Room> rooms;
   private int numberofbathrooms;
   private int numberOfFloors;
   private boolean isOfficeBuilding;

    Building(ArrayList<Room> rooms, int numberofbathrooms, int numberOfFloors, boolean isOfficeBuilding) {
        this.numberofbathrooms = numberofbathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
this.rooms= rooms;


    }

    public ArrayList<Room> getrooms(){
        return rooms;
    }
    public int getnumberofbathrooms(){
        return numberofbathrooms;
    }

    public int getNumberOfFloors(){
        return numberOfFloors;
    }
    public boolean isOfficeBuilding(){
        return isOfficeBuilding;
    }
}

