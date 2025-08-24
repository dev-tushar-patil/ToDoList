import java.util.ArrayList;
import java.util.Scanner;

public class ToDoManager {
    private ArrayList<Task> tasks = new ArrayList();
    private int idCounter = 1;

    public void addTask(Scanner sc) {
        System.out.println("Enter the Task Description : ");
        String desc = sc.nextLine();
        tasks.add(new Task(idCounter++, desc));
        System.out.println("Task Added Successfully!!");
    } // addTask()

    public void viewTasks() {
        if(tasks.isEmpty()) {
            System.out.println("No Tasks Found..!");
        } else {
            System.out.println( "\n Your Task :");
            for(Task task : tasks) {
                System.out.println(task);
            }
        }
    } // viewTasks()

    public void markTaskDone(Scanner sc) {
        System.out.println("Enter task ID to mark as done : ");
        int id = sc.nextInt();
        for(Task task : tasks) {
            if(task.getId() == id) {
                task.markDone();
                System.out.println("Task marked as Done!");
                return;
            }
        }
        System.out.println("Task Not Found!!");
    } // markTaskDone()

    public void deleteTask(Scanner sc) {

        System.out.println("Enter Task ID to Delete : ");
        int id = sc.nextInt();
        tasks.removeIf(task -> task.getId() == id);
        System.out.println("Task is deleted (if it existed)");
    } // deleteTask() 
} // ToDoManager class