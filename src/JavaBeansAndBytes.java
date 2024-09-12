import java.util.Random;

/**
 * CS2 Review Assignment!
 * Do NOT use ChatGPT or any other generative AI to assist you with this assignment
 * You may reference your own past work and the internet (not including AI)
 */

public class JavaBeansAndBytes {

    // Variables for the CoffeeShop
    String name;
    boolean isOpen;
    int yearFounded;

    public static void main(String[] args) {
        // Create a new CoffeeShop instance to run everything.
        JavaBeansAndBytes cafe = new JavaBeansAndBytes();
    }

    // Constructor for CoffeeShop
    public JavaBeansAndBytes() {
        name = "Java Beans & Bytes: The Code Café";
        isOpen = true;
        yearFounded = 1995;

        System.out.println("Welcome to " + name + "!"); //string concatenation
        if (isOpen) {
            System.out.println("We are open!");
        } else {
            System.out.println("We are closed :(");
        }
        System.out.println("We were founded in " + yearFounded + ".");

        // TODO
        // Update the year founded and print the new yearFounded in a sentence
        yearFounded = 2007;
        System.out.println("We were founded in " + yearFounded + ".");
        // Calling methods
        randomDiscount();
        // TODO
        // Add parameter to specialOfTheDay (drink of your choice)

        specialOfTheDay("hot chocolate");
        countCups();
        baristasChoice();

        // TODO
        // Create two CoffeeDrink objects

        // TODO
        // Print out the order details


    }

    // Method to generate a random discount
    public void randomDiscount() {
        // TODO
        // Make this method generate a random integer discount (0-30%)
        // and print the result.
        int discount = (int)(Math.random()*31);
        System.out.println("The discount is " + discount + "%");


    }

    // Method with a parameter for the special of the day
    public void specialOfTheDay(String special) {
        // TODO
        // Make this method accept a parameter representing the day’s special.
        // Print the day's special.
        System.out.println("Today's special is " + special);
    }

    // Method to show loops
    public void countCups() {
        System.out.println("Counting cups sold today:");
        // TODO
        // Write three different for loops that print the indicated numbers:

        // Print 1 to 5
        for (int c = 1; c < 6; c++){
            System.out.print(c + "\n");
        }

        // Print 2, 5, 8, 11
        for (int c = 2; c <= 11; c = c+3){
            System.out.print(c + ", ");
        }

        // Print 8 to 0
        for (int c = 8; c >= 0; c--){
            System.out.print(c + "\n");
        }
    }

    // Method to recommend a coffee based on a random number
    public void baristasChoice() {
        // TODO
        // Make this method generate a random decimal between 0 and 1
        // and print one of four drink recommendations based on its value.

    }
}

