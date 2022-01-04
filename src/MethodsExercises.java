public class MethodsExercises {

    public static int getSum(int num1, int num2){
        return num1+num2;
    }

    public static int getDifference(int num1, int num2){
        return num1 - num2;
    }

    public static int getMultiplication(int num1, int num2){
        return num1*num2;
    }

    public static int getDivision(int num1, int num2){
        return num1/num2;
    }

    public static void main(String[] args) {
        System.out.println(getSum(3,5));
        System.out.println(getDifference(5,7));
        System.out.println(getMultiplication(8,9));
        System.out.println(getDivision(9,3));

    }
}
