public class TaskManagementSystem {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();


        taskList.addTask(1, "Design UI", "Pending");
        taskList.addTask(2, "Develop Backend", "In Progress");
        taskList.addTask(3, "Write Documentation", "Completed");


        System.out.println("All Tasks:");
        taskList.traverseTasks();

        System.out.println("\nSearching for task with ID 2:");
        Task task = taskList.searchTask(2);
        System.out.println(task != null ? task : "Task not found");

        System.out.println("\nDeleting task with ID 1:");
        boolean isDeleted = taskList.deleteTask(1);
        System.out.println(isDeleted ? "Task deleted successfully" : "Task not found");

        System.out.println("\nAll Tasks after deletion:");
        taskList.traverseTasks();
    }
}
