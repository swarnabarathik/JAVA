class factorial
{
	static int factorial(int n)
	{
		if(n==0)
		return 1;
		else
		return(n*factorial(n-1));
	}
	public static void main(String args[])
	{
		int fact,num=4;
		fact=factorial(num);
		System.out.println("Factorial of "+num+" is "+fact);
	}
}
