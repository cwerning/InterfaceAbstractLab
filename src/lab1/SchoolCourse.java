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
public abstract class SchoolCourse {

    private String courseName;
    private String courseNumber;
    private double credits;

    public SchoolCourse(String courseName, String courseNumber) {
        setCourseName(courseName);
        setCourseNumber(courseNumber);
    }

    public final String getCourseNumber() {
        return courseNumber;
    }

    public final void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {

            throw new IllegalArgumentException("Error: courseNumber cannot be null of empty string");

        }
        this.courseNumber = courseNumber;
    }

    public final double getCredits() {
        return credits;
    }

    public final void setCredits(double credits) {
        if (credits < 0.5 || credits > 4.0) {

            throw new IllegalArgumentException("Error: credits must be in the range 0.5 to 4.0");

        }
        this.credits = credits;
    }

    public final String getCourseName() {
        return courseName;
    }

    public final void setCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {

            throw new IllegalArgumentException("Error: courseName cannot be null of empty string");

        }
        this.courseName = courseName;
    }

}
