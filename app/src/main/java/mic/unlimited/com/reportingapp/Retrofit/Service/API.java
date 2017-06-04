package mic.unlimited.com.reportingapp.Retrofit.Service;

import java.util.List;

import mic.unlimited.com.reportingapp.Retrofit.Model.SupDetail;
import mic.unlimited.com.reportingapp.Retrofit.Model.Supervisor;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Bibesh on 6/4/17.
 */

public interface API {
    @POST("api")
    @FormUrlEncoded
    Call<Supervisor> login(@Field("usr") String username, @Field("pwd") String password);

    @POST("api/detailsup")
    @FormUrlEncoded
    Call<List<SupDetail>> details(@Field("id") int id);

}
