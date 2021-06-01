import java.util.Scanner;

public class HelloPerson {

    public static void main(String args[]) {
 
        String name = null;
        Scanner console = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = console.nextLine();
        System.out.println( "Hello " + name );
        console.close();
    }
 }