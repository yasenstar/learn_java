package initial;

public class Fruit {
    public static void main(String[] args) {
        // Declare and initialize three variables
        int numOranges = 5;     // Count of oranges
        int numApples = 10;     // Count of apples
        int numFruit = 0;       // Count of fruit

        numFruit = numOranges + numApples;      // Calculate the total fruit count

        // Display the result
        System.out.println("A total fruity program");
        System.out.println("Total oranges is " + numOranges);
        System.out.println("Total apples is " + numApples);
        System.out.println("Total fruit is " + numFruit);

        /*
        // Code to delay ending the program
        System.out.println("(Press Enter to exit)");
        try {
            System.in.read();           // Read some input from the keyboard
        } catch (IOException e) {       // Catch the input exception
            return;                     // and just return
        }
        */
    }
}
