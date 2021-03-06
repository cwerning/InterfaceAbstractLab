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
        
        /*I think that using the Liskov Substitution principle makes the classes more flexible.
        I also think that by making all the getters and setters final within the superclass it
        makes inheriting the concrete methods less dangerous to the subclasses. This is because
        if the programmer doesn't realize the class has those methods already, they could over-write
        the method and not realize they're breaking the intended purpose of it.
        
        I really wanted to extend AdvancedJavaCourse from IntroJavaCourse, but that would fail the
        "Is a" test. It was just hard because I need all the same properties and methods, but it is
        still the wrong abstraction. I guess it made sense when there could very well be 1000 more 
        methods that wouldn't relate to eachother. It was just confusing because of the simplicity
        of the classes as they are.
        
        */
        

        SchoolCourse course1 = new IntroToProgrammingCourse("Intro to Programming", "C102");
        SchoolCourse course2 = new IntroJavaCourse("Intro to Java", "C103");
        SchoolCourse course3 = new AdvancedJavaCourse("Advanced Java Programming", "C104");

        System.out.println("Course: " + course1.getCourseName() + "\nCourse Number: " + course1.getCourseNumber());
        course1.setCourseName("Beginner Programming");
        System.out.println("Course: " + course1.getCourseName() + "\nCourse Number: " + course1.getCourseNumber());
        System.out.println("Course: " + course2.getCourseName() + "\nCourse Number: " + course2.getCourseNumber());
        System.out.println("Course: " + course3.getCourseName() + "\nCourse Number: " + course3.getCourseNumber());
    }

}
