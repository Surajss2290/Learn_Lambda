package work;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String str=null;
        //Making Optional class
        Optional<String> optional=Optional.ofNullable(str);

        System.out.println(optional.orElse("no value"));

    }
}
