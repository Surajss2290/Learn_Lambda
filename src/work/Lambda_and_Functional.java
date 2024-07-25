package work;

interface A{
    void show();
}

public class Lambda_and_Functional {
    public static void main(String[] args) {
        //anonymous Inner class Use here (Inner class)
        A a=new A() {

    @Override
    public void show() {
        System.out.println("Hello from anonymous function");
    }
};
a.show();

// Lambda Expression is use here
A a1=()->{
    System.out.println("Hello from lambda first way");
};
a1.show();
//Lambda Expression is Define in one line
A a2=()-> System.out.println("Hello from lambda second way");
a2.show();
    }
}
