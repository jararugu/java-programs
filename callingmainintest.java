class callingmainintestfun{

    static void test(){
        System.out.println("running test() function");
        main(); ///calling main() function in test() fuction
         
     }
     public static void main(String[] args) {
         System.out.println("main method started");
         test();
         System.out.println("main methos ended");
 
 
     }

 }

 // T0 get a output -----> Error:method main in class Recursivestackoerflow cannot be applied to given types