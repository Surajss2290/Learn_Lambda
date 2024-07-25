package work;

import java.util.Scanner;

public class checkstringpalindrom {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        boolean result=checkpalindrom(str);
        if (result){
            System.out.println("String "+str+" is palindrom");
        }else{
            System.out.println("String "+str+" is not palindrom");
        }
    }

    private static boolean checkpalindrom(String s) {

        String A=new StringBuilder(s).reverse().toString();
        return  s.equals(A);
    }

}
