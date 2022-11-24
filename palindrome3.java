public class palindrome3  {
    public static void main(String args[])
    {
     int sum = 0, r;
	 int n=2552;    
     while(n>0)
	   {    
        r = n % 10;   
        sum = (sum*10)+r;    
        n = n/10;    
       }    
      if(n<=sum)    
        System.out.println("It is a Palindrome number.");    
      else    
        System.out.println("Not a palindrome");    
     }  
}

