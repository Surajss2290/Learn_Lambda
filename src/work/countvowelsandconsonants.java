package work;

public class countvowelsandconsonants {
    public static void main(String[] args) {
        String lower="Hello@My$name is suraj";
        String str=lower.toLowerCase();
        int vCount=0;
        int cCount=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)!=' '){
                if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                    vCount++;
                } else if (str.charAt(i)>'a' && str.charAt(i)<'z') {
                    cCount++;
                }

            }
        }
        System.out.println("Vowel count is "+vCount);
        System.out.println("Consonants count is "+cCount);
    }
}
