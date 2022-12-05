package day18_GarbageCollection;

public class Pizza {

    public char size;


    public int numberOfCheeseTopping, numberOfPepperoniTopping;

    // calculates the total price and returns it in double
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

    public void setInfo(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping){
        this.size=size;
        this.numberOfCheeseTopping=numberOfCheeseTopping;
        this.numberOfPepperoniTopping=numberOfPepperoniTopping;
    }


    // required in order to be printed.Is a must. What you have here, gets printed
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                // you can modify toString any time and add and delete what you need
                ", total price= $" + calcCost() +
                '}';

    }

    }

