package finalexam2015q3;

import java.util.Scanner;

public class FinalExam2015Q3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int no = in.nextInt();

        int reversed = 0;
        while (no != 0) {
            reversed = reversed * 10 + (no % 10);
            no = no / 10;
        }
        System.out.println(reversed);
    }

}
