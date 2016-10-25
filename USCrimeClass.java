/**
*File:  USCrimeClass.java
* Author:  This is original code. It was written by Alex Achs
* Date:    Oct 11th 2016
* Purpose: Demonstrate core concepts for CMIS141
*/

import java.io.*;
import java.util.*;

public class USCrimeClass {
	Scanner scan = new Scanner(System.in);

    String[] year1994 = new String[20];
	String[] year1995 = new String[20];
	String[] year1996 = new String[20];
	String[] year1997 = new String[20];
	String[] year1998 = new String[20];
	String[] year1999 = new String[20];
	String[] year2000 = new String[20];
	String[] year2001 = new String[20];
	String[] year2002 = new String[20];
	String[] year2003 = new String[20];
	String[] year2004 = new String[20];
	String[] year2005 = new String[20];
	String[] year2006 = new String[20];
	String[] year2007 = new String[20];
	String[] year2008 = new String[20];
	String[] year2009 = new String[20];
	String[] year2010 = new String[20];
	String[] year2011 = new String[20];
	String[] year2012 = new String[20];
	String[] year2013 = new String[20];
	String[] tempArrayOne = new String[20];
    String[] tempArrayTwo = new String[20];

    //Class constructor
  
    public USCrimeClass(){
    	//Constructor.
    	//Dosen't have any default variables / values it needs to store.  
    }

    public void addYear(String[] brokenUpLine){
	    if (brokenUpLine[0].equals("1994"))
			 year1994 = brokenUpLine;
		else if (brokenUpLine[0].equals("1995"))
			 year1995 = brokenUpLine;
		else if (brokenUpLine[0].equals("1996"))
			 year1996 = brokenUpLine;
		else if (brokenUpLine[0].equals("1997"))
			 year1997 = brokenUpLine;
		else if (brokenUpLine[0].equals("1998"))
			 year1998 = brokenUpLine;
		else if (brokenUpLine[0].equals("1999"))
			 year1999 = brokenUpLine;
		else if (brokenUpLine[0].equals("2000"))
			 year2000 = brokenUpLine;
		else if (brokenUpLine[0].equals("2001"))
			 year2001 = brokenUpLine;
		else if (brokenUpLine[0].equals("2002"))
			 year2002 = brokenUpLine;
		else if (brokenUpLine[0].equals("2003"))
			 year2003 = brokenUpLine;
		else if (brokenUpLine[0].equals("2004"))
			 year2004 = brokenUpLine;
		else if (brokenUpLine[0].equals("2005"))
			 year2005 = brokenUpLine;
		else if (brokenUpLine[0].equals("2006"))
			 year2006 = brokenUpLine;
		else if (brokenUpLine[0].equals("2007"))
			 year2007 = brokenUpLine;
		else if (brokenUpLine[0].equals("2008"))
			 year2008 = brokenUpLine;
		else if (brokenUpLine[0].equals("2009"))
			 year2009 = brokenUpLine;
		else if (brokenUpLine[0].equals("2010"))
			 year2010 = brokenUpLine;
		else if (brokenUpLine[0].equals("2011"))
			 year2011 = brokenUpLine;
		else if (brokenUpLine[0].equals("2012"))
			 year2012 = brokenUpLine;
		else if (brokenUpLine[0].equals("2013"))
			 year2013 = brokenUpLine;
		else{}
    }

	private String[] getYear(String year){
	    if (year.equals("1994"))
			 return year1994;
		else if (year.equals("1995"))
			 return year1995;
		else if (year.equals("1996"))
			 return year1996;
		else if (year.equals("1997"))
			 return year1997;
		else if (year.equals("1998"))
			 return year1998;
		else if (year.equals("1999"))
			 return year1999;
		else if (year.equals("2000"))
			 return year2000;
		else if (year.equals("2001"))
			 return year2001;
		else if (year.equals("2002"))
			 return year2002;
		else if (year.equals("2003"))
			 return year2003;
		else if (year.equals("2004"))
			 return year2004;
		else if (year.equals("2005"))
			 return year2005;
		else if (year.equals("2006"))
			 return year2006;
		else if (year.equals("2007"))
			 return year2007;
		else if (year.equals("2008"))
			 return year2008;
		else if (year.equals("2009"))
			 return year2009;
		else if (year.equals("2010"))
			 return year2010;
		else if (year.equals("2011"))
			 return year2011;
		else if (year.equals("2012"))
			 return year2012;
		else if (year.equals("2013"))
			 return year2013;
		else{}
			return year1994;
    }

	



    public void populationGrowthChange(String firstYear, String secondYear){
    	tempArrayOne = getYear(firstYear);
    	tempArrayTwo = getYear(secondYear);
    	float changedPopulation = Float.parseFloat(tempArrayTwo[1]) - Float.parseFloat(tempArrayOne[1]);
    	float changedPopulationPercentage = (changedPopulation/Float.parseFloat(tempArrayTwo[1])) * 100;
    	System.out.println("The difference in population is " + changedPopulation);
    	System.out.println("Thats a " + changedPopulationPercentage + "% in change");
    }
    public void maximumMurderRate(){
    	tempArrayOne = getYear("1994");
    	float tempRate = Float.parseFloat(year1994[5]);
    	for (int i = 1994; i <= 2013; i++){
    		tempArrayTwo = getYear(String.valueOf(i));
    		if (Float.parseFloat(tempArrayTwo[5]) > tempRate){
    			tempRate = Float.parseFloat(tempArrayTwo[5]);
    			tempArrayOne = tempArrayTwo;
    		}
    	}
    	System.out.println("The year was " + tempArrayOne[0] + " for the Maxium Murder Rate, which was " + tempRate);

    }
    public void minimumMurderRate(){
    	tempArrayOne = getYear("1994");
    	float tempRate = Float.parseFloat(year1994[5]);
    	for (int i = 1994; i <= 2013; i++){
    		tempArrayTwo = getYear(String.valueOf(i));
    		if (Float.parseFloat(tempArrayTwo[5]) < tempRate){
    			tempRate = Float.parseFloat(tempArrayTwo[5]);
    			tempArrayOne = tempArrayTwo;
    		}
    	}
    	System.out.println("The year was " + tempArrayOne[0] + " for the Minimum Murder Rate, which was " + tempRate);

    }
    public void maximumRobberyRate(){
    	tempArrayOne = getYear("1994");
    	float tempRate = Float.parseFloat(year1994[9]);
    	for (int i = 1994; i <= 2013; i++){
    		tempArrayTwo = getYear(String.valueOf(i));
    		if (Float.parseFloat(tempArrayTwo[9]) > tempRate){
    			tempRate = Float.parseFloat(tempArrayTwo[9]);
    			tempArrayOne = tempArrayTwo;
    		}
    	}
    	System.out.println("The year was " + tempArrayOne[0] + " for the Maxium Robbery Rate, which was " + tempRate);


    }
    public void minimumRobberyRate(){
    	tempArrayOne = getYear("1994");
    	float tempRate = Float.parseFloat(year1994[9]);
    	for (int i = 1994; i <= 2013; i++){
    		tempArrayTwo = getYear(String.valueOf(i));
    		if (Float.parseFloat(tempArrayTwo[9]) < tempRate){
    			tempRate = Float.parseFloat(tempArrayTwo[9]);
    			tempArrayOne = tempArrayTwo;
    		}
    	}
    	System.out.println("The year was " + tempArrayOne[0] + " for the Minimum Robbery Rate, which was " + tempRate);
    }
    public void motorVehcicleChangeRate(){
    	float secondYearPercentage = (Float.parseFloat(year2012[18]) / Float.parseFloat(year2012[1]))*100;
    	float firstYearPercentage = (Float.parseFloat(year1998[18]) / Float.parseFloat(year1998[1]))*100;
    	System.out.println("In 1998, the percentage was " + firstYearPercentage);
    	System.out.println("In 2012, the percentage was " + secondYearPercentage);
    	System.out.println("So there was a " + (firstYearPercentage-secondYearPercentage) + " change");

    }    
    public void maximumRapeRate(){
    	tempArrayOne = getYear("1994");
    	float tempRate = Float.parseFloat(year1994[7]);
    	for (int i = 1994; i <= 2013; i++){
    		tempArrayTwo = getYear(String.valueOf(i));
    		if (Float.parseFloat(tempArrayTwo[7]) > tempRate){
    			tempRate = Float.parseFloat(tempArrayTwo[7]);
    			tempArrayOne = tempArrayTwo;
    		}
    	}
    	System.out.println("The year was " + tempArrayOne[0] + " for the Maxium Rape Rate, which was " + tempRate);
    }

    public void minimumRapeRate(){
    	tempArrayOne = getYear("1994");
    	float tempRate = Float.parseFloat(year1994[7]);
    	for (int i = 1994; i <= 2013; i++){
    		tempArrayTwo = getYear(String.valueOf(i));
    		if (Float.parseFloat(tempArrayTwo[7]) < tempRate){
    			tempRate = Float.parseFloat(tempArrayTwo[7]);
    			tempArrayOne = tempArrayTwo;
    		}
    	}
    	System.out.println("The year was " + tempArrayOne[0] + " for the Minimum Rape Rate, which was " + tempRate);
    }
    public void rapeRateGrowthChange(String firstYear, String secondYear){
    	tempArrayOne = getYear(firstYear);
    	tempArrayTwo = getYear(secondYear);
    	float changedRate = Float.parseFloat(tempArrayOne[7]) - Float.parseFloat(tempArrayTwo[7]);
    	float changedRatePercentage = (changedRate/Float.parseFloat(tempArrayOne[7])) * 100;
    	System.out.println("The difference in Rape Rate Change is " + changedRate);
    	System.out.println("Thats a " + changedRatePercentage + "% in change");
    }
    public void burgalariesRateGrowthChange(String firstYear, String secondYear){
    	tempArrayOne = getYear(firstYear);
    	tempArrayTwo = getYear(secondYear);
    	float changedRate = Float.parseFloat(tempArrayOne[15]) - Float.parseFloat(tempArrayTwo[15]);
    	float changedRatePercentage = (changedRate/Float.parseFloat(tempArrayOne[15])) * 100;
    	System.out.println("The difference in Burglary Rate Change is " + changedRate);
    	System.out.println("Thats a " + changedRatePercentage + "% in change");
    }
}
