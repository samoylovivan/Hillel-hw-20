package ivan.samoylov;

public class Album {
    private long userId;
    private long id;
    private String title;

    @Override
    public String toString() {
        return "Album{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
