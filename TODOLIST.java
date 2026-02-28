import java.util.Scanner;

public class TODOLIST {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] tasks = new String[50];  
        int count = 0;  

        int choice = 0;

        while (choice != 3) {

            System.out.println("\n--- JOANNE'S DAILY TO-DO LIST ---");
            System.out.println("1) ADD A TASK");
            System.out.println("2) VIEW TASKS");
            System.out.println("3) EXIT LIST");
            System.out.print("MAKE A CHOICE: ");

            choice = input.nextInt();
            input.nextLine(); 

            if (choice == 1) {

                System.out.print("INPUT YOUR TASK: ");
                tasks[count] = input.nextLine();
                count++;

                System.out.println("TASK ADDED!");

            } else if (choice == 2) {

                System.out.println("\nYOUR TASKS:");

                if (count == 0) {
                    System.out.println("NO TASKS");
                } else {
                    for (int i = 0; i < count; i++) {
                        System.out.println((i + 1) + ". " + tasks[i]);
                    }
                }

            } else if (choice == 3) {

                System.out.println("THANK YOU GOODBYE!");

            } else {

                System.out.println("ERROR. PLEASE TRY AGAIN");

            }
        }

        input.close();
    }
}