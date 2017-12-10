/*
Passing parameter by value
Utilizing the command line
after compiling the program in the command line:
$ javac CommandLine.java
run the java program through the command line with:
java Commandline This is a command one 2 3 and to the 4
the expected output should be:
args[0]: This
args[1]: is
args[2]: a
args[3]: command
args[4]: one
args[5]: 2
args[6]: 3
args[7]: and
args[8]: to
args[9]: the
args[10]: 4
*/
public class CommandLine{
	public static void main(String[] args) {
		for (int i=0; i<args.length;i++ ) {
			System.out.println("args["+i+"]: "+args[i]);// prints each element in the array
		}//iterates through the elemnts within the args array
	}
}