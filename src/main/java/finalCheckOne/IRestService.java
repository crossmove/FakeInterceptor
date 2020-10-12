package finalCheckOne;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface IRestService {

    String ENDPOINT = "http://www.vavian.com/";

    @GET("/")
    Call<Teacher> getTeacherById(@Query("id") final String id);
}
