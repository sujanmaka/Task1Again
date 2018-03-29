/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1again;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Sujan Maka
 */
public class Student {

    private String name;
    private String email;
    private String mobile;
    private String faculty;
    private List<Address> address;
    private Set<String> subject;

    public Student() {
    }

    public Student(String name, String email, String mobile, String faculty, List<Address> address, Set<String> subject) {

        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.faculty = faculty;
        this.address = address;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public Set<String> getSubject() {
        return subject;
    }

    public void setSubject(Set<String> subject) {
        this.subject = subject;
    }

//    @Override
//    public String toString() {
//        return "Student{" + "id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", faculty=" + faculty + ", address=" + address + ", subject=" + subject + ", sub=" + sub + '}';
//    }
}
