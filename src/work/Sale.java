package work;

import java.util.Scanner;

public class Sale {



    public static void main(String[] args) {
        int list[]={10,20,30,40,50,60};
        int length=list.length-1;
        for (int i=0;i<=length;i++){
            Scanner s=new Scanner(System.in);
            System.out.println("Enter item Which u want to buy");
            int item=s.nextInt();



            if (item!=40&&item!=60&&item!=10){
                System.out.println("Item is not payable");
            } else {

                System.out.println("you are buying successfully buying item "+item);

                for(int j=0;j<length;j++){

                   if (list[i]==item){
                       System.out.println(list[i]);

                   }
                }




            }



        }
    }

}
