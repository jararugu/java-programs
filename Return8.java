class Return8{

    static boolean test(int n){
         if(n > 10)
         {
            System.out.println("number is belo 10 "); // error: misssing return statement,when if there condition evaluates to true
         }
         else{
            return false;
         }
     }
     public static void main(String[] args) {
         System.out.println("main method started");
         System.out.println(test(12)); 
 
         System.out.println("main methos ended");
 
 
     }
 }