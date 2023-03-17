class Example33{

    static void diametercircle(){
        int radius = 2 ;

        float result = 2 * radius;
        System.out.println("diameter of circle is:" +result);

    }

    static void arecircle(){ 
      final  float pi = 3.142f;
        int r = 30;
        float result = pi*r*r;
System.out.println("area of circle is"   +result);
}
static void circumcircle(){ 
   final float pi = 3.142f;
    int r = 30;
    float result = 2*pi*r;
System.out.println("area of circumcircle is" +result);
}
public static void main(String[] args) {
    System.out.println("main method started");
    diametercircle();
    arecircle();
    circumcircle();
    
    System.out.println("main methos ended");
}
}