package main;


import java.sql.ResultSet;
import java.util.Scanner;
import operations.Deletion;
import operations.Updation;
import operations.insert_userbase;
import operations.selection;

public class Main {
	
	public static void main(String[] args) throws Exception
	{
	   Scanner sc=new Scanner(System.in);
	   int num;
	   do 
	   {
	   System.out.println("-------------");		
		
		
		System.out.println("1.insertUserbase");
		System.out.println("2.update");
		System.out.println("3.delete");
		System.out.println("4.selectall");
		System.out.println("5.selectparticular");
		
		System.out.println("0.exit()");
		System.out.println("---------");
	   System.out.println("enter the number");
	   num=sc.nextInt();
	   switch(num)
	   
	   {
	   case 0:
	   {
		   System.out.println("you were exit");
		   break;
	   }
	   
	   
	   case 1:
	   {
		  
		   System.out.println("-------insertion started-----");
		   System.out.println("enter the (integer) id to insert");
	       int id=sc.nextInt();
	       sc.nextLine();
	       System.out.println("enter the movie_name to insert");
		   String movie_name=sc.nextLine();
		   
		   System.out.println("enter the number rating (?/10) to insert");
		   int rating=sc.nextInt();
		   System.out.println("enter the year of movie to insert");
		   int year=sc.nextInt();
		   int r=insert_userbase.insert_u(id,movie_name,rating,year);
		   if(r>0)
		   {	   
		       System.out.println("data's inserted");
		   } 
		   else {
			   System.out.println("data already present not inserted");
		   }
		   break;
	   }
	   
	   
	   
	   case 2:
	   {
		   System.out.println("-------updation started-------");
		  
		   System.out.println("enter the id where you want cahnges");
	       int id=sc.nextInt();
	       sc.nextLine();
		   System.out.println("enter the movie_name to update or else enter old one");
		   String movie_name=sc.nextLine();
		   System.out.println("enter the number rating (?/10) to update else enter old one");
		   int rating=sc.nextInt();
		   System.out.println("enter the year of movie to update else enter old one");
		   int year=sc.nextInt();
		   
		   
		   int r=Updation.update_details(movie_name,rating,year,id);
		   if(r>0)
		   {	   
		       System.out.println("data's updated");
		   } 
		   else {
			   System.out.println("data already present not updated");
		   }
		   break;
	   }
	   
	   
	   case 3:
	   {
		   
	      System.out.println("-----deletion started-----");
	      System.out.println("enter the id where you want to delete the record");
	      int id=sc.nextInt();
		  int r=Deletion.deletion(id);
		  if(r>0)
		   {	   
		       System.out.println("data's  deleted");
		   } 
		   else {
			   System.out.println("data already deleted or not present");
		   }
		  break;
	   }
	   
	   
	   
	   case 4:
	   {
		   System.out.println("--------all the records in the table------");
		   ResultSet ss=selection.selects();
		   while(ss.next())
		   {
			   System.out.println(ss.getInt(1)+" "+ss.getString(2)+"   "+ss.getInt(3)+" "+ss.getInt(4));
			   
		   }
		   break;
	   }
	   
	   
	   
	   case 5:
	   {
		   System.out.println("-----select particular raecord-------");
		   System.out.println("enter the id where you need to select the record");
		   int id=sc.nextInt();
		   ResultSet ss=selection.select_con(id);
		   if(ss.next())
		   {
			   System.out.println(ss.getInt(1)+" "+ss.getString(2)+"   "+ss.getInt(3)+" "+ss.getInt(4));
			   
		   }
		   else {
			   System.out.println("wrong id");
		   }
		   
		   break;
	   }
	   default:
	   {
		   System.out.println("wrong number");
		   break;
	   }
	}

}
	   while(num!=0);
	   sc.close();
		   
	   
}
}
	   
	   
