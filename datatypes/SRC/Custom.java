class Custom extends Exception{
	private int detail;
	Custom(int a){
		detail=a;
	}
	public String toString(){
		return "Custom["+ detail+"]";
	}
}
class Main{
	static void compute(int a) throws Custom {
		System.out.println("Called compute("+ a + ")");
		if (a>10)
			throw new Custom(a);
		System.out.println("Normal Exit");
	}
	public static void main(String args[]){
		try{
			compute(1);
			compute(20);

		}catch(Custom e){
			System.out.println("Caught"+e);
		}
	}
}

