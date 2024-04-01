/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagement;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.Collections;


public class StudentManagement implements Manageable {
    Scanner sc = new Scanner(System.in);
    // Danh sách các sinh viên
    static String FILE_NAME = "data.bin";
    private ArrayList<Student> studentList;

    public StudentManagement() {
        this.studentList = new ArrayList();
       
    }

    public StudentManagement(ArrayList studentList) {
        this.studentList = studentList;
    }

    public ArrayList<Student> getAllStudent()
    {
        return studentList;
    }
    
    
    public Student getStudentById(int sid)
    {
        for(Student s : studentList)
        {
            if(s.getSid() == sid)
            {
                return s;
            }
        }
        return null;
    }
    
    public int getLastId() {
        int lastId = 1000;
        Student s = Collections.max(studentList,new IdComparator());
        return s.getSid();
    }

    @Override
    public void addStudent(Student student) {
       this. studentList.add(student);
    }
    
    public void AddStudentToFIle(Student student)
    {
        addStudent(student);
        saveToFile();
        
    }
    @Override
    public boolean deleteStudentById(int sid) {
        
        for(Student s : studentList)
        {
            if(s.getSid() == sid)
            {
                studentList.remove(s);
                
            }
        }
        return false;
    }

    @Override
    public void updateStudentById(int sid) {
        for(Student s : studentList)
        {
            if(s.getSid() == sid)
            {
                System.out.println("Enter new First name: ");
                String Fname = sc.nextLine();
                System.out.println("Enter new Last name: ");
                String Lname = sc.nextLine();
                System.out.println("Enter new Major: ");
                String major = sc.nextLine();
                System.out.println("Enter new GPA: ");
                float gpa = sc.nextFloat();
                
                s.setFirstName(Fname);
                s.setLastName(Lname);
                s.setMajor(major);
                s.setGpa(gpa);
            }
        }
    }
    public void updateStudent(Student student)
    {
        for(Student s: studentList)
        {
            if(s.equals(student))
            {
                s.setSid(student.getSid());
                s.setFirstName(student.getFirstName());
                s.setLastName(student.getLastName());
                s.setMajor(student.getMajor());
                s.setGpa(student.getGpa());
            }
        }
    }
    @Override
    public void printAllStudent() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Override
    public ArrayList<Student> findStudentByMajor(String major) {
        
        ArrayList<Student> ListByMajor = new ArrayList();
        for(Student s : studentList)
        {
            if(s.getMajor().equals(major))
            {
                ListByMajor.add(s);
            }   
        }
        return ListByMajor;
    }

    @Override
    public Student findStudentById(int sid) {
        for(Student s : studentList)
        {
            if(s.getSid() == sid)
            {
                return s;
            }
        }
        return null;
    }

    @Override
    public void loadFromFile() {
        studentList.clear();
        
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {

            Object obj = null;

            while ((obj = ois.readObject()) != null) {
                Student student;
                student = (Student) obj;
                addStudent(student);
                
            }

        } catch (EOFException eofe) {
            System.out.println("Done.");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void saveToFile() {
        
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            for (Student student : studentList) {
                oos.writeObject(student);           
            }
            oos.flush();
            oos.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void OverrideFile() {
        
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME,true))) {
            for (Student student : studentList) {
                oos.writeObject(student);           
            }
            oos.flush();
            oos.close();
            System.out.println("Overwrite success!");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    @Override
    public void DeleteAllDataInFile()
    {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            for (Student student : studentList) {
                oos.writeObject("");
            }
            oos.flush();
            oos.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void checkExistsFile()
    {
        File file = new File(FILE_NAME);
        
        if (!file.exists()) {
            try {
                // Nếu tệp không tồn tại, tạo tệp mới
                file.createNewFile();
                System.out.println("New File: " + FILE_NAME);
            } catch (IOException e) {
                System.out.println("Error File Generation: " + e.getMessage());
            }
        } else {
            System.out.println("File Has Been Existed: " + FILE_NAME);
            // Tiếp tục xử lý truy cập vào tệp ở đây nếu cần
        }

        // Tiếp tục xử lý tệp đã được tạo hoặc đã tồn tại ở đây
    }
    
    @Override
    public void sortById() {
        studentList.sort(new IdComparator());
    }

    @Override
    public void sortByGpa() {
        studentList.sort(new GpaComparator());
    }

    @Override
    public void sortByFirstName() {
        studentList.sort(new FirstNameComparator());
    }

}