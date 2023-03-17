import java.util.Scanner;
class Factorialnumber{
            public static void main(String[] args){
			    int n,fact=1;
				Scanner s = new Scanner(System.in);
				System.out.println("enter a number");
				n = s.nextInt();
			 
				for(int i=1;i<=n;i++)
				{
					fact = fact*i;
		
					
					

						
				}
									System.out.println(fact);

									//System.out.println("the factorial of "+n+" is",+fact);


			}
}