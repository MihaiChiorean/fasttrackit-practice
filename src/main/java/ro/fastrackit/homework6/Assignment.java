package ro.fastrackit.homework6;

import java.util.Objects;
import java.util.UUID;

public class Assignment {
    private Integer courseNumber;
    private String assignmentTitle;
    private String assignmentDescription;
    private String difficultyLevel;
    private UUID uniqueId;

    public Integer getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(Integer courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getAssignmentTitle() {
        return assignmentTitle;
    }

    public void setAssignmentTitle(String assignmentTtitle) {
        this.assignmentTitle = assignmentTtitle;
    }

    public String getAssignmentDescription() {
        return assignmentDescription;
    }

    public void setAssignmentDescription(String assignmentDescription) {
        this.assignmentDescription = assignmentDescription;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public UUID getUniqueId() {
        return uniqueId;
    }

    public Assignment(Integer courseNumberInput, String assignmentTitleInput, String assignmentDescriptionInput, String difficultyLevelInput) {
        this.courseNumber = courseNumberInput;
        this.assignmentTitle = assignmentTitleInput;
        this.assignmentDescription = assignmentDescriptionInput;
        this.difficultyLevel = difficultyLevelInput;
        this.uniqueId = UUID.randomUUID();
    }

    @Override
    public String toString() {
        return  "{ " +
                "courseNumberInput:"  + courseNumber + "\n" +
                "assignmentTitle: " + assignmentTitle + "\n" +
                "assignmentDescription: " + assignmentDescription + "\n" +
                "difficultyLevel: " + difficultyLevel + "\n" +
                "uniqueId: " + uniqueId + "\n" +
                "}" + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Assignment that = (Assignment) o;
        return Objects.equals(courseNumber, that.courseNumber) &&
                Objects.equals(assignmentTitle, that.assignmentTitle) &&
                Objects.equals(assignmentDescription, that.assignmentDescription) &&
                Objects.equals(difficultyLevel, that.difficultyLevel) &&
                Objects.equals(uniqueId, that.uniqueId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseNumber, assignmentTitle, assignmentDescription, difficultyLevel, uniqueId);
    }
}
