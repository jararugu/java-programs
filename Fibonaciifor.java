import java.util.Scanner;

class Fibonaciifor{
    public static void main(String[] args) {
        int i,n,c,a=0,b=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        n = sc.nextInt();
        System.out.print(a+" "+b+" ");
        for( i=3;i<=n;i++){
            c = a + b;
            a=b;
            b=c;
            System.out.printf("%3d",c);
            
             
        }
    }
}