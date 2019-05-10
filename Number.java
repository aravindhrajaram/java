class  Number{
 public static void main(String[] args) {
	int n=6532;
int a= n%1000;
int b=n/1000;
int c= a%100;
int d=c%10;
 a=a/100;
 c=c/10;
System.out.println("the result:\n"+b+"\n"+a+"\n"+c+"\n"+d);
}
}