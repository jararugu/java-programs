class Return8{

    static boolean test(int n){
         if(n > 10)
         {
            System.out.println("number is belo 10 ");  
            return true;
         }
         else{
            return false;
         }
         return true; //error : unreachable code
     }
     public static void main(String[] args) {
         System.out.println("main method started");
         System.out.println(test(12)); 
 
         System.out.println("main methos ended");
 
 
     }
 }