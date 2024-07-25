package work;

public class ReverseWordSentense {
    public static void main(String[] args) {
        String s="Hello suraj how are you";
        String arr[]=s.split(" ");

        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
