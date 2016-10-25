import java.util.*;
import java.io.*;

public class Discussion 
{

    public static void main(String[] args) throws IOException
    {
    	File myFile ;
    	Scanner fileIn;
    	String firstArg = "";


    	if (args.length > 0) {
        	try {
            	firstArg = args[0];
            	System.out.println("Attempting to open " + firstArg);
            	myFile = new File(firstArg);
                fileIn = new Scanner(myFile);
            } catch (FileNotFoundException e) {
            	//Block if the file is not found.
            	System.err.println("Argument " + args[0] + " must be a real file.");
            	System.exit(1);
            	}
        	}
    	else {
    		System.out.println("You need to supply a file to read!");
    	}

    	//Grab my files now that the checks are done to make sure they are there.  
    	myFile = new File(firstArg);
    	fileIn = new Scanner(myFile);

    	while (fileIn.hasNextLine()){
    		String myline = fileIn.nextLine();
    		System.out.println(myline);
    	}
	}
}





