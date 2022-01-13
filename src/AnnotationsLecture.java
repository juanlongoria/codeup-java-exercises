import util.Input;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")
public class AnnotationsLecture {

    @Deprecated
    public static String welcome(String name) {
        return "Hello from " + name;
    }

    public static String greeting(String name) {
        return String.format("Greetings from %s.", name);
    }

    @SuppressWarnings("unchecked")
    public List<String> languages() {
        return new ArrayList();
    }

    public static void main(String[] args) {
        System.out.println(welcome("Jeb"));
        AnnotationsLecture lec = new AnnotationsLecture();
        Input in = new Input();
        int num = in.getInt();
        System.out.println(num/0);
//        List langs = lec.languages();
//        langs.add("Timmy");
//        langs.add(7);
//        langs.forEach((el)->System.out.println(el));
    }

}
