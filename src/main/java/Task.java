import java.time.LocalDate;

public class Task {
    private String name;
    private LocalDate deadline;
    private StateOfTask state;
    private Person owner;

    public Task(String name, StateOfTask state){
        this.name = name;
        this.state = state;
        this.deadline = null;
        this.owner = null;
    }

    public void assignTo( Person person ) {
        this.owner = person;
        person.getTasks().add(this);
    }

    public void setState(StateOfTask state){
        this.state = state;
    }

}
