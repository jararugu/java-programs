class Example2{

    static void sum(){
        int a=10;
        float b = 20;

        float result = a + b;
        System.out.println("sum of "+a+" and "+b+" is "+result);

    }

    static void sqaure(){ 
        float n=5.0;
        float result = n*n;
System.out.println("square of "+n+" is" +result);
}
public static void main(String[] args) {
    System.out.println("main method started");
    sum();
    sqaure();
    System.out.println("main methos ended");
}
}