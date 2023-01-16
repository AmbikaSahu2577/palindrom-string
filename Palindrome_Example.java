class Palindrome_Example
{
	public static void main(String[] args) 
	{
	    int num = 122;
	    int temp,rem,rev=0;
	    temp=num;
	    while(temp!=0)
	    {
	    	rem = temp%10;
	    	rev = rev*10+rem;
	    	temp=temp/10;
	    }
	    if (num==rev) 
	    {
	    	System.out.println("palindrom number");	
	    }
	    else
	    {
          System.out.println("not palindrom number");
	    }	
	}
}