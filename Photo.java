package ivan.samoylov;

public class Photo {
    private long albumId;
    private long id;
    private String title;
    private String url;
    private String thumbnailUrl;

    @Override
    public String toString() {
        return "Photo{" +
                "albumId=" + albumId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", thumbnailUrl='" + thumbnailUrl + '\'' +
                '}';
    }
}
