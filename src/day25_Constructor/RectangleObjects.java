package day25_Constructor;

import org.w3c.dom.css.Rect;

public class RectangleObjects {
    public static void main(String[] args) {

        // Using setInfo instead of Predefined Constructor
       /* Rectangle obj1 = new Rectangle();
        obj1.setInfo(3,4);
        Rectangle obj2 = new Rectangle();
        obj2.setInfo(3,1);
        Rectangle obj3 = new Rectangle();
        obj3.setInfo(3,3);
        Rectangle obj4 = new Rectangle();
        obj4.setInfo(4,4);
        Rectangle obj5 = new Rectangle();
        obj5.setInfo(4,3);

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj4);
        System.out.println(obj5);*/

        Rectangle obj1 = new Rectangle(4,6);// with a constructor passing parameters is mandatory from now on
        System.out.println(obj1);
        Rectangle obj2 = new Rectangle(6,6);
        Rectangle obj3 = new Rectangle(2,12);
        Rectangle obj4 = new Rectangle(1,4);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj4);



    }
}
