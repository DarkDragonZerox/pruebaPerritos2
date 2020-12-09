package cl.evilcorp.perritos2;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiDog {
 @GET("breed/list/all/")
 Call<BreedList> breedList;
 @GET("breed/{breed}/images/")
 Call<BreedImg> breedImg(@Path("breed")String breed);
}
