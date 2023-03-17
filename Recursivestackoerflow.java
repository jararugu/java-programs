class Recursivestackoerflow{

    static void test(){
        System.out.println("running test() function");
        test(); ///unconditional recursive call
         
     }
     public static void main(String[] args) {
         System.out.println("main method started");
         test();
         System.out.println("main methos ended");
 
 
     }

 }

 //output---> To get a infinite loops(eg:it will prints  trunning test() function lot of times)

 /*  running test() function
running test() function
running test() function
running test() function
running test() function
running test() function
running test() function
running test() function
running test() function
running test() function
running test() function
running test() function
running test() function
running test() function
running test() function
running test() function

Error----> Exception in thread "main" java.lang.StackOverflowError   */

 