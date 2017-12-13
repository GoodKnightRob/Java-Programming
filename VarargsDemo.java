public class VarargsDemo{
	public static void main(String[] args) {
		//Call Method with variable args
		printMax(34,3,3,2,56.5);
		printMax(new double[]{1,2,3});
	}
	//function can receive mutiple string arguements (or an array of them)
	public static void printMax(double...numbers) {
		if(numbers.length == 0){
			System.out.println("No Argument passed");
			return;
		}
		double result = numbers[0];// sets the  initial result to be the first element in the array
		for (int i=1; i<numbers.length;i++ ){
			if (numbers[i]>result) {// compare current element with result
				result = numbers[i];// saves element in result if the element is greater
			}
		}
		System.out.println("The max value is "+ result);
	}// ends printMax Method
}