class Example22{

    static void sum(){
        int a=10;
        float b = 20;

        float result = a + b;
        System.out.println("sum of "+a+" and "+b+" is "+result);

    }

    static void square(){ 
        float n=5.0f;
        float result = n*n;
System.out.println("square of "+n+" is" +result);
}
public static void main(String[] args) {
    System.out.println("main method started");
    sum();
    square();
    System.out.println("main methos ended");
}
}