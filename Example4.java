class Example1{

    static void sum(int a,int b){
        int result = a + b;
        System.out.println("sum of "+a+" and "+b+" is "+result);

    }
    static void sqaure(int n){ 
        int result = n*n;
System.out.println("square of "+n+" is" +result);
}
public static void main(String[] args) {
    System.out.println("main method started");
    sum(10,20);
    sqaure(6);
    System.out.println("main methos ended");
}
}