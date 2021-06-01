import java.util.Scanner;

public class SortedNameListMethod {

    public static String[] sortStrings(String[] stringList) {
        int listLen = stringList.length;

        for (int i = 0; i < listLen - 1; i++) {
            for (int j = 0; j < listLen - i - 1; j++) {
                if (stringList[j].compareTo(stringList[j+1]) > 0) {
                    String tempName = stringList[j];
                    stringList[j] = stringList[j+1];
                    stringList[j+1] = tempName;
                }
            }
        }
        return stringList;
    }

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

        nameList = sortStrings(nameList);

        System.out.println();
        System.out.println("The sorted " + nameList.length + " names");
        for (int i = 0; i < nameList.length; i++) {
            idx = i + 1;
            System.out.println("Name[" + idx + "]: " + nameList[i]);
        }
        console.close();
    }
 }