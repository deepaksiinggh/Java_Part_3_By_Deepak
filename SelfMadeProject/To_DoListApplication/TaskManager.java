package SelfMadeProject.To_DoListApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskManager {
    List<Task> taskContainer = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addTask() {
        System.out.println("How many task you want to Add :- ");
        int taskNumber = sc.nextInt();

        for (int i = 0; i < taskNumber; i++) {
            System.out.println("Enter " + (i + 1) + "st task title");
            String taskName = sc.next();
            System.out.println("Enter " + (i + 1) + "st task Description");
            sc.next();
            String taskDescription = sc.nextLine();
            System.out.println("Enter " + (i + 1) + "st task Date");
            String taskDate = sc.next();
            System.out.println("Enter " + (i + 1) + "st task Time");
            String taskTime = sc.next();

            taskContainer.add(new Task(taskName, taskDescription, taskDate, taskTime));

        }

    }

    public void viewTask() {
        if (taskContainer.isEmpty()) {
            System.out.println("Please add task frist");
        } else {
            System.out.println(taskContainer);
        }

    }

    public void deleteTask() {
        System.out.println("Enter task title whose want to delete :- ");
        String deleteTitle = sc.next();
        boolean flag = true;
        for (int i = 0; i < taskContainer.size(); i++) {
            if (taskContainer.get(i).taskTitle.equals(deleteTitle)) {
                taskContainer.remove(i);
                flag = false;
                break;

            }
        }

        if (flag) {
            System.out.println("these title is not abilable");
        }

    }

    public void editTask() {

        boolean flag = true;
        if (taskContainer.isEmpty()) {
            System.out.println("add task first ");
            flag = false;
        } else {
            System.out.println("Enter task title whose want to edit :- ");
            String deleteTitle = sc.next();
            for (int i = 0; i < taskContainer.size(); i++) {
                if (taskContainer.get(i).taskTitle.equals(deleteTitle)) {
                    boolean loop = true;
                    flag = false;
                    while (loop) {
                        System.out.println("Enter what you want to edit type - title,description,time,date ");
                        String type = sc.next();
                        if (type.equalsIgnoreCase("title")) {
                            System.out.println("Enter updated title- ");
                            String str = sc.next();
                            taskContainer.get(i).taskTitle = str;

                        } else if (type.equalsIgnoreCase("description")) {
                            System.out.println("Enter updated description- ");
                            String str = sc.next();
                            taskContainer.get(i).taskDescription = str;
                        } else if (type.equalsIgnoreCase("time")) {
                            System.out.println("Enter updated time- ");
                            String str = sc.next();
                            taskContainer.get(i).time = str;
                        } else if (type.equalsIgnoreCase("date")) {
                            System.out.println("Enter updated date- ");
                            String str = sc.next();
                            taskContainer.get(i).date = str;
                        }

                        System.out.println("Do you want to exit editing task :- :Y/N");
                        char ch = sc.next().charAt(0);
                        if (ch == 'Y' || ch == 'y') {
                            loop = false;
                        }

                    }

                    break;

                }
            }
        }
        if (flag) {
            System.out.println("these title is not abilable");
        }
    }

}
