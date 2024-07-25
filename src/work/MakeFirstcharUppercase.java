package work;

public class MakeFirstcharUppercase {

    //Making first Character Uppercase (Camelcase)
    public static void main(String[] args) {
        String s="hello suraj Suraj";
        String[] str=s.split(" ");

        for (String word:str){
            System.out.print(word.substring(0,1).toUpperCase()+word.substring(1,word.length())+" ");
        }

    }
}
