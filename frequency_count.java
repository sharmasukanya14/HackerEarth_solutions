import java.util.Scanner;

import java.util.ArrayList;

import java.util.Collections;

class TestClass 
{
   
	 public static void main(String args[] ) throws Exception {
  
   	 Scanner sc = new Scanner(System.in);
      
     
	 int n = sc.nextInt();
     
	ArrayList<Integer> a = new ArrayList<Integer>();
   
 	 for(int i=0;i<n;i++)
    
	 {
    
    	 int s= sc.nextInt();
      
  	 a.add(s);
  
 	  }
        
 	 int m= sc.nextInt();
   
      	 ArrayList<Integer> b = new ArrayList<Integer>();

    
   	 for(int i=0;i<m;i++)
       
	 {
       
 	 int t =sc.nextInt();
        
	 b.add(t);
          
 	 	if(a.contains(t))
          
 	 	{
               
 		System.out.println(Collections.frequency(a,t));
         
  		 }
          
 		 else
  {
   
               		 System.out.println("NOT PRESENT");
       
  	  	 }

      	  }
 
       }
}
