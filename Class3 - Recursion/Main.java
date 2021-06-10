import java.util.Scanner;

public class Main {
    static void towersOfHanoi(int disk, String fromTower, String toTower, String auxTower) {
        if (disk == 1) {
            System.out.println("Move disk " + disk + " from tower " + fromTower + " to tower " + toTower);
        } else {
            towersOfHanoi(disk - 1, fromTower, auxTower, toTower);
            System.out.println("Move disk " + disk + " from tower " + fromTower + " to tower " + toTower);
            towersOfHanoi(disk - 1, auxTower, toTower, fromTower);
        }       
    }

    public static void main (String args[]){
        int numberOfDisks = 0;
        Scanner console = new Scanner(System.in);

        System.out.print("Enter the number of disks: ");
        numberOfDisks = console.nextInt();
        towersOfHanoi(numberOfDisks, "A", "C", "B");
        console.close();
    }
    
}
