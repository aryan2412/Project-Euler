class q10 
{
	public static boolean isPrime(int n) 
    {
		if(n==2)
			return true;
		if(n%2==0 && n!=2) 
		    return false; 
		for(int i=3;i<=Math.sqrt(n);i+=2) 
		{ 
            if(n%i==0) 
            return false;
        }
	    return true;
	}
	public static void main(String[] args) 
	{
		int n=2000000;
		long sum=0;
		for(int i=2;i<=n;i++)
		{
			if(isPrime(i))
				sum+=i;
		}
		System.out.println("Result :"+sum);
	}
}
