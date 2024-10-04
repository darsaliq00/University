class multiple_exceptions
{
	public static void main(String[] args)
	{
		try
		{
			int x=0,y=10;
			int arr[]={1,2,3};
			int z=arr[4];
			int c=y/x;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.toString());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.toString());
		}
		finally
		{
			System.out.println("This is the finally block");
		}
	}

}
