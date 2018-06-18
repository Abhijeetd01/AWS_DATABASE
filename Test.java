package p1;

import java.util.ArrayList;
import java.util.Scanner;

import p2.Student;
  
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ArrayList alist = new ArrayList();
		    Scanner sc= new Scanner(System.in);
		    int count =1;
		    while(true)
		    {
               System.out.println("Enter the Details of the students"+(count++));
               System.out.println("=============================================");
               System.out.println("Enter Roll:");
               int roll =sc.nextInt();
               System.out.println("Enter the Name");
               String name = sc.next();
               System.out.println("Enter the Marks");
               int marks = sc.nextInt();
               Student st = new Student(roll,name,marks);
                     
                      alist.add(st);
             
             System.out.println("Record saved sucessfully");
             System.out.println("Do you want more(Y/N)");
             String choice =sc.next();
               if(choice.equalsIgnoreCase("n"))
            	    break;
             }
		    System.out.println("Student details are :");  // to print the student details ....
		    System.out.println("=========================");
		         for(int i=0;i<alist.size();i++)
		         {
		        	   Object obj =alist.get(i);
		        	   Student s=(Student)obj;
		        	   System.out.println("Roll no is :"+s.getRoll());
		        	   System.out.println("Roll no is :"+s.getName());
		        	   System.out.println("Roll no is :"+s.getMarks());
		         }
		 
   }
	       

}
