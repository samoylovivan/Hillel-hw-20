package ivan.samoylov;

public class Comment {
    private String postId;
    private long id;
    private String name;
    private String email;
    private String body;

    @Override
    public String toString() {
        return "Comment{" +
                "postId=" + postId +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}