package work;

public class Longwordfromsentense {

                      //Find the Long word from the sentense
    public static void main(String[] args) {
        String a = "Hello My namesss is surajss";


        String word = "", Lword = "";
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (Character.isWhitespace(ch)) {
                if (Lword.length()< word.length()) {
                    Lword = word;

                }
                word="";

            } else {
              word=word+ch;

            }

        }

        if (Lword.length()<word.length()){
            Lword=word;
        }
        System.out.println("Largest word from the sentense is " +Lword);
    }
}
