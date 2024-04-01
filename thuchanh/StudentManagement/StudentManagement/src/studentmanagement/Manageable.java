/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagement;

import java.util.ArrayList;

/**
 *
 * @author Teka
 */
public interface Manageable {
    public void addStudent(Student student);

    public boolean deleteStudentById(int sid);

    public void updateStudentById(int sid);

    public void printAllStudent();

    public ArrayList<Student> findStudentByMajor(String major);

    public Student findStudentById(int sid);

    public void sortById();

    public void sortByGpa();

    public void sortByFirstName();

    public void loadFromFile();

    public void saveToFile();
    
    public void DeleteAllDataInFile();
}
