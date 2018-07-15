


import java.lang.*;
import java.io.*;

//abstract class Marvellous_Infosystem
abstract class Marvellous_Infosystem
{
  abstract void getBatchInfo();
  abstract void getContentInfo();
  abstract void getBatchDuration();
  abstract void getBatchSchedule();
  
  void getAddress()
  {
    System.out.println();
    System.out.println("The Address is: ");
    System.out.println("Prakash Lagu Motiwale Path,Pandurang Colony,Erandawane,Pune,Maharashtra 411004");
  }
}


//Pre_Placement Activity class
class Pre_Placement_Activity extends Marvellous_Infosystem
{
  
   void getBatchInfo()
   {
    System.out.println();
    System.out.println("The Batch information is below as:  ");
    System.out.println("This Batch covers the basic and advance concepts of Programming language");
   }

   void getContentInfo()
   {
        System.out.println();
        System.out.println("The Batch Contents is:  ");
        System.out.println(" 1.Computer Architecture "+"\n"+
		           " 2.Computer Fundamental "+"\n"+
			   " 3.C Programming "+"\n"+   
        		   " 4.C++ Programming "+"\n"+ 
			   " 5.Data Structure Using C "+"\n"+
			   " 6.Core JAVA "+"\n"+
			   " 7.Advance JAVA "+"\n"+
			   " 8.Database Programming "+"\n"+
			   " 9.Networking Concept "+"\n"+
			   " 10.System Programming "+"\n"+
			   " 11.PHP "+"\n"+
        		   " 12.Web Development "+"\n"+
			   " 13.Logical Aptitude ");
   }

   void getBatchDuration()
   {
    System.out.println();
    System.out.print("The Batch Duration is: ");
    System.out.println("4 to 5 Months");
   }

   void getBatchSchedule()
   {
    System.out.println();
    System.out.print("The Batch Schedule is:");
    System.out.println("saturday,sunday & Public holidays");
   }
   
}


//Logic_Building class
class Logic_Building extends Marvellous_Infosystem
{
  
   void getBatchInfo()
   {
    System.out.println();
    System.out.println("The Batch information is below as:  ");
    System.out.println("This batch covers all the aspects which are required to build confidence in programming ");
   }

   void getContentInfo()
   {
     System.out.println();
     System.out.println("The Batch Contents is:  ");
     System.out.println(" 1.Algorithm design statergies "+"\n"+
                        " 2.Implementing algorithms for different problem statements "+"\n"+
                        " 3.Calculating time and space complexities of algorithms "+"\n"+   
                        " 4.Programms on Numbers and Digits"+"\n"+
                        " 5.Programms on Arrays "+"\n"+
                        " 6.Programms on Strings "+"\n"+ 
                        " 7.Programms on Recursion "+"\n"+
                        " 8.Programms on Pattern Printing "+"\n"+
                        " 9.Programms on File Handling "+"\n"+
                        " 10.Programms on Searching and Sorting techniques "+"\n"+
                        "And other such complex and important topics will be covered ");

   }
   void getBatchDuration()
   {
    System.out.println();
    System.out.print("The Batch Duration is: ");
    System.out.println("4 months");
   }
 
   void getBatchSchedule()
   {
    System.out.println();
    System.out.print("The Batch Schedule is:");
    System.out.println("Tuesday to Friday");
   }
   
}

//Industrial_Project_Development class
class Industrial_Project_Development extends Marvellous_Infosystem
{
  
   void getBatchInfo()
   {
    System.out.println();
    System.out.println("The Batch information is below as:  ");
    System.out.println("This batch covers how to develop industrial projects ");  
   }
   void getContentInfo()
   {
     System.out.println();
     System.out.println("The Batch Contents is:  ");
     System.out.println(" 1.Project on C Programming Language "+"\n"+
                        " 2.Project on C++ Programming Language "+"\n"+
                        " 3.Project on JAVA Programming Language "+"\n"+   
                        " 4.Project on Android"+"\n"+
                        " 5.Project on Windows SDK"+"\n"+
                        " 6.Project on raspberry pi "+"\n"+ 
                        " 7.Project on Linux System Programming "+"\n"+
                        "   And Other projects. "+"\n");
                       
   }
   void getBatchDuration()
   {
    System.out.println();
    System.out.print("The Batch Duration is: ");
    System.out.println("2 to 3 Months");
   }
   void getBatchSchedule()
   {
     System.out.println();
     System.out.print("The Batch Schedule is:");  
     System.out.println("1 or 2 days in the week");
   }
   
}

//Multi_Operating_System_Programming class
class Multi_Operating_System_Programming extends Marvellous_Infosystem
{
  
   void getBatchInfo()
   {
    System.out.println();
    System.out.println("The Batch information is below as:  ");
    System.out.println(" To learn Operating System Internals and to develop the applications");
    System.out.println(" This batch will have 4 Operating Systems ");
    
   }
   void getContentInfo()
   {
    System.out.println();
    System.out.println("The Batch Contents is:  ");

     System.out.println(" 1.Linux Internals "+"\n"+
                        " 2.Linux System Programming"+"\n"+
                        " 3.Windows Internals "+"\n"+   
                        " 4.Windows Application Development"+"\n"+
                        " 5.Android Architecture"+"\n"+
                        " 6.Android Application Development "+"\n"+ 
                        " 7.IPHONE Application Development using Objective C ");
                     
  
   }
   void getBatchDuration()
   {
    System.out.println();
    System.out.print("The Batch Duration is: ");
    System.out.println("4 to 5 Months");
   }
   void getBatchSchedule()
   {
    System.out.println();
    System.out.print("The Batch Schedule is:");
    System.out.println("Saturday,Sunday and Public Holidays");
   }
   
}


//Main_Class
//JVM starts the execution of programm from this class
class Main_Class
{
 public static void main(String args[])throws Exception
 {
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
  
    Marvellous_Infosystem Ref;
   
   
    while(true)
    {
      System.out.println();
      System.out.println("Marvellous Infosystem by Piyush Khairnar-Educating for better tomorrow");
      System.out.println();
      System.out.println("1.Pre-Placement Activity");
      System.out.println("2.Logic Building");
      System.out.println("3.Industrial Project Development");
      System.out.println("4.Multi-Operating System Programming");
      System.out.println();
      System.out.println("Enter your choice: ");
      int iNum=Integer.parseInt(br.readLine());
      System.out.println();
      switch(iNum)
      {
	case 1:
	        {
		  Ref=new Pre_Placement_Activity();
	          System.out.println("You are selecting Pre-Placement Activity Batch: ");
		  System.out.println("Which information you want about this batch: ");
	 	  System.out.println("1.About the batch ");
	 	  System.out.println("2.About the contents of that batch: ");
	 	  System.out.println("3.About the batch duration: ");
	 	  System.out.println("4.About the Schedule of this batch: ");
	 	  System.out.println("5.All the information about the batch ");
		  System.out.println();
		  System.out.println("Enter your choice: ");
	          int iNum1=Integer.parseInt(br.readLine());
	
	 	  switch(iNum1)
		  {
			case 1:
			        {
				  Ref.getBatchInfo();
				  break;
				}
			case 2:
				{
				  Ref.getContentInfo();
				  break;
				}
			case 3:
				{
				 Ref.getBatchDuration();
				 break;
				}
			case 4:
				{
				  Ref.getBatchSchedule();
				  break;
				}
			case 5:	
				{
				  Ref.getAddress();
				  Ref.getBatchInfo();
				  Ref.getContentInfo();
				  Ref.getBatchDuration();
				  Ref.getBatchSchedule();
				  break;
				}
			default:
				{
				 System.out.println();
				 System.out.println("Invalid Choice ");
				 break;
				}
	       }//end of switch
	       break;
	    }//end of case 1
	case 2:
	        {
		  Ref=new Logic_Building();
	          System.out.println("You are selecting Logic Building Batch: ");
		  System.out.println("Which information you want about this batch: ");
	 	  System.out.println("1.About the batch ");
	 	  System.out.println("2.About the contents of that batch: ");
	 	  System.out.println("3.About the batch duration: ");
	 	  System.out.println("4.About the Schedule of this batch: ");
	 	  System.out.println("5.All the information about the batch ");
	          System.out.println();
		  System.out.println("Enter your choice: "); 
                  int iNum1=Integer.parseInt(br.readLine());
	
	 	  switch(iNum1)
		  {
			case 1:
			        {
				  Ref.getBatchInfo();
				  break;
				}
			case 2:
				{
				  Ref.getContentInfo();
				  break;
				}
			case 3:
				{
				 Ref.getBatchDuration();
				 break;
				}
			case 4:
				{
				  Ref.getBatchSchedule();
				  break;
				}
			case 5:	
				{
				  Ref.getAddress();
				  Ref.getBatchInfo();
				  Ref.getContentInfo();
				  Ref.getBatchDuration();
				  Ref.getBatchSchedule();
				  break;
				}
			default:
				{
				 System.out.println();
				 System.out.println("Invalid Choice ");
				 break;
				}
	       }//end of switch
	       break;
	    }//end of case 2

	case 3:
	        {
		  Ref=new Industrial_Project_Development();
                  System.out.println("You are selecting Industrial Project Development  Batch: ");
		  System.out.println("Which information you want about this batch: ");
	 	  System.out.println("1.About the batch ");
	 	  System.out.println("2.About the contents of that batch: ");
	 	  System.out.println("3.About the batch duration: ");
	 	  System.out.println("4.About the Schedule of this batch: ");
	 	  System.out.println("5.All the information about the batch ");
		  System.out.println();
		  System.out.println("Enter your choice: ");
	          int iNum1=Integer.parseInt(br.readLine());
	
	 	  switch(iNum1)
		  {
			case 1:
			        {
				  Ref.getBatchInfo();
				  break;
				}
			case 2:
				{
				  Ref.getContentInfo();
				  break;
				}
			case 3:
				{
				 Ref.getBatchDuration();
				 break;
				}
			case 4:
				{
				  Ref.getBatchSchedule();
				  break;
				}
			case 5:	
				{
				  Ref.getAddress();
				  Ref.getBatchInfo();
				  Ref.getContentInfo();
				  Ref.getBatchDuration();
				  Ref.getBatchSchedule();
				  break;
				}
			default:
				{
				 System.out.println();				 
				 System.out.println("Invalid Choice ");
				 break;
				}
	          }//end of switch
	           break;
	       }//end of case 3
      
        case 4:
	        {
		  Ref=new Multi_Operating_System_Programming();
		  System.out.println("You are selecting Multi-Operating System Batch: ");
		  System.out.println("Which information you want about this batch: ");
	 	  System.out.println("1.About the batch ");
	 	  System.out.println("2.About the contents of that batch: ");
	 	  System.out.println("3.About the batch duration: ");
	 	  System.out.println("4.About the Schedule of this batch: ");
	 	  System.out.println("5.All the information about the batch ");
		  System.out.println();
		  System.out.println("Enter your choice: ");  
	          int iNum1=Integer.parseInt(br.readLine());
	
	 	  switch(iNum1)
		  {
			case 1:
			        {
				  Ref.getBatchInfo();
				  break;
				}
			case 2:
				{
				  Ref.getContentInfo();
				  break;
				}
			case 3:
				{
				 Ref.getBatchDuration();
				 break;
				}
			case 4:
				{
				  Ref.getBatchSchedule();
				  break;
				}
			case 5:	
				{
				  Ref.getAddress();
				  Ref.getBatchInfo();
				  Ref.getContentInfo();
				  Ref.getBatchDuration();
				  Ref.getBatchSchedule();
				  break;
				}
			default:
				{
				 System.out.println();
				 System.out.println(" Invalid Choice ");
				 break;
				}
	       }//end of switch
	       break;
	    }//end of case 4
   
    default:
	    {
	     System.out.println();
	     System.out.println("invalid Choice");
	     break;
	    }	  
        
      }//end of outer switch
     
      System.out.println();
      System.out.println("Do you want to continue: Yes/yes || No/no  ");
      String str=br.readLine();
      if(str.equals("No")||str.equals("no"))
      {
	System.out.println();
        System.out.println("Thank you");
	break;
      }
      else if(str.equals("Yes")||str.equals("yes"))
      {
       continue;
      }
      else
      {
	System.out.println("Invalid Choice");
        break;
      }
    }//end of while

  }//end of main method
}//end of main class 

