package util;

public class InputTest {
    public static void main(String[] args) {
        Input in = new Input();

                String unoReverse = in.getString();

                System.out.println(unoReverse);

               boolean answer = in.yesNo();
                System.out.println(answer);

                in.getInt(1, 10);

                in.getDouble(5.5, 15.5);

                in.getDouble();
                in.getInt();


//        in.getString("Please enter your first and last name.");


    }
}
