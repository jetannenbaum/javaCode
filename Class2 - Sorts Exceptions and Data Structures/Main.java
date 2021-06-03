import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
 
        String[] nameList = new String[6];
        Scanner console = new Scanner(System.in);
        Integer idx = 0;

        System.out.println("Enter " + nameList.length + " names");
        for (int i = 0; i < nameList.length; i++) {
            idx = i + 1;
            System.out.print("Name[" + idx + "]: ");
            nameList[i] = console.nextLine();
        }

        nameList = InsertionSort.sort(nameList);

        System.out.println();
        System.out.println("The sorted " + nameList.length + " names");
        for (int i = 0; i < nameList.length; i++) {
            idx = i + 1;
            System.out.println("Name[" + idx + "]: " + nameList[i]);
        }
        console.close();
    }
 }