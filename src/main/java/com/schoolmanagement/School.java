package com.schoolmanagement;

import java.sql.ResultSet;
import java.util.Scanner;

import com.management.dao.SchoolStudentDBOperation;
import com.management.dao.SchoolTeacharDBOperation;
import com.management.entities.SchoolStudent;



public class School {

	 public static void main( String[] args )
	    {
	    	System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
	    	System.out.println("\n\t");
	    	System.out.println("                                                        NUTAN KANAY SCHOOL                                                              ");
	    	System.out.println("\n\t");
	    	System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
	    	
	    	boolean status=true;
	    	do
	    	{
	       try
	       {
	    	Scanner scan=new Scanner(System.in);
	    	System.out.println("*****************************************************************************************");
	    	System.out.println("\t press 1-> Teachar Records Management");
	    	System.out.println("\t press 2-> Student Records Management");
	    	System.out.println("*****************************************************************************************");
	    	int userType=scan.nextInt();
	    	SchoolTeacharDBOperation bo=new SchoolTeacharDBOperation();
	    	if(userType==1)
	    	{
	    		System.out.println("\t Enter Teachar Id:");
	    		long t_Id=scan.nextLong();
	    		System.out.println("\t Enter Password:");
	    		String password=scan.next();
	    		boolean validUser=bo.login(t_Id, password);
	    		if(validUser)
	    		{
	    			System.out.println("*****************************************************************************************");
	    			System.out.println("                             login successfull!!                          ");
	    			System.out.println("*****************************************************************************************");
	    			System.out.println( "\t\n" 
	    					            + "1.Admission Form\r\n"
	    			            		+ "2.Close Admission\r\n"
	    	       		            	+ "3.Check Student Information\r\n"
	    	       		            	+ "4.MarkSheet\r\n"
	    	       		            	+ "5.Password Change\r\n"
	    	       		            	+ "6.Logout");
	    			
	    	    	int operation=scan.nextInt();
	    			if(operation==1)
	    			{
	    				System.out.println("*****************************************************************************************");
						System.out.println("                           Admission form!!                          ");
						System.out.println("*****************************************************************************************");
	    				
					    System.out.println("Enter the id student:");
		    			long accId=scan.nextLong();
	    				
	    				System.out.println("Enter  Student name:");
	    				String accName=scan.next();
	    				
	    				System.out.println("Enter Student password:");
	    				String accPassword=scan.next();
	    				
	    				System.out.println("Enter phone number:");
	    				long accPhone=scan.nextLong();
	    				
	    				System.out.println("Enter email :");
	    				String accEmail=scan.next();
	    				
	    				System.out.println("Enter Student Gender:");
	    				String accGender=scan.next();
	    				System.out.println("Enter Student address:");
	    				String accAddress=scan.next();
	    				System.out.println("Enter Student Branch:");
	    				String accBranch=scan.next();
	    				
	    				SchoolStudent u=new SchoolStudent(accName,accPassword,accPhone,accEmail,accGender,accAddress,accBranch,accId);
	    				if(bo.Addmission(u))
	    				{
	    					System.out.println("*****************************************************************************************");
	    					System.out.println("                         Addmission Successfully!!                   ");
	    					System.out.println("*****************************************************************************************");
	    				}
	    				else
	    				{
	    					System.out.println("*****************************************************************************************");
	    					System.out.println("                          Somthing Missmatch!!!                      ");
	    					System.out.println("*****************************************************************************************");
	    				}
	    				

	    			}
	    			else if(operation==2)
	    			{
	    				System.out.println("Enter account Id for closing account:");
	    				long accId=scan.nextLong();
	    				if(bo.addmissionClose(accId))
	    				{
	    					System.out.println("*****************************************************************************************");
	    					System.out.println("                         closed Successfully!!                ");
	    					System.out.println("*****************************************************************************************");
	    				}
	    				else
	    				{
	    					System.out.println("*****************************************************************************************");
	    					System.out.println("                         Problem in closing!!                ");
	    					System.out.println("*****************************************************************************************");
	    				}

	    				
	    			}
	    			else if(operation==3)
	    			{
	    				System.out.println("*****************************************************************************************");
						System.out.println("                            User Imformation!!                       ");
						System.out.println("*****************************************************************************************");
	    				
					 	System.out.println("Enter the tecture Id for the User:");
	        	       	long accId=scan.nextLong();
	        	       	ResultSet result=bo.checkStudentinfo(accId);
	        	       	if(result!=null)
	        	       	{
	                      while(result.next())
	        	       		{
	        	       		System.out.println("Student Name:"+result.getString(2));
	        	       		System.out.println("Address:"+result.getString(7));
	        	       		System.out.println("Phone Number:"+result.getLong(4));
	        	       		System.out.println("Email:"+result.getString(5));        	     
	        	       		System.out.println("Gender:"+result.getString(6));
	        	       		System.out.println("Branch:"+result.getString(8));    
	        	       	}
	        	       	}
	        	       	else
	        	       	{
	        	       		System.out.println("*****************************************************************************************");
	        	       		System.out.println("                  Account Id does not exist!!                        ");
	        	       		System.out.println("*****************************************************************************************");	        	       	}
						
	    			}
	    			
	    			
	    			else if(operation==4)
	    			{
	    				System.out.println("*****************************************************************************************");
						System.out.println("                                Marksheet!!                          ");
						System.out.println("*****************************************************************************************");
	    				
					 	System.out.println("Enter the Student Id for the User:");
	        	       	long ttId=scan.nextLong();
	        	       	ResultSet result=bo.marksheet(ttId);
	        	       	
	        	    	if(result!=null)
	        	       	{
	                      while(result.next())
	        	       		{
	        	       		System.out.println("Name->"+result.getString(2));
	        	       		System.out.println("English->"+result.getString(3));
	        	       		System.out.println("Marathi->"+result.getString(4));
	        	       		System.out.println("Science->"+result.getString(5)); 
	        	       		System.out.println("Math->"+result.getString(6));
	        	       		System.out.println("History->"+result.getString(7));
	        	       		System.out.println("Geogharphy->"+result.getString(8)); 
	        	       		System.out.println("Total->"+result.getString(9));  
	        	       		System.out.println("Percentage->"+result.getString(10));  
	        	       		
	        	       		
	        	       		
	        	       	}
	        	       	}
	        	       	else
	        	       	{
	        	       		System.out.println("*****************************************************************************************");
	        	       		System.out.println("                                not exist!!                          ");
	        	       		System.out.println("*****************************************************************************************");
	        	       	}
	    				
	        	       	
	    			}
	    			
	    			
	    			
	    			else if(operation==5)
	    	       	{
	    				System.out.println("Enter your Teachar Id:");
	    	       		long tid=scan.nextLong();
	    	       		System.out.println("Set new Password:");
	    	       		String newPassword=scan.next();
	    	       		if(bo.changePassword(tid, newPassword))
	    	       		{
	    	       			System.out.println("*****************************************************************************************");
	    	       			System.out.println("                       Password Changed!!                            ");
	    	       			System.out.println("*****************************************************************************************");
	    	       		}
	    	       		else
	    	       		{
	    	       			System.out.println("*****************************************************************************************");
	    	       			System.out.println("                         Error occurred!!                            ");
	    	       			System.out.println("*****************************************************************************************");
	    	       		}
	    				
	    	       	}
	    			
	    			else if(operation==6)
	    	       	{
	    				bo.logout();
	    				System.out.println("*****************************************************************************************");
	        			System.out.println("                                         Logged Out!!                                    ");
	        			System.out.println("\n\t");
	        			System.out.println("                                      Thank You!!!!!!!!!!!!                              ");
	        			System.out.println("*****************************************************************************************");

	    	       	}
	    			
	    			
	    		}
	    		else
	    		{
	    			System.out.println("*****************************************************************************************");
	    			System.out.println("                                  incorrect                                 ");
	    			System.out.println("*****************************************************************************************");
	    		}
	    	}
	    	
	    	else if(userType==2)
	    	{
	    		SchoolStudentDBOperation ob=new SchoolStudentDBOperation();
	    		System.out.println("\t Enter Account Id:");
	    		long sId=scan.nextLong();
	    		System.out.println("\t Enter Password:");
	    		String password=scan.next();
	    		
	    		if(ob.login(sId, password))
	    		{
	    			System.out.println("*****************************************************************************************");
	    			System.out.println("                               logged in!!                                  ");
	    			System.out.println("*****************************************************************************************");
	    			
	    			System.out.println("\t\n"
	    					+"1.Student Details \r\n"
	    	    			+"2.check TimeTable \r\n"
	    	    			+"3.MarkSheet\r\n"
	    	    			+"4.change Password \r\n"
	    	    			+"5.Logout");
	    			int operation=scan.nextInt();
	    			if(operation==1)
	    			{
	    				System.out.println("*****************************************************************************************");
						System.out.println("                             Student Details!!                       ");
						System.out.println("*****************************************************************************************");
	    				
					 	System.out.println("Enter the Student Id for the User:");
	        	       	long accId=scan.nextLong();
	        	       	ResultSet result=ob.checkStudentinfo(accId);
	        	       	if(result!=null)
	        	       	{
	                      while(result.next())
	        	       		{
	        	       		System.out.println("Student Name:"+result.getString(2));
	        	       		System.out.println("Address:"+result.getString(7));
	        	       		System.out.println("Phone Number:"+result.getLong(4));
	        	       		System.out.println("Email:"+result.getString(5));        	     
	        	       		System.out.println("Gender:"+result.getString(6));
	        	       		System.out.println("Branch:"+result.getString(8));    
	        	       	}
	        	       	}
	        	       	else
	        	       	{
	        	       		System.out.println("*****************************************************************************************");
	        	       		System.out.println("                  Account Id does not exist!!                        ");
	        	       		System.out.println("*****************************************************************************************");	        	       	}
	    			}
	    			else if(operation==2)  
	    			{
	    				System.out.println("*****************************************************************************************");
						System.out.println("                              Timetable!!                            ");
						System.out.println("*****************************************************************************************");
	    				
					 	System.out.println("Enter the day for the timetable:");
					 	System.out.println("1.Monday");
					 	System.out.println("2.Tuesday");
					 	System.out.println("3.Wednesday");
					 	System.out.println("4.Thursday");
					 	System.out.println("5.Friday");
					 	System.out.println("5.Saturday");
					 	
		
	        	       	int ttId=scan.nextInt();
	        	       	ResultSet result=ob.checkTimeTable(ttId);
	        	       	if(result!=null)
	        	       	{
	                      while(result.next())
	        	       		{
	        	       		System.out.println("sub1->"+result.getString(2));
	        	       		System.out.println("sub2->"+result.getString(3));
	        	       		System.out.println("sub3->"+result.getString(4));
	        	       		System.out.println("sub4->"+result.getString(5));        	     
	        	       		System.out.println("sub5->"+result.getString(6));
	        	       		System.out.println("sub6->"+result.getString(7));  
	        	       		
	        	       		
	        	       	}
	        	       	}
	        	       	else
	        	       	{
	        	       		System.out.println("*****************************************************************************************");
	        	       		System.out.println("                                not exist!!                          ");
	        	       		System.out.println("*****************************************************************************************");
	        	       	}
	    				
	    			}
	    			else if(operation==3)
	    			{
	    				System.out.println("*****************************************************************************************");
						System.out.println("                                Marksheet!!                          ");
						System.out.println("*****************************************************************************************");
	    				
					 	System.out.println("Enter the Student Id for the User:");
	        	       	long ttId=scan.nextLong();
	        	       	ResultSet result=ob.marksheet(ttId);
	        	       	
	        	    	if(result!=null)
	        	       	{
	                      while(result.next())
	        	       		{
	        	       		System.out.println("Name->"+result.getString(2));
	        	       		System.out.println("English->"+result.getString(3));
	        	       		System.out.println("Marathi->"+result.getString(4));
	        	       		System.out.println("Science->"+result.getString(5)); 
	        	       		System.out.println("Math->"+result.getString(6));
	        	       		System.out.println("History->"+result.getString(7));
	        	       		System.out.println("Geogharphy->"+result.getString(8)); 
	        	       		System.out.println("Total->"+result.getString(9));  
	        	       		System.out.println("Percentage->"+result.getString(10));  
	        	       		
	        	       		
	        	       		
	        	       	}
	        	       	}
	        	       	else
	        	       	{
	        	       		System.out.println("*****************************************************************************************");
	        	       		System.out.println("                                not exist!!                          ");
	        	       		System.out.println("*****************************************************************************************");
	        	       	}
	    				
	        	       	
	    			}
	    			
	    			 else if(operation==4)
	    	       	{
	    	    		System.out.println("Enter new password:");
	    	    		String newPassword=scan.next();
	    	       		if(ob.changePassword(sId, newPassword))
	    	       		{
	    	       			System.out.println("*****************************************************************************************");
	    	    			System.out.println("                        Password changed successfully!!             ");
	    	    			System.out.println("*****************************************************************************************");

	    	       		}
	    	       		else
	    	       		{
	    	       			System.out.println("*****************************************************************************************");
	    	    			System.out.println("                   Problem in password change!!                      ");
	    	    			System.out.println("*****************************************************************************************");

	    	       		}
	    	       	}
	        	     
	               else if(operation==5)
	    	       	{
	    	       		ob.logout();
	    	       		status=false;
	    	       		System.out.println("*****************************************************************************************");
	        			System.out.println("                                         Logged Out!!                                    ");
	        			System.out.println("\n\t");
	        			System.out.println("                                      Thank You!!!!!!!!!!!!                              ");
	        			System.out.println("*****************************************************************************************");

	    	       	}
	    	    	else 
	    	       	{
	    	    		System.out.println("*****************************************************************************************");
	        			System.out.println("                                         Wrong Input!!                                   ");
	        			System.out.println("*****************************************************************************************");

	    	       	}   	
	    		}
	 
	    		else
	    		{
	    			System.out.println("*****************************************************************************************");
	    			System.out.println("                     User Id or Password Incorrect!!!                       ");
	    			System.out.println("*****************************************************************************************");
	    		}
	    		
	    	}
	    	else
	    	{
	    	   System.out.println("\t Please enter a correct input!!");
	    	}
	    }
	       
	    	 catch(Exception e)
	         {
	      	   System.out.println(e.getMessage());
	      	   System.out.println("\t Wrong Input!!");
	      	   System.out.println("\t Provide Number Input!!");
	      	 System.out.println("*****************************************************************************************");
	         }
	    	}
	      	while(status);
	    
	    	}
}
