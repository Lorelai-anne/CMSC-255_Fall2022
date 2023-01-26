package MidtermCorrections;

import java.util.Scanner;
public class BonusQuestionSeats {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the section: ");
        String section = input.nextLine().toLowerCase();
        System.out.println("Enter your day: ");
        String day = input.nextLine().toLowerCase();
        int price = 25;

        if (section.equals("balcony")){
            price -= 5;
        }
        if (!day.equals("saturday")){
            price -= 3;
        }
        System.out.println(price);
    }
}
