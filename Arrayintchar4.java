class Arrayintchar4{

    static void chartoASCII(int[] arr){
        System.out.println("Array size" +arr.length);
        //length is property of array ,which holds size of the Array
        for(int i=0;i<arr.length;i++) 
        {
            System.out.println((char)arr[i]+ "");
        }
        System.out.println();

    }
    static void ASCIItochar(char[] arr){
        System.out.println("Array size" +arr.length);
        //length is property of array ,which holds size of the Array
        for(int i=0;i<arr.length;i++) 
        {
            System.out.println((int)arr[i]+ "");
        }
    }
     
    
     public static void main(String[] args) {
         System.out.println("main method started");
        char[] charr = { 'a','b','c','d','e'};
         int[] intarr = { 10,20,30,40,50};
        chartoASCII(intarr);
        ASCIItochar(charr);
         System.out.println("main methos ended");
 
 
     }
 }