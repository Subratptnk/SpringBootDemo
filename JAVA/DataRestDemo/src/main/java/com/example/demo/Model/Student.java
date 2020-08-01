package com.example.demo.Model;

public class Student {

	private int studentId;
	private String StudentName;
	private String CourseName;

	public int getStudentId() {
		return studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
		
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", StudentName=" + StudentName + ", CourseName=" + CourseName + "]";
	}
}
