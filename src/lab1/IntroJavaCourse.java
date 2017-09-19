package lab1;

/**
 * Describe responsibilities here.
 *
 * @author Chad Werning
 * @version 1.00
 */
public class IntroJavaCourse extends SchoolCourse {

    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

}
