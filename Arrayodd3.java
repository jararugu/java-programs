class Arrayodd3{

    static void disp(int[] arr){
        System.out.println("Array size" +arr.length);
        //length is property of array ,which holds size of the Array
        for(int i=0;i<arr.length;i++) 
        {
            if(i%2!= 0)
            System.out.println(arr[i]+ "");
        }
        System.out.println();

    }
     
    
     public static void main(String[] args) {
         System.out.println("main method started");
         int[] a1 = {10,20,30,40,50};
         disp(a1);
         System.out.println("main methos ended");
 
 
     }
 }