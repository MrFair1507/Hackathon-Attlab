/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagement;

import java.io.Serializable;

public class Student implements Serializable {

    private  int sid; // không cho phép cập nhật mã số sinh viên
    private String firstName;
    private String lastName;
    private String major;
    private float gpa;

    public Student(int sid, String lastName, String firstName, String major, float gpa) {
        this.sid = sid;
        this.lastName = lastName;
        this.firstName = firstName;
        this.major = major;
        this.gpa = gpa;
    }

    public Student() {
        
    }
    
    public void setSid(int sid)
    {
        this.sid = sid;
    }
    public int getSid() {
        return sid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        String line = String.format("| %-6d| %-20s | %-10s | %-5s | %4.1f |", sid, lastName, firstName, major, gpa);
        return line;
    }

    // 2 sinh viên giống nhau khi cùng lớp Student và cùng số sid
    // sử dụng để so sánh/tìm kiếm một đối tượng Student trong ArrayList
    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        return false;
    }

}