import java.util.Scanner;
class Pefect{
    public static void main(String[] args) {
        int n;
        int i = 1;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        n = sc.nextInt();
        while(i<n)
        {
            if(n%i==0)
            {
                sum = sum+i;

             }
            i++;

        }
        if(sum==n)
        {
            System.out.println(i+ "is a perfect number");

        }
        else{
            System.out.println(i+ "is not perfect numer");
        }
    }
}