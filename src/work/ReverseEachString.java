package work;

public class ReverseEachString {
    public static void main(String[] args) {
        String a = "Hello I am Sourabh";
        String[] word =a.split(" ");
           for (int i= word.length-1;i>=0;i--){
               System.out.print(word[i]+" ");
           }
        }
    }
