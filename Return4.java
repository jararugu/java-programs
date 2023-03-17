class Return4{
    static void disp(){
        System.out.println("running disp() method");
    }

    static int test(){
        System.out.println(" running test() method");

         return 100; 
      
    }
    public static void main(String[] args) {
        System.out.println("main method started");
        System.out.println(test());
        // print return value of test() function
       // System.out.println(dis()); ------> error
       int n = test() / 5;
      // int m = disp() + 10; --------> error
      System.out.println("n value is:" +n);
        System.out.println("main methos ended");

        // void return type function should not be called inside print statement and
        // inside a expression


    }
}