class Handling{
	public static void main(String [] args){
			int a=5;
		int b=0;

		//next line will result in a Arithmetic exception
		System.out.print(a/b);
        
		String s=null;

		//next line will result in a null pointer exception
		System.out.print(s.toString());
       s="JAVA PROGRAMMING";
       //next line will result in number format exception
       f(s);	


       //next linee will result in array index out of bound
         System.out.print(ar[2]);

	}
   

      void f(int b){
      	System.out.print(b);

      }

}