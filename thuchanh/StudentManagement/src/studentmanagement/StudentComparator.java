/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagement;


import java.util.Comparator;

class IdComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getSid() - s2.getSid();
    }

}

class GpaComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return (int) (s1.getGpa() - s2.getGpa());
    }

}

class FirstNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getFirstName().compareToIgnoreCase(s2.getFirstName());
    }
}
