package roid.berlin.android.durva;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RecyclerInterface {
    String JSONURL = "https://durva.ir/api/v1/";

    @GET("blogs")

    Call<String> getString();

}
