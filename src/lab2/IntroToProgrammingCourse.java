package lab2;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroToProgrammingCourse implements SchoolCourse {

    private String courseName;
    private String courseNumber;
    private double credits;

    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

    @Override
    public final String getCourseNumber() {
        return courseNumber;
    }

    @Override
    public final void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {

            throw new IllegalArgumentException("Error: courseNumber cannot be null of empty string");

        }
        this.courseNumber = courseNumber;
    }

    @Override
    public final double getCredits() {
        return credits;
    }

    @Override
    public final void setCredits(double credits) {
        if (credits < 0.5 || credits > 4.0) {

            throw new IllegalArgumentException("Error: credits must be in the range 0.5 to 4.0");

        }
        this.credits = credits;
    }

    @Override
    public final String getCourseName() {
        return courseName;
    }

    @Override
    public final void setCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {

            throw new IllegalArgumentException("Error: courseName cannot be null of empty string");

        }
        this.courseName = courseName;
    }

}
