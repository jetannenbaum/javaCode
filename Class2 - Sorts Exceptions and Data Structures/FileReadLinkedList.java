import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class FileReadLinkedList {
    public static void main(String args[]) {
        String filename = null;
        LinkedList linkedList = new LinkedList();
        Scanner console = new Scanner(System.in);
        Scanner textFile = null;
        Integer idx = 0;
        Boolean fileRead = false;
        linkedList.head = null;
        LinkedList.Node prevNode = null;

        System.out.print("Enter the filename: ");
        filename = console.nextLine();

        try {
            File file = new File(filename);
            textFile = new Scanner(file);
            while (textFile.hasNextLine()) {
                LinkedList.Node currNode = new LinkedList.Node(textFile.nextLine());
                if (linkedList.head == null) {
                    linkedList.head = currNode;
                    prevNode = currNode;
                }
                else {
                    prevNode.next = currNode;
                    prevNode = currNode;
                }
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
            System.out.println();
            System.out.println("The sorted list of names");
            LinkedList sortedList = LinkedBubbleSort.sort(linkedList);
            LinkedList.Node n = sortedList.head;
            while (n != null) {
                idx = idx + 1;
                System.out.println("Name[" + idx + "]: " + n.name);
                n = n.next;
            }
        }
    }
}
