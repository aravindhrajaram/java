class Swap1{
	public static void main(String[] a)
	{
		int a=10,b=20,c=30;
        System.out.println("Before swap:\n"+a+"\n"+b+"\n"+c);
	    a=a+b+c;
		b=a-(b+c);
		c=a-(b+c);
		a=a-(b+c);
		System.out.println("The result:\n"+a+"\n"+b+"\n"+c);
	}
}