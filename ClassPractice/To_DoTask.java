public class To_DoTask {
    String taskTitle;
    Double duration;
    String description;
    int taskNo;

    public To_DoTask(String taskTitle, double duration, String description, int taskNo) {
        this.taskTitle = taskTitle;
        this.duration = duration;
        this.description = description;
        this.taskNo = taskNo;
    }

    @Override
    public String toString() {
        return "To_DoTask [taskTitle=" + taskTitle + ", duration=" + duration + ", description=" + description
                + ", taskNo=" + taskNo + "]";
    }

}
