package SelfMadeProject.To_DoListApplication;

public class Task {

    String taskTitle;
    String taskDescription;
    String date;
    String time;

    public Task(String taskTitle, String taskDescription, String date, String time) {
        this.taskTitle = taskTitle;
        this.taskDescription = taskDescription;
        this.date = date;
        this.time = time;
    }

    @Override
    public String toString() {
        return ("Task [taskTitle :- " + taskTitle +
                ", taskDescription :- " + taskDescription +
                ", task date is :- =" + date +
                ", task time is :- " + time + "]");
    }

}
