package work;

public class InnerDriver {
    public static void main(String[] args) {
        Innerclass.hello h=new Innerclass().new hello();
        System.out.println(h.name());
    }
}
