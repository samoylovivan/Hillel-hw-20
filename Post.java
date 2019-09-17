package ivan.samoylov;

public class Post {
    private Long userId;
    private Long id;
    private String body;
    private String title;

    @Override
    public String toString() {
        return "Post{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}