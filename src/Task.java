public class Task {

    private int id;
    private String description;
    private boolean isDone;

    public Task(int id, String description) {
        this.id = id;
        this.description = description;
        this.isDone = false;
    }

    public int getId() {
        return id;
    }

    public void markDone() {
        this.isDone = true;
    }

    @Override 
    public String toString() {
        return id + ". " + description + " [ " + (isDone ? "Done" : "Pending") + " ]"; 
    } // toString()
}
