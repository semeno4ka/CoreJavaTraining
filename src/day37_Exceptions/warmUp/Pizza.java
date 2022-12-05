package day37_Exceptions.warmUp;

public class Pizza {

    private char size;
    private int numberOfCheeseTopping, numberOfPepperoniTopping;

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }
    public double calcCost(){
        double total=0;

        switch(size){
            case 'S': case's':total=10+2*(numberOfCheeseTopping+numberOfPepperoniTopping);break;
            case 'M': case'm':total=12+2*(numberOfCheeseTopping+numberOfPepperoniTopping);break;
            case'L':  case'l':total=14+2*(numberOfCheeseTopping+numberOfPepperoniTopping);break;
            default:
                System.out.println("Invalid pizza size: "+size);
        }

        return total;

    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Pizza)){
            System.err.println("Invalid object: "+obj);
            System.exit(1);
        }          // is performed 1st since it's in '()'
        if((size==( (Pizza)obj).size)){
                if(numberOfCheeseTopping==((Pizza)obj).numberOfCheeseTopping) {
                    if (numberOfPepperoniTopping == ((Pizza) obj).numberOfPepperoniTopping) {
                        return true;
                    }
                }// can be one condition, but can be nested to make it more readable
        }
        /*
        You can assign a variable for downcasted value
        Pizza pizza = (Pizza)obj;
        if (size == pizza.getsize() ) etc
         */
        return false;
    }

    public String toString() {
        return "Pizza{" +
                " size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                // you can modify toString any time and add and delete what you need
                ", total price= $" + calcCost() +
                '}';

    }
}
/*
1. Create a class named Pizza
			variables:
				size (char), numberOfCheeseTopping, numberOfPepperoniTopping

			Encapsulate all the fields

			Add a constructor that can set all the fields

			Methods:
				calcCost(): returns the total cost of the pizza

			Override toString method to print Pizza object info when the object is passed in the print statement

			Override equals method that returns true if the pizza object is equal to the specified pizza object

 */