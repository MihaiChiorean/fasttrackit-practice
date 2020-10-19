package ro.fastrackit.classroom;

public enum ProfessorType implements ScholarType{
    ASSISTANT ("Assistant"),
    ASSOCIATE ("Associate"),
    PROFESSOR ("Professor");


    private String description;

    ProfessorType( String shortDescription) {
        this.description = shortDescription;
    }

    public String getDescription(){
        return description;
    }

}
