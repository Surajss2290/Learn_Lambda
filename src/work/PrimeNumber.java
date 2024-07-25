package work;
public class PrimeNumber {
    public static void main(String[] args) {
        int a= 15;
        int flag=0; //Initialization
        for(int i=2; i<=a-1; i++)
//2<=5...3<=5...4<=5...5<=5...6<=5 (false)
        {
            if(a%i==0) //6%2=0...6%3=0...6%4=2...6%5=1
            {
                flag =1;
            }
        }
        if(flag==0)
        {
            System.out.println(a+" Its a Prime Number");
        }
        else
        {
            System.out.println(a+" Its not Prime Number");
        }
    }
}
