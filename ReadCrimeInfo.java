/**
*File:  ReadCrimeInfo.java
* Author:  This is original code. It was written by Alex Achs
* Date:    Oct 11th 2016
* Purpose: Demonstrate core concepts for CMIS141
*/


import java.util.*;
import java.io.*;

public class ReadCrimeInfo 
{

    public static void main(String[] args) throws IOException
    {
    	
    	//Initializing some values.
        Scanner scan = new Scanner(System.in);
    	Random rand = new Random();
    	String firstArg = "";
    	File myFile ;
    	Scanner fileIn;
    	long start = System.currentTimeMillis();
    	String input;
        String[] tempYear = new String[20];
        USCrimeClass crimeStats = new USCrimeClass();



    	//Section for checking Args and attempting to open the file.  Verification they exist.  
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


    	//This section parses my .csv file into an array which is then passed into my class
    	int count = 0;
    	//USCrimeClass stateInformation = new USCrimeClass();

    	while (fileIn.hasNextLine()){
    		String myline = fileIn.nextLine();
    		String[] brokenUpLine = myline.split(",");
            crimeStats.addYear(brokenUpLine);
    	}

        //Do while loop that will continusely prompt the user on a menu based system.
        do
        {
            System.out.println("Please Make your Selection with its Numerical number or Q to quit:  ");
            System.out.println("1.)  Calcuate the Population growth between years.");
            System.out.println("2.)  Year of maxium murder rate.");
            System.out.println("3.)  Year of minimum murder rate.");
            System.out.println("4.)  Year of maxium robbery rate.");
            System.out.println("5.)  Year of minimum robbery rate.");
            System.out.println("6.)  Total percentage change in Motor Vehicle Theft between the years 1998 and 2012.");
            System.out.println("7.)  Year of maxium rape rate.");
            System.out.println("8.)  Year of minimum rape rate.");
            System.out.println("9.)  Net Change of rapes from years supplied.");
            System.out.println("10.) Net Change of Burglaries from years supplied");
            System.out.println("Q.)  Quit");
            input = scan.nextLine();


            //Switch case to handle user input.
            switch(input){
            	case "1":
            		System.out.println("You picked choice 1.  Processing...");
                    System.out.print("Please enter the first year, 1994-2013:  ");
                    String firstYear = scan.nextLine();
                    System.out.print("Please enter the second year, 1994-2013:  ");
                    String secondYear = scan.nextLine();
                    crimeStats.populationGrowthChange(firstYear,secondYear);
            		break;
            	case "2":
            		System.out.println("You picked choice 2.  Processing...");
                    crimeStats.maximumMurderRate();
            		break;
            	case "3":
            		System.out.println("You picked choice 3.  Processing...");
                    crimeStats.minimumMurderRate();
            		break;
            	case "4":
            		System.out.println("You picked choice 4.  Processing...");
                    crimeStats.maximumRobberyRate();
            		break;
            	case "5":
            		System.out.println("You picked choice 5.  Processing...");
                    crimeStats.minimumRobberyRate();
            		break;
            	case "6":
            		System.out.println("You picked choice 6.  Processing...");
                    crimeStats.motorVehcicleChangeRate();
            		break;
            	case "7":
            		System.out.println("You picked choice 7.  Processing...");
                    crimeStats.maximumRapeRate();
            		break;
            	case "8":
            		System.out.println("You picked choice 8.  Processing...");
                    crimeStats.minimumRapeRate();
            		break;
            	case "9":
            		System.out.println("You picked choice 9.  Processing...");
                    System.out.print("Please enter the first year, 1994-2013:  ");
                    firstYear = scan.nextLine();
                    System.out.print("Please enter the second year, 1994-2013:  ");
                    secondYear = scan.nextLine();
                    crimeStats.rapeRateGrowthChange(firstYear,secondYear);
            		break;
            	case "10":
            		System.out.println("You picked choice 10.  Processing...");
                    System.out.print("Please enter the first year, 1994-2013:  ");
                    firstYear = scan.nextLine();
                    System.out.print("Please enter the second year, 1994-2013:  ");
                    secondYear = scan.nextLine();
                    crimeStats.burgalariesRateGrowthChange(firstYear,secondYear);
            		break;
            }

        }while(!input.equals("Q"));


        //Ending information
        System.out.println("All done with " + myFile);
        long end = System.currentTimeMillis();
        System.out.println("Time spent in ReadCrimeInfo: " + ((end - start) / 1000d) + " seconds");

        fileIn.close();
    }
}
