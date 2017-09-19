package lab1;

/**
 * Describe responsibilities here.
 *
 * @author Chad Werning
 * @version 1.00
 */
public class AdvancedJavaCourse extends SchoolCourse {

    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
    }

    public final String getPrerequisites() {
        return prerequisites;
    }

    public final void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {

            throw new IllegalArgumentException("Error: courseNumber cannot be null of empty string");

        }
        this.prerequisites = prerequisites;
    }

}
