package MidtermCorrections;

import java.util.Scanner;
import java.util.Arrays;
public class StudentAlphabetical {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of students: ");
        int numberOfStudents = input.nextInt();
        input.nextLine();
        String[] studentName = new String[numberOfStudents];

        for (int i=0;i<numberOfStudents;i++){
            System.out.println("Enter a student name: ");
            studentName[i] = input.nextLine();
        }
        Arrays.sort(studentName);
        String firstName = studentName[0];
        System.out.println("The name that is first alphabetically is "+firstName);
    }
}
