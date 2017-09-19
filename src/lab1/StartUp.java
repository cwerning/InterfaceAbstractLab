/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Chad Werning
 */
public class StartUp {

    public static void main(String[] args) {

        SchoolCourse course1 = new IntroToProgrammingCourse("Intro to Programming", "C102");
        SchoolCourse course2 = new IntroJavaCourse("Intro to Java", "C103");
        SchoolCourse course3 = new AdvancedJavaCourse("Advanced Java Programming", "C104");

        System.out.println("Course: " + course1.getCourseName() + "\nCourse Number: " + course1.getCourseNumber());
        System.out.println("Course: " + course2.getCourseName() + "\nCourse Number: " + course2.getCourseNumber());
        System.out.println("Course: " + course3.getCourseName() + "\nCourse Number: " + course3.getCourseNumber());
    }

}
