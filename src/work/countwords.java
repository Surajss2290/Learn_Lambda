package work;
public class countwords {

    public static void main(String[] args) {
        String str = "Hello, this is a sample string with seven words.";
     String words[]=str.split(" ");
     for (int i=0;i<words.length;i++){
         System.out.println(words[i]);

     }
        System.out.println("No words in the Given string is "+words.length);
    }
}
