class Return{

    static void disp(){
        System.out.println("running disp() method");
    }

    static int test(){
        System.out.println("running test() started");
        return 10;
    }
    public static void main(String[] args) {
        System.out.println("main method started");
         disp();
         test(); // 
         int n = test(); //assigning return value of the function 
         System.out.println( "The value is " +n);
         System.out.println("main methos ended");


    }
}