package work;

public class Bubblesort {
    public static void main(String[] args) {
        int arr[]={1,5,3,10,2};
        int temp=0;
        System.out.println("Before sorting");
        for(int numbers:arr){
            System.out.print(numbers+" ");
        }

        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("After sorting");
        for (int n:arr){
            System.out.print(n+" ");
        }
    }
}
