/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1again;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Sujan Maka
 */
public class Task1Again {

    /**
     * @param args the command line arguments
     */
    private static Map<Long, Student> map;
    private static List<Address> addList;
//    private static Set<String> addSubject;
    private static Scanner sc;

    public static void main(String[] args) {
        // TODO code application logic here
        map = new HashMap<>();
        addList = new ArrayList<>();
//        addSubject = new HashSet<>();
        sc = new Scanner(System.in);
        selectionOption();

    }

    private static void selectionOption() {
        System.out.println("1. Click 1 to Enter student info" + "\n"
                + "2. Click 2 to View All Student" + "\n"
                + "3. Click 3 to view Student By Id only" + "\n"
                + "4. Click 4 to Delete Student By Id" + "\n");

        int num = sc.nextInt();
        switch (num) {
            case 1:
                enterStudent();
                break;
            case 2:
                viewAllStudent();
                break;
            case 3:
                viewStudentById();
                break;
            case 4:
                deleteStudentById();
                break;
            default:
                System.out.println("Please enter the numbeer 1, 2, 3 or 4");
                break;
        }
    }

    private static void enterStudent() {

        System.out.println("Enter student id");
        Long id = sc.nextLong();

        Student value = map.get(id);
        if (value != null) {
            System.out.println("\n" + "The user already existed !!!" + "\n");
            selectionOption();
        } else {
            System.out.println("Enter student name");
            String name = sc.next();

            System.out.println("Enter student email");
            String email = sc.next();
            System.out.println("Enter student mobile");
            String mobile = sc.next();
            System.out.println("Enter student faculty");
            String faculty = sc.next();

            System.out.println("Enter student permanent address");
            String pAddress = sc.next();
            System.out.println("Enter student temporary address");
            String tAddress = sc.next();
            addList.add(new Address(pAddress, tAddress));

            System.out.println("Enter student subject1");
            String sub1 = sc.next();
            System.out.println("Enter student subject2");
            String sub2 = sc.next();
            System.out.println("Enter student subject3");
            String sub3 = sc.next();

            Set<String> addSubject = new HashSet<>();
            addSubject.add(sub1);
            addSubject.add(sub2);
            addSubject.add(sub3);

            Student student = new Student(name, email, mobile, faculty, addList, addSubject);
            map.put(id, student);

            selectionOption();
        }

    }

    private static void viewAllStudent() {

        int i = 0;
        for (Map.Entry m : map.entrySet()) {
            long id = (long) m.getKey();
            Student student = (Student) m.getValue();
            System.out.println("id: " + id + "\n"
                    + "name: " + student.getName() + "\n"
                    + "email: " + student.getEmail() + "\n"
                    + "mobile: " + student.getMobile() + "\n"
                    + "faculty:" + student.getFaculty() + "\n"
                    + "address" + student.getAddress().get(i) + "\n"
                    + "Subject" + student.getSubject() + "\n");
        }
        selectionOption();
    }

    private static void viewStudentById() {
        System.out.println("Please enter the student id to view : ");
        long id = sc.nextLong();

        Student s = map.get(id);

        System.out.println("id: " + id + "\n"
                + "name: " + s.getName() + "\n"
                + "email: " + s.getEmail() + "\n"
                + "mobile: " + s.getMobile() + "\n"
                + "faculty:" + s.getFaculty() + "\n"
                + "Subject" + s.getSubject() + "\n");
        selectionOption();
    }

    private static void deleteStudentById() {
        System.out.println("Please enter the student id to delete : ");
        long id = sc.nextLong();

        map.remove(id);

        System.out.println("Student is deleted........");
        selectionOption();
    }
}
