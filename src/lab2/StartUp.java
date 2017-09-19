/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author L115student
 */
public class StartUp {
    
    public static void main(String[] args) {
        
        /*
        I like that the code is flexible because of the Liskov Substitution principle.
        What I find interesting is the you cannot have a constructor in the interface class.
        Initially what I wanted to do was implement the introToProgrammingCourse from School course,
        extend the IntroToJavaCourse from intro to programming and add the prerequisites, and then extend
        AdvancedJava from IntroToJava. The problem with the Liskov Substitution principle there would be I 
        couldnt create a IntroToProgrammingCourse and then assign a new IntroToJava course because
        IntroToJava "isn't a" IntroToProgrammingCourse. It needs all the same properties but isn't the right
        abstractions.
        */
        
        lab2.SchoolCourse course1 = new lab2.IntroToProgrammingCourse("Intro to Programming", "C102");
        lab2.SchoolCourse course2 = new lab2.IntroJavaCourse("Intro to Java", "C103");
        lab2.SchoolCourse course3 = new lab2.AdvancedJavaCourse("Advanced Java Programming", "C104");

        System.out.println("Course: " + course1.getCourseName() + "\nCourse Number: " + course1.getCourseNumber());
        course1.setCourseName("Beginner Programming");
        System.out.println("Course: " + course1.getCourseName() + "\nCourse Number: " + course1.getCourseNumber());
        System.out.println("Course: " + course2.getCourseName() + "\nCourse Number: " + course2.getCourseNumber());
        System.out.println("Course: " + course3.getCourseName() + "\nCourse Number: " + course3.getCourseNumber());
    }
}
