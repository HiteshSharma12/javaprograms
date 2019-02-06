class Handling{
	public static void main(String []args ){
       try{


		throw new Exception("Exception called");




	}
	catch(Exception e){
		System.out.print(e.toString());
	}
	finally{
		System.out.print("We are now in finally");
	}

	}
}