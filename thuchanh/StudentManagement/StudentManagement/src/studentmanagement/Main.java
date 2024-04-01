/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagement;

/**
 *
 * @author Teka
 */
import java.util.Scanner;
public class Main {
     static StudentManagement sm = new StudentManagement();
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int choice = 0;
        // xử lý menu người dùng
        do {
            System.out.println("---STUDENT MANAGEMENT SYSTEM---");
            System.out.println(
                    " 1. Add new student\n"
                    + " 2. Delete student by id\n"
                    + " 3. Update student by id\n"
                    + " 4. Print all students\n"
                    + " 5. Find student by major\n"
                    + " 6. Find student by Id\n"
                    + " 7. Sort by Id\n"
                    + " 8. Sort by GPA\n"
                    + " 9. Sort by first name\n"
                    + "20. Load from file\n"
                    + "21. Save to file\n"
                    + "22. Delete Data in file\n"
                    + " 0. Exit");
            System.out.print("Enter your choice (0-22): ");
            choice = input.nextInt();
            
            switch (choice) {
                case 1:
                    menu1();
                    break;
                case 2:
                    menu2();
                    break;
                case 3:
                    menu3();
                    break;
                case 4:
                    menu4();
                    break;
                case 5:
                    menu5();
                    break;
                case 6:
                    menu6();
                    break;
                case 7:
                    menu7();
                    break;
                case 8:
                    menu8();
                    break;
                case 9:
                    menu9();
                    break;
                case 20:
                    menu20();
                    break;
                case 21:
                    menu21();
                    break;
                case 22:
                    menu22();
                    break;
                case 23:
                    
                    System.out.println(sm.getStudentById(04));
                    break;
                case 0:
                    menu0();
                    break;
            }
            
        } while (choice != 0);
    }
    
    static void menu0() {
        System.out.println("BYE...BYE...");
    }

    // add new student
    static void menu1() {
        Scanner sc = new Scanner(System.in);
       
       System.out.print("Enter Sid: ");
       int sid = sc.nextInt();
       
       System.out.println("Enter Last Name: ");
       String Lname = sc.next();
       
       System.out.println("Enter First Name: ");
       String Fname = sc.next();
       
       System.out.println("Enter Major : ");
       String major = sc.next();
       
       System.out.println("Enter GPA: ");
       float gpa = (float)sc.nextFloat();
       
       Student student = new Student(sid, Lname, Fname, major, gpa);
        
        sm.addStudent(student);
    }

    static void menu2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student id want to delete: ");
        int sid = sc.nextInt();
        sm.deleteStudentById(sid);
    }
    
    static void menu3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student id want to delete: ");
        int sid = sc.nextInt();
        sm.updateStudentById(sid);
    }
    
    static void menu4() {
        System.out.println("+----------------------------------------------------------+");
        System.out.printf("| %-6s| %-20s | %-10s | %-5s | %4s |\n", "SID", "LAST NAME", "FIRST NAME", "MAJOR", "GPA");
        System.out.println("+----------------------------------------------------------+");
        sm.printAllStudent();
        System.out.println("+----------------------------------------------------------+");
    }

    // find student by major
    static void menu5() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter major: ");
        String major = input.nextLine();
        
        System.out.println("+----------------------------------------------------------+");
        System.out.printf("| %-6s| %-20s | %-10s | %-5s | %4s |\n", "SID", "LAST NAME", "FIRST NAME", "MAJOR", "GPA");
        System.out.println("+----------------------------------------------------------+");
        sm.findStudentByMajor(major);
        System.out.println("+----------------------------------------------------------+");
    }

    // find student by id
    static void menu6() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        int sid = Integer.parseInt(input.nextLine());
        
        System.out.println("+----------------------------------------------------------+");
        System.out.printf("| %-6s| %-20s | %-10s | %-5s | %4s |\n", "SID", "LAST NAME", "FIRST NAME", "MAJOR", "GPA");
        System.out.println("+----------------------------------------------------------+");
        sm.findStudentById(sid);
        System.out.println("+----------------------------------------------------------+");
    }

    // sort by id
    static void menu7() {
        sm.sortById();
    }

    // sort by gpa
    static void menu8() {
        sm.sortByGpa();
    }

    // sort by first name
    static void menu9() {
        sm.sortByFirstName();
    }
    
    static void menu20() {
        sm.checkExistsFile();
        
        sm.loadFromFile();
        System.out.println("Loading all students from file...");
    }
    
    static void menu21() {
        sm.checkExistsFile();
        
        sm.saveToFile();
        System.out.println("Storing all students to file... DONE.");
    }
    
    static void menu22()
    {
        sm.checkExistsFile();
        
        sm.DeleteAllDataInFile();
        System.out.println("Deleting all students in file....");
        
    }
}
