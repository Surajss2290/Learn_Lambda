package work;

public class StrtoInt {
    //Convert String int without using parseInt methode
    public static void main(String[] args) {
        String s="1555";
        int num=0;
        
        for (int i=0;i<s.length();i++){

            num=num*10 +((int)s.charAt(i)-48);
        }
        System.out.println(num+5);
    }
}
