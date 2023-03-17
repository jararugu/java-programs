class Return3{

   

    static int square(int n){
      int res = n * n;
        return res;
    }
    public static void main(String[] args) {
        System.out.println("main method started");
         int a = 5;
         int b = 6;
         int result = square(a) + 2*a*b + square(b);
         /////           25     +  60    + 36     = 121
         System.out.println(" result value is " +result);


        System.out.println("main methos ended");


    }
}