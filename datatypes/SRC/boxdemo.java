import java.util.*;
class box{
	double width;
    double height;
    double depth;

    double volume(){
    	return width*height*depth;
    }
    void setdim(){

     Scanner in=new Scanner(System.in);
     System.out.print("please enter the width");
     width=in.nextDouble();
      System.out.print("please enter the height");
      height=in.nextDouble();
       System.out.print("please enter the depth");
       depth=in.nextDouble();
}
       box(double width, double height, double depth){
       	this.width=width;
       	this.height=height;
       	this.depth=depth;
       }
       box(){

       }




    

   void displayvolume(){
   	System.out.print("volume="+volume());
   }
}

class boxdemo{
	public static void main(String[]args)
	{
     box b = new box();
     box b1 =new box(6,6,6);
     //b1.setdim();
     b1.displayvolume();


	}
}