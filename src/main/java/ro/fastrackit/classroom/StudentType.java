package ro.fastrackit.classroom;

public enum StudentType implements ScholarType {
    BACHELOR ("Bachelor"),
    MASTERS ("Masters"),
    PHD ("PHD");

    private String description;

    StudentType( String shortDescription) {
        this.description = shortDescription;
    }

    public String getDescription(){
        return description;
    }
}
