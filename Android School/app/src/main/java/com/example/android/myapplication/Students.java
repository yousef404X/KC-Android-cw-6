package com.example.android.myapplication;

public class Students {

    String studentName;
    int studentAge;
    int studentGrade;
    int studnetimg;

    public Students(String studentName, int studentAge, int studentGrade, int studnetimg) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentGrade = studentGrade;
        this.studnetimg = studnetimg;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public int getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(int studentGrade) {
        this.studentGrade = studentGrade;
    }

    public int getStudnetimg() {
        return studnetimg;
    }

    public void setStudnetimg(int studnetimg) {
        this.studnetimg = studnetimg;
    }
}