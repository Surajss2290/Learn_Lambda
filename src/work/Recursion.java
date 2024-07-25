package work;

public class Recursion {
  //Print the numbers from 1 to 10 without for loop  (Recursion Example)
public  void mymethode(int a){
    if (a<=10){
        System.out.println(a);
        mymethode(a);
    }
}

    public static void main(String[] args) {
        Recursion l1=new Recursion();
        l1.mymethode(1);


    }
}
