package work;

public class AveArray {
    public static void main(String[] args) {
        int arr[]={10,20,54,85,63,50};
        int length=arr.length;
        int sum=0;
        for (int i=0;i<= arr.length-1;i++){
           sum =sum+arr[i];
        }
        System.out.println("Average "+sum/length);
    }
}
