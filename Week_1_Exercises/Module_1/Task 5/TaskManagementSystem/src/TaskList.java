class TaskList {
    private Task head;

    public TaskList() {
        this.head = null;
    }

    public void addTask(int taskId, String taskName, String status) {
        Task newTask = new Task(taskId, taskName, status);
        if (head == null) {
            head = newTask;
        } else {
            Task current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newTask;
        }
    }

    public Task searchTask(int taskId) {
        Task current = head;
        while (current != null) {
            if (current.taskId == taskId) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void traverseTasks() {
        Task current = head;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }

    public boolean deleteTask(int taskId) {
        if (head == null) {
            return false;
        }
        if (head.taskId == taskId) {
            head = head.next;
            return true;
        }
        Task current = head;
        while (current.next != null && current.next.taskId != taskId) {
            current = current.next;
        }
        if (current.next == null) {
            return false;
        }
        current.next = current.next.next;
        return true;
    }
}
