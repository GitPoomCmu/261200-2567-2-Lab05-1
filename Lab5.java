import java.time.LocalDate;
import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        User john = new User("John", 2000, 1, 10);
        john.displayInfo();

        Admin nicolas = new Admin("Nicolas", 1990, 6, 15);
        nicolas.displayInfo();
        nicolas.displayInfo(true);
        nicolas.displayInfo(false);
    }
}