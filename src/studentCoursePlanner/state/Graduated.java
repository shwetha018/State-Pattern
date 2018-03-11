package studentCoursePlanner.state;

public class Graduated implements CoursePlannerStateI {

    private CoursePlannerState planner;

    public Graduated(CoursePlannerState coursePlannerState) {
        this.planner = coursePlannerState;
    }

    @Override
    public void assignCourse(Character str) {
    }

    @Override
    public void verifyPrerequisiteState() {
    }

    @Override
    public void updatePrerequisites() {

    }

    @Override
    public String toString() {
        return "Graduated{ CoursePlannerStateI" + '}';
    }
}
