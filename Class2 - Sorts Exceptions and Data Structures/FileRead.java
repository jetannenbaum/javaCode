import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class FileRead {
    public static void main(String args[]) {
        String filename = null;
        String[] nameList = new String[6];
        Scanner console = new Scanner(System.in);
        Scanner textFile = null;
        Integer idx = 0;
        Boolean fileRead = false;

        System.out.print("Enter the filename: ");
        filename = console.nextLine();

        try {
            File file = new File(filename);
            textFile = new Scanner(file);
            for (int i = 0; i < nameList.length; i++) {
                nameList[i] = textFile.nextLine();
            }
            fileRead = true;
        }
        catch (FileNotFoundException e) {
            System.out.println(filename + " was not found");
        }
        catch (Exception e) {
            System.out.println(e.getMessage() + " error while reading from file " + filename);
        }
        finally {
            if (textFile != null) {
                try {
                    textFile.close();
                }
                catch (Exception e) {
                    System.out.println("Error closing file");
                }
            }
        }
        console.close();

        if (fileRead) {
            nameList = BubbleSort.sort(nameList);
            System.out.println();
            System.out.println("The sorted list of " + nameList.length + " names");
            for (int i = 0; i < nameList.length; i++) {
                idx = i + 1;
                System.out.println("Name[" + idx + "]: " + nameList[i]);
            }
        }
    }
}
