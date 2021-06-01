import java.util.Scanner;

public class SortedNameList {

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

        for (int i = 0; i < nameList.length - 1; i++) {
            for (int j = 0; j < nameList.length - i - 1; j++) {
                if (nameList[j].compareTo(nameList[j+1]) > 0) {
                    String tempName = nameList[j];
                    nameList[j] = nameList[j+1];
                    nameList[j+1] = tempName;
                }
            }
        }
        System.out.println();
        System.out.println("The sorted " + nameList.length + " names");
        for (int i = 0; i < nameList.length; i++) {
            idx = i + 1;
            System.out.println("Name[" + idx + "]: " + nameList[i]);
        }
        console.close();
    }
 }