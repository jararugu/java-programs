class Return2{

    static void disp(){
        System.out.println("running disp() method");
    }

    static int test(){
      int x = 10;
        return x;
    }
    public static void main(String[] args) {
        System.out.println("main method started");
         int n = test(); //assigning return value of the function 
         System.out.println(" n value is"+n);
         int m = test() * 2;
          // 10 * 2
         System.out.println(" m value is " +m);


        System.out.println("main methos ended");


    }
}