import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Boolean confirmation = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey I'm Bob, have a conversation with me, ask or tell me anything");
        do {
            String response = sc.nextLine();
            if(response.endsWith("?")){
                System.out.println("Sure.");
            } else if(response.endsWith("!")){
                System.out.println("Whoah, chill out!");
            } else if(response.isEmpty()){
                System.out.println("Fine. Be that way!");
            } else if(response.contains("bye")){
                System.out.println("Bye");
                confirmation = false;
            } else {
                System.out.println("Whatever");
            }

        }while(confirmation);

//        String q ="";
//        String a1 ="Sure";
//        String a2 ="Whoa, chill out!";
//        String a3 ="Fine, be that way!";
//        String a4 ="Whatever";
//
//        System.out.println("Hey I'm Bob, have a conversation with me, ask or tell me anything");
//        String userQuestion = sc.nextLine();
//
//
//        char lastKeyOnQuestion = q.charAt(q.length() -1);
//            for (userQuestion) {
//                if (lastKeyOnQuestion ==? ) {
//                    System.out.println(a1);
//                } else if (q== q.ends.with) {
//                    System.out.println(a2);
//                } else if (q=="") {
//                    System.out.println(a3);
//                } else {
//                    System.out.println(a4);
//                }
//            }
//
//        }






    }
}
