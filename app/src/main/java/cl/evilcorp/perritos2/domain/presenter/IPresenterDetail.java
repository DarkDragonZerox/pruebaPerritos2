package cl.evilcorp.perritos2.domain.presenter;

import cl.evilcorp.perritos2.data.model.Favorite;

public interface IPresenterDetail {
 void loadBreedImages(String loadBI);
 void loadSubBreedImages(String lBreed,String lSubBreed);
 void saveFavorite(Favorite favorite);

}
