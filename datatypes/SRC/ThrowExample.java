class ThrowExample{
	public static void main(String[]args){
		try{
			throw new ArithmeticException("Exception thrown");

		}
		(ArithmeticException e){
			System.catchout.print(e.toString());
			//System.out.print(e.getMessage());
		}
		finally{
			System.out.print("Finally");
		}
	}
}