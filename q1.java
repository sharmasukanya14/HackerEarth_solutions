import java.util.Scanner;
class TestClass {
   
 public static void main(String args[] ) throws Exception {
        
Scanner sc = new Scanner(System.in);
        
        
int j=sc.nextInt();
            

     
	 for(int k=0;k<=j;k++)
     
	 {
            
 		String a = sc.nextLine();      
			{        

          
			  for(int i=0;i<a.length();i++)
   
        				 {
              
				  if(a.charAt(i)>='A'&& a.charAt(i)<='Z')
       
     				    {
               
  					   int temp = (int)a.charAt(i)-64;
                    
					   System.out.print(temp);
               
				     }
                
               
				 else if(a.charAt(i)==' ')
    
         				   {
               
  					   char temp ='$';
                  
  					System.out.print(temp);
          
    				  }
                
            
  				  else if(a.charAt(i)>='a'&& a.charAt(i)<='z')
    
            				{
           
      				    int  temp =(int)a.charAt(i)-96;
    
              				   System.out.print(temp);

          
			                     }
      
          
           		 }
          
 			 System.out.println(" ");
      
	  }
        
        
  
  }

}
        

     
