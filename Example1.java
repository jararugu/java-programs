
class Example1{

    static void sum(){
        int a=10,b=20;
        int result = a + b;
        System.out.println("sum of "+a+" and "+b+" is "+result);

    }
    static void sqaure(){ 
        int n=5;
        int result = n*n;
System.out.println("square of "+n+" is" +result);
}
public static void main(String[] args) {
    System.out.println("main method started");
    sum();
    sqaure();
    System.out.println("main methos ended");
}
}