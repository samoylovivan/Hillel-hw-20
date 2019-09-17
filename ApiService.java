
package ivan.samoylov;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;


public class ApiService {
    private final String URL = "https://jsonplaceholder.typicode.com/";

    private static ApiService instance;
    private OkHttpClient client = new OkHttpClient();
    private Gson gson = new Gson();

    private ApiService() {
    }
    public static synchronized ApiService getInstance() {
        if (instance == null) {
            instance = new ApiService();
        }
        return instance;
    }
    public String getJson(String addURL){
        Request request = new Request
                .Builder()
                .url(URL + addURL)
                .build();
        try {
            Response response = client.newCall(request).execute();
            return response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Album> getAlbums(){
        Type listType = new TypeToken<List<Album>>(){}.getType();
        return gson.fromJson(getJson("albums" ), listType);
    }
    public List<Comment> getComments(){
        Type listType = new TypeToken<List<Comment>>(){}.getType();
        return gson.fromJson(getJson("comments" ), listType);
    }
    public List<Post> getPosts(){
        Type listType = new TypeToken<List<Post>>(){}.getType();
        return gson.fromJson(getJson("posts" ), listType);
    }
    public List<Photo> getPhotos(){
        Type listType = new TypeToken<List<Photo>>(){}.getType();
        return gson.fromJson(getJson("photos" ), listType);
    }
    public List<Todo> getTodos(){
        Type listType = new TypeToken<List<Todo>>(){}.getType();
        return gson.fromJson(getJson("todos" ), listType);
    }
    public List<User> getUsers(){
        Type listType = new TypeToken<List<User>>(){}.getType();
        return gson.fromJson(getJson("users" ), listType);
    }
}