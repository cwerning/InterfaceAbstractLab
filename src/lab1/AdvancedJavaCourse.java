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

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

}
