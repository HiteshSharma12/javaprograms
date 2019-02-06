package com.ncu.assignment.exception;



class studentvalidation{
	int day;
	int month;
	int year;
    String qualification;
    String skills;


	 try{ 
    if(  (day>0 || day<31))
    	System.out.println("The day entered is valid");
    else
    	throw new Exception("Exception called");
    if (  (month>0||month<12))
    	System.out.println("The Month entered is valid");
    else
    	throw new Exception("Exception called");
    if(  (year>0|| year<2019))
    	System.out.println("The year entered is valid");
    else 
    	throw new Exception("Exception called");
        System.out.println(day/month/year);

        if (qualification==" ")
        	throw new Exception("Exception called");
        System.out.println("Error Message")


        if (skills==" ")
        	throw new Exception("Exception called");
        System.out.println("Error Message")






 } catch (Exception e){
		System.out.print(e.toString());
	}
}