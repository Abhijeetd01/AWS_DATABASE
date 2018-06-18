package p2;

import java.io.Serializable;

public class Student implements Serializable{
	
	  private int marks;
	  public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}


	  private String name;
	  private int roll;
	 // public String getRoll;


	public Student(int roll,String name,int marks)
	   {
		     super();
		     this.roll = roll;
		     this.name = name;
		     this.marks =marks;
		     
	   }
	   

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
