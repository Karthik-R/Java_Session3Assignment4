package javaSession3Assignment4;

import java.util.Scanner;

class Student {
	private String name;
	private long phone_number;
	private int roll_number;
	private String clas;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the phone_number
	 */
	public long getPhone_number() {
		return phone_number;
	}

	/**
	 * @param phone_number
	 *            the phone_number to set
	 */
	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}

	/**
	 * @return the roll_number
	 */
	public int getRoll_number() {
		return roll_number;
	}

	/**
	 * @param roll_number
	 *            the roll_number to set
	 */
	public void setRoll_number(int roll_number) {
		this.roll_number = roll_number;
	}

	/**
	 * @return the class_name
	 */
	public String getClass_name() {
		return clas;
	}

	/**
	 * @param class_name
	 *            the class_name to set
	 */
	public void setClass_name(String class_name) {
		this.clas = class_name;
	}
	
	String result(int s1,int s2,int s3,int rollnumber){
		if(rollnumber != 0){
		if (s1 > 35 && s2 > 35 && s3 > 35){
			return "Pass";
		}else{
			return "Fail";
		}
	  }
		return "Invalid roll number";
	}
}


public class StudentResultProcessing extends Student {

	public static void main(String[] args) {
		
		String name, clas_standard, res;
		long phno;
		int rno,sub1,sub2,sub3;
		Student stu = new Student();
		Scanner scan=new Scanner(System.in);  // Scanner object to take the input from the user.
		System.out.println("Enter student name");
		name = scan.next();
		stu.setName(name);
		System.out.println("Enter student roll number");
		rno = scan.nextInt();
		stu.setRoll_number(rno);
		System.out.println("Enter student phone number");
		phno = scan.nextLong();
		stu.setPhone_number(phno);
		System.out.println("Enter student's class");
		clas_standard = scan.next();
		stu.setClass_name(clas_standard);
		System.out.println("Enter marks for subject 1");
		sub1 = scan.nextInt();
		System.out.println("Enter marks for subject 2");
		sub2 = scan.nextInt();
		System.out.println("Enter marks for subject 3");
		sub3 = scan.nextInt();
		scan.close();
		res = stu.result(sub1, sub2, sub3, rno);
		System.out.println("*****Student Details*****");
		System.out.println("Student Name: "+stu.getName());
		System.out.println("Student Roll Number: "+stu.getRoll_number());
		System.out.println("Student Phone Number: "+stu.getPhone_number());
		System.out.println("Student Class: "+stu.getClass_name());
		System.out.println("Result: "+res);
	}

}
