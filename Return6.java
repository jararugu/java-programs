class Return6{

    static boolean isEven(int n){
         if(n % 2 == 0)
         {
            return true;    // multiple return type statements accpets only used in  conditions statements                 
         }
         else{
             return false; /// int n = test(false); -------> prints----> n value is false;
         }
     }
     public static void main(String[] args) {
         System.out.println("main method started");
         System.out.println(" 10 is even number:" +isEven(10)); 
 
         System.out.println("main methos ended");
 
 
     }
 }