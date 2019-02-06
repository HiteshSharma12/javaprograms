class Handling{
int i;
	Handling(int i){
		this.i=i;
	}

	void display(){
		System.out.print("i ="+i);
	}
}


class HandlingDriver{
	public static void main(String[]args){
		try{
			Handling e=null;
		e.display();}
		catch(NullPointerException e){
			System.out.print("Exception occured due to null pointer");
		}
	}
}