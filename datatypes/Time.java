 class Time{
 	public static void main(String []args ){
 		int hour=0;
 		int minute=0;
 		int second=0;
    try{ 
    if(  (hour>0||hour<24))
    	System.out.println("The Hour entered is valid");
    else
    	throw new Exception("Exception called");
    if (  (minute>0||minute<60))
    	System.out.println("The Minute entered is valid");
    else
    	throw new Exception("Exception called");
    if(  (second>0||second<60))
    	System.out.println("The Second entered is valid");
    else 
    	throw new Exception("Exception called");
        System.out.println(hour:minute:second);


 } catch (Exception e){
		System.out.print(e.toString());
	}

		int next Second;
	     int next Hour;
	     int next Minute;
	     int previous Second ;
	     int previous Hour;
	     int previous Minute;





		boolean b=false;
		if (next Second==true)
			System.out.println("the next second is "+Hour:Minute:(++Second));


		if (next Minute==true)
			System.out.println("the next minute is" Hour:(++Minute):Second);

        if (next Hour==true)
			System.out.println("the next hour is"+(++Hour):Minute:Second);


		if (previous Second==true)
			System.out.println("the previous second is"+Hour:Minute:--Second);


		if(previous Minute==true)
			System.out.println("the previous minute is"+Hour:--Minute:Second);

		if (previous Hour==true)
			System.out.println("the previous hour is " +--Hour:Minute:Second);

        if (Minute==59&& Second==59)
        	System.out.println("the time is "+(++Hour):00:00);
        

        if (Minute==59&& Second==59 &&Hour==23)
        	System.out.println("the time is "+00:00:00);


		System.out.println(Hour:Minute:Second);




 	}
 }