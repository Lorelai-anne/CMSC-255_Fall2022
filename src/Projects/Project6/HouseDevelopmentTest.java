package Projects.Project6;

public class HouseDevelopmentTest {
    public static void main(String[] arg){
        /**
         * creates our objects development with 3 objects and
         * House with 3 objects
         */
        Development development[] = new Development[2];
        House house[] = new House[3];

        /**
         * calls upon our development objects with parameters
         */
        development[0] = new Development("Freeze Zone","North Polar Ice Cap",2023,20);
        development[1] = new Development("Crater Field","Korolev crater",2072,100);

        /**
         * populates the development object with our house objects by
         * using the addHouse method in the development class
         */
        development[0].addHouse(new House("Caroline Budwell",15,2754.99, Bedrooms.TWO_BEDROOM,Baths.TWO,Color.GREEN));
        development[0].addHouse(new House("Sam Zu",2,2500.00, Bedrooms.THREE_BEDROOM, Baths.THREE, Color.WHITE));
        development[1].addHouse(new House("Zach Whitten",27,789.45, Bedrooms.STUDIO, Baths.ONE, Color.GRAY));

        /**
         * prints both development objects using the toString method
         */
        System.out.println(development[0].toString());
        System.out.println(development[1].toString());
    }
}
