package SelfMadeProject.To_DoListApplication;

import java.util.Scanner;

public class TaskDriver {

    public static void main(String[] args) {
        TaskManager tasks = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("--- To-Do List Menu ---");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Edit Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    tasks.addTask();
                    break;
                case 2:
                    tasks.viewTask();
                    break;
                case 3:
                    tasks.editTask();
                    break;
                case 4:
                    tasks.deleteTask();
                    ;
                    break;
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

}
