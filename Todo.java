package ivan.samoylov;

public class Todo {
    private long userId;
    private long id;
    private String title;
    private boolean completed;

    @Override
    public String toString() {
        return "Todo{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", completed=" + completed +
                '}';
    }
}
