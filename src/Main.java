import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ToDoManager manager = new ToDoManager();
        int choice;

        do {
            System.out.println();
            System.out.println("--- TO DO LIST MENU ---");
            System.out.println("1. Add Task");
            System.out.println("2. View Task");
            System.out.println("3. Mark Task As Done");
            System.out.println("4. Delete Mark");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1 -> manager.addTask(sc);
                case 2 -> manager.viewTasks();
                case 3 -> manager.markTaskDone(sc);
                case 4 -> manager.deleteTask(sc);
                case 5 -> System.out.println("Existing...Good Bye!!!");
                default -> System.out.println("Invalid Choice, try again..!!");
            }
        } // do 
        while(choice != 5);
        sc.close();
    } //main method
} // Main Class 
