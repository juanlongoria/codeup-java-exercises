public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello ");
        System.out.print("World!");
        //Will this be read?

        short month = 200;
        System.out.println(month);

        short daysInYear = 365;
        System.out.println(daysInYear);

        System.out.println('I');

        //t=tab instead of n = new line or \\ gives us only one slash
        System.out.println("Hello\nThere!");

        String greeting="Hello, welcome to my blog!";

        String name;

        name = "Jay";

        System.out.println(greeting);

        //add on f after
        float pi = 3.14f;

//double up to 16, checkout lesson for definitions
//        double pi = 3.149485734857;

        System.out.println(pi);

        //cannot reassign the value of a final variable.
        final String APIKEY = "laskjdf;ajsdfl;jasdf;lj";

//        APIKEY = "sdrljgdflkgj";

        int firstNumber = 20;
        int secondNumber = 20;


        //returns negative number due to int data type reaching MAX VALUE.
        System.out.println(secondNumber % firstNumber);
        System.out.println(firstNumber + secondNumber);

        int increment = 0;
        increment++;
        System.out.println(increment);

        int decrement = increment;

        decrement--;

        System.out.println(decrement);

        decrement += 5;

        System.out.println(decrement);


        //CASTING

        byte dayOfMonth = 14;
        byte birthday = 24;

        System.out.println(dayOfMonth * birthday);

        //-----SYNTAX, DATA TYPES, AND VARIABLES EXERCISE------
        //1.
        int myFavoriteNumber = 8;

        System.out.println(myFavoriteNumber);

        //2., 3., 4.
        String myString="This is my string!";
//        String myString='c'; causes Error
//        String myString=3.14159; causes Error

        System.out.println(myString);

        //5.

//        long myNumber Creates Error

//        System.out.println(myNumber);

        //6.
//        long myNumber=3.14; creates error

        //7.
//        long myNumber=123L;

        //8.
//        long myNumber=123;

//        System.out.println(myNumber);

//        decimal does not compile?

        //9.
        float myNumber=(float)3.14;
//        float myNumber=3.14f;
//put an f behind float
        System.out.println(myNumber);

        //10.
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
//first example x gets incremented after printing
//second example x get incremented before printing

        //11.
//        String class="GoodBye"; Does not work

        //12.
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        int three = (int) "three";
//
//        System.out.println(three);

        //Errors

        //13.Rewrite the following expressions using the relevant shorthand assignment operators:

//        int x = 4;
//            x += 5;
////        x = x + 5;
//        System.out.println(x);
//
//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);
//        y = y * x;
//
        int x = 10;
        int y = 2;
        x/=y;
        y-=x;
//        x = x / y;
//        y = y - x;

        System.out.println(x);
        System.out.println(y);

        //14. Errors, number too large,compile error.
        //byte biggerInt = 129;

//        System.out.println(Integer.Max_VALUE);

        MethodsLecture.leaveTheHouse();




    }
    //This is a comment that reads words
}
