public class swappingExample{
	public static void main (String [] args){
		int a=30;
		int b=45;
		System.out.println("Before Swaping, a ="+a+" and b = "+b);

		//Invoke the swap method
		swapFunction(a,b);
		System.out.println("\n**Now, Before and After swapping values will be same here**:");
		System.out.println("After swapping, a= "+a+" and b is "+b);
	}
// values a and b are swapped but only within the scope of the Swap Function
// The swap does not carry over to the main method	
	public static void swapFunction(int a, int b){
		System.out.println("Before swapping (Inside), a = "+a+" b ="+b);

	//Swap n1 with n2
	int c=a;
	a=b;
	b=c;
	System.out.println("After Swapping (Inside), a ="+a+" b ="+b);
	}

}
