// CoffeeDrink object class

class Drink {

    private int numberOfCups; //the way this is different from parameter numberOfCups is in scope
    private String drinkType;
    private boolean hasWhippedCream; //can be used to create parameters

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
    //goal: make numberOfCups visible (but not changeable) from other classes
    //in other words, a "getter" method
    public double getNumberOfCups(){
        return numberOfCups;
    }
    //goal: make # cups changeable from other classes
    //"setter" method
    public void setNumberOfCups(int n){
        numberOfCups = n;
    }
    public String getDrinkType(){
        return drinkType;
    }
    public void setDrinkType(String n){
        drinkType = n;
    }
    public boolean getHasWhippedCream(){
        return hasWhippedCream();
    }

    public void setHasWhippedCream(boolean n){
        return hasWhippedCream();
    }
}
