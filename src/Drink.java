// CoffeeDrink object class

class Drink {

    int numberOfCups; //the way this is different from parameter numberOfCups is in scope
    String drinkType;
    boolean hasWhippedCream; //can be used to create parameters

    // Constructor for CoffeeDrink class
    public Drink(int numberOfCups, String drinkType, boolean hasWhippedCream) {
        // TODO
        // Edit this constructor to accept three parameters,
        // one for each CoffeeDrink variable.
        // Assign those parameter values to the class-wide variables.
        this.numberOfCups = numberOfCups;
        this.drinkType = drinkType;
        this.hasWhippedCream = hasWhippedCream;
    }

    //another Drink constructor
    public Drink(){
        drinkType = "coffee";
        numberOfCups = 1;
        hasWhippedCream = false;
    }

    //Drink constructor that takes in a number of cups parameter
    //but has "coffee" and false as defaults for other variables
    public Drink(int numberOfCups){
        drinkType = "matcha";
        hasWhippedCream = true;
    }

    // Method to print information about the CoffeeDrink
    public void printInfo() {
        System.out.println(numberOfCups);
        // TODO
        // Make this method print order details.
        // Include information stored in each variable.
        System.out.print("You ordered " + numberOfCups + " cups of " + drinkType);
        if (hasWhippedCream == true){
            System.out.println(" with whipped cream.");
        }
        else{
            System.out.println(" without whipped cream.");
        }
    }
}
