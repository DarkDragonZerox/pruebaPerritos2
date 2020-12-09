package cl.evilcorp.perritos2.data.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import cl.evilcorp.perritos2.domain.presenter.IPresenterModel;
import cl.evilcorp.perritos2.data.api.ApiDog;
import cl.evilcorp.perritos2.data.api.RetrofitClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BreedModel implements InterfaceModel {
    IPresenterModel iPresenterModel;

    public BreedModel(IPresenterModel iPresenterModel) {
        this.iPresenterModel = iPresenterModel;
    }

    @Override
    public void loadBreeds() {
        ApiDog service = RetrofitClient.getRetrofitInstance().create(ApiDog.class);
        Call<BreedList> listCall = service.breedList();
        List<String> list = new ArrayList<>();
        listCall.enqueue(new Callback<BreedList>() {
            @Override
            public void onResponse(Call<BreedList> call, Response<BreedList> response) {
                BreedList breedList = response.body();
                Map<String, List<String>> map = breedList.getMessage();
                for (String key : map.keySet()) {
                    if (map.get(key).isEmpty()) {
                        list.add(key);
                    } else {
                        for (String subBreed : map.get(key)) {
                            list.add(key + " " + subBreed);
                        }
                    }
                }
                iPresenterModel.notificar(list);
            }

            @Override
            public void onFailure(Call<BreedList> call, Throwable t) { //Sin implementar
            }
        });
    }


    @Override
    public void loadImg(String breed, String subBreed) {

    }
}
