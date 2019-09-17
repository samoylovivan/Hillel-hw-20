package ivan.samoylov;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            ApiService myApiService = ApiService.getInstance();

            List<Album> albums = myApiService.getAlbums();
            List<Comment> comments = myApiService.getComments();
            List<Post> posts = myApiService.getPosts();
            List<Photo> photos = myApiService.getPhotos();
            List<Todo> todos = myApiService.getTodos();
            List<User> users = myApiService.getUsers();

            System.out.println("Albums: " + albums);
            System.out.println("Comments: " + comments);
            System.out.println("Posts: " + posts);
            System.out.println("Photos: " + photos);
            System.out.println("Todos: " + todos);
            System.out.println("Users: " + users);
        } catch (Exception e){

        }

    }
}