import java.sql.SQLOutput;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        //1.
        //a.
        int i=5;
        while(i<=15) {
            System.out.print(i+ "");
            i++;
        }

        System.out.println();

        int num = 0;

        do{
            System.out.println(num);
            num-= 5;
        } while(num >= -10);


//        for (int i = 5; i <= 15; i++) {
//            System.out.print(i);
//        }
        //b.
//        Scanner sc = new Scanner(System.in);
//        int i=0;
//        do {System.out.println(i++);
//            i++;
//        }while(i<=100);

//        int i=100;
//            do {
//                System.out.println(i);
//                i--;
//            } while (i >= -10);

//            int i=2;
//            do {System.out.println(i);
//                i--;
//            } while (i>=-10);

        //2.
        for (int fb = 1; fb <= 100; fb++)
        {
            if (((fb % 5) == 0) && ((fb % 3) == 0)) // Is it a multiple of 5 & 7?
                System.out.println("fizzbuzz");
            else if ((fb % 5) == 0) // Is it a multiple of 5?
                System.out.println("fizz");
            else if ((fb % 3) == 0) // Is it a multiple of 7?
                System.out.println("buzz");
            else
                System.out.println(fb); // Not a multiple of 5 or 7
        }

        //3.
        Scanner sc = new Scanner(System.in);




        //4.
        boolean continueGrading = true;

        while(continueGrading) {
            System.out.println("Give me a grade:");
            int grade = sc.nextInt();
            if(100>=grade && grade >= 88) {
                System.out.println("A");
            } else if (grade <= 87 && grade >= 80) {
                System.out.println("B");
            } else if (grade <= 79 && grade >= 67) {
                System.out.println("B");
            } else if (grade <= 66 && grade >= 60) {
                System.out.println("B");
            } else {
                System.out.println("F");
            }
        }













    }
}
