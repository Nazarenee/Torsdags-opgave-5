import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class Cafe {
ArrayList<String> coffeeMenu = new ArrayList<>();




public ArrayList<String> getcoffeeMenu(){
    return this.coffeeMenu;
}


public void loadMenuData() {
    File file = new File("src/coffees.txt");
    try {
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            coffeeMenu.add(scanner.nextLine());
        }

    } catch (Exception e) {
        System.out.println("jeg kan ikke finde din fil");
    }
}
}
