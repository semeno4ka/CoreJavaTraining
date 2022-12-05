package day36_ReferenceTypeCasting.warmUp;

import day26_Statics.Iphone;
import day30_Constructor.phoneTask.IPhone;
import day30_Constructor.phoneTask.Nokia;
import day30_Constructor.phoneTask.Phone;
import day30_Constructor.phoneTask.Samsung;
import day33_Abstraction.employeeTask.Developer;

public class PhoneTask {
    public static void main(String[] args) {

        Phone[] phones = {
                new IPhone("Iphone 11 Pro", "Large", "Black", 900),
                new IPhone("Iphone 12 Pro Max", "Large", "Black", 1200),
                new IPhone("Iphone 9", "Medium", "Gold", 800),
                new Samsung("Galaxy S19", "Medium", "Pink", 700),
                new Samsung("Galaxy S20", "Large", "Silver", 850),
                new Samsung("Galaxy S21", "Large", "Gold", 950),
                new Nokia("XR20", "Small", "Black", 350),
                new Nokia("G10", "Medium", "Pink", 99),
                new Nokia("G50", "Large", "Silver", 250),
                new IPhone("Iphone 12 Pro", "Large", "Black", 1200),
                new IPhone("Iphone 11 Pro Max", "Large", "Silver", 1100),
                new Samsung("Galaxy S18", "Medium", "White", 750),
                new Samsung("Galaxy S17", "Large", "Silver", 650),
                new Nokia("G10", "Medium", "Black", 99),
                new IPhone("Iphone 6", "Small", "Gold", 400),
                new IPhone("Iphone 7", "Small", "White", 500)
        };

        for (Phone each : phones) {
            System.out.println(each.getModel() + " - " + each.getColor() + " - " + each.getPrice());
        }
        int iphoneCount = 0, samsungCount = 0;
        for (Phone each : phones) {
            if (each instanceof IPhone) {
                iphoneCount++;
            }
            if (each instanceof Samsung) {
                samsungCount++;
            }
        }
        System.out.println(iphoneCount);
        System.out.println(samsungCount);

       /* for (Phone each : phones) {
            if(each instanceof IPhone && each.getPrice()>700){
                System.out.println(each);
            }else if(each instanceof Samsung && each.getPrice()>700){
                System.out.println(each);
            }
        }*/
        for (Phone each : phones) {
            if ((each instanceof IPhone || each instanceof Samsung ) && each.getPrice() >= 700) {
                System.out.println(each.getModel());
            }
        }

        // ==, .equals

    }
}
/*
print the model, color and price of each phone object in the following format
    				model - color - price

	2. How many Iphones in the array of phones?

	3. How many Samsung in the array of phones?

	4. Display the models of Iphones and samsung that has the price of 700 or greater
 */