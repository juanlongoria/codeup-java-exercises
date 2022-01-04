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

        int num = 100;

        do{
            System.out.println(num);
            num-= 5;
        } while(num >= -10);

        int z = 2;

        do {
            System.out.println(z);
            z = (int) Math.pow(z, 2);
        } while (z <= 1000000);

        for (int t = 100; t >= -10; t -= 5) {
            System.out.println(t);
        }

        for (long k = 2; k < 1000000; k *= k) {
            System.out.println(k);
        }


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

        boolean goOn = true;

        while (goOn) {
            System.out.println("Give me an integer:");
            int userNum = sc.nextInt();
            System.out.println("number|squared|cubed\n------|-------|-----");
            for (int j = 1; j <= userNum; j++) {
                System.out.printf("%6d|%7d|%5d%n", j, j*j, (int) Math.pow(j, 3));
            }
            System.out.println("Wanna play again?");
            goOn = sc.nextBoolean();
        }

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
