/*
Passing parameter by value
Utilizing the command line
after compiling the program in the command line:
$ javac CommandLine.java
run the java program through the command line with:
java Commandline this is a command line arguement
*/
public class CommandLine{
	public static void main(String[] args) {
		for (int i=0; i<args.length;i++ ) {
			System.out.println("args["+i+"]: "+args[i]);// prints each element in the array
		}//iterates through the elemnts within the args array
	}
}