class Recursivestackoerflow{

    static void sequence1(int n){
     // System.out.println("the n value is:"  +n);  
      //sequence1(++n); -->unconditional recursive call // It will prints infinate, we will get a runtime error is ---> stackoverflow
    // sequence1(n++); // output--> it will prints "the value is 1" untill infinate --> stackoverflow
     // System.out.println("the n value is:"  +n); // It will prints 1 to  50
  
        if(n<50)
      {
         System.out.println("the n value is:"  +n); // It will prints 1 to  49

       // sequence1(++n); // It will prints 1 to 50
       ++n;
       // sequence1(n++); we will get a output is ---> It will prints infinate   
  

      }
      // System.out.println(n+""); /// output: IIt will prints 50 to 2 in reverse order
     
     }
     

    
     public static void main(String[] args) {
         System.out.println("main method started");
        // sequence1(1);
         sequence1(1);
         System.out.println("");
         System.out.println("main methos ended");
 
 
     }
    }

   // output -----> We will get a  output is given below:

   /*main method started
the n value is:1 
the n value is:2 
the n value is:3 
the n value is:4 
the n value is:5 
the n value is:6 
the n value is:7 
the n value is:8 
the n value is:9 
the n value is:10
the n value is:11
the n value is:12
the n value is:13
the n value is:14
the n value is:15
the n value is:16
the n value is:17
the n value is:18
the n value is:19
the n value is:20
the n value is:21
the n value is:22
the n value is:23
the n value is:24
the n value is:25
the n value is:26
the n value is:27
the n value is:28
the n value is:29
the n value is:30
the n value is:31
the n value is:32
the n value is:33
the n value is:34
the n value is:35
the n value is:36
the n value is:37
the n value is:38
the n value is:39
the n value is:40
the n value is:41
the n value is:42
the n value is:43
the n value is:44
the n value is:45
the n value is:46
the n value is:47
the n value is:48
the n value is:49
the n value is:50 */
 