package day25_Constructor;

public class Rectangle {

    public double length,width;
  //Shortcut for Constructor:generate-> Constructor
    public Rectangle( double length, double width){
        this.length=length;
        this.width=width;
    }

    public double area(){
        return length*width;
    }

    /*  No need for setInfo anymore
    public void setInfo(double length, double width){
        this.length=length;
        this.width=width;
    }*/
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + area() +
                '}';
    }
}
