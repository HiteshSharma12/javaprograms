import java.io.*;

public class FileDemo{


	public static void main(String[]args){
		File f=null;
		String strs="test1.txt";
		//create new file
		f =new File(strs);
		String a =f.getAbsolutePath();

		//print absolute path and length
		System.out.print("\n"+a);
		System.out.print("\nLength="+ f.length());


	}
}




ANOTHER PROGRAM ::


import java.io.*;
import java.util.*;
class FileDemo{
	public static void main(String[]args){
		File f=null;

     f=new File("file.txt");
     FileWriter fout= new FileWriter(f);
     BufferedWriter bout=new BufferedWriter(fout);
     Scanner sc=new Scanner(System.in);
     System.out.print("\n Enter a String :");
     while(sc.hasNext()){
     	bout.write(sc.nextLine());
     	bout.newLine();
     }
   bout.close();

	}
}



import java.io.*;

class FileDemo{

	public static void main(String[]args){
		File f=null;
		try{
			File f = new File("file1.txt");

			FileReader fin = new FileReader(f);
			BufferedReader bin = new BufferedReader(fin);

			String sr;
			System.out.println("The Contents of the file are:");
			while((sr=bin.readLine())!=null){
				System.out.println(sr);
			}
		}
		catch(Exception e){
			//if any I/O error occurs

			e.printStackTrace();
		}
	}
}








import java.io.*;
import java.util.*;
class InfoStudentFile{
	public static void main(String[]args){
		File f=null;

     int srno.;
     String name;
     float cgpa;
     char grade;
     File f=null;
     try{

     	f=new File("info.txt");
     	FileWriter fout=new FileWriter(f);
     	BufferedWriter bout = new BufferedWriter(fout);

     	Scanner sc=new Scanner (System.in);
     	System.out.println("\n eneter s.no");
     	sno=sc.nextInt();
     	bout.write(sno)
     }

	}
}

