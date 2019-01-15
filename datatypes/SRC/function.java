import java.util.*;
class function{
	public static void main(String[]args){
Scanner scan=new Scanner(System.in);
int[] a=new int[10];
int item;
System.out.print("Enter the elements of array");
for(int i=0;i<a.length;i++){
	a[i]=scan.nextInt();
}		
System.out.print("Enter the items");
item=scan.nextInt();
int loc=search(a,item);
if(loc==-1)
	System.out.print("item not in list");
else
System.out.print("item at location"+loc);


	}


	static int search(int []a, int item)
	{
		int i;
		for(i=0;i<10;i++)
		{
			if(item==a[i])
				return i;
			
				}
				return -1;

						 

	}//end of function 
}


