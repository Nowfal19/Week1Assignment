package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("Student Name is Nowfal");
	}
	public void studentDept() {
		System.out.println("Student Department is CE");
	}
	public void studentId() {
		System.out.println("Student ID is 23455");
	}
	public static void main(String[] args) {
		Student obj = new Student();
		obj.collegecode();
		obj.collegeName();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
	}
}
