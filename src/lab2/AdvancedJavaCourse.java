package lab2;

 /**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class AdvancedJavaCourse implements SchoolCourse {

    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber) {
        setCourseName(courseName);
        setCourseNumber(courseNumber);
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

    public final String getPrerequisites() {
        return prerequisites;
    }

    public final void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {

            throw new IllegalArgumentException("Error: courseName cannot be null of empty string");

        }
        this.prerequisites = prerequisites;
    }
}
