import java.util.*;
class arrayindex
{
public static void main (String[] arg){
int arr[]=new int[10];
int i,number;
boolean b=false;
Scanner scan=new Scanner(System.in);
System.out.println("Enter the elements");
for (i=0;i<10;i++)
arr[i]=scan.nextInt();
System.out.println("Enter number to be searched ");
	number=scan.nextInt();
for(i=0;i<10;i++)

{if (arr[i]==number){

b=true;
System.out.println("item at location "+i);	

break;
}}

if(b==false)
System.out.println("item not found");	


}}