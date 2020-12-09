package cl.evilcorp.perritos2.domain.presenter;

import java.util.List;

import cl.evilcorp.perritos2.data.model.InterfaceModel;
import cl.evilcorp.perritos2.ui.presenter.IPresenterViewList;

public class PresenterList implements IPresenterList, IPresenterModel{
   InterfaceModel interfaceModel;
   IPresenterViewList iPresenterViewList;

    public PresenterList(IPresenterViewList iPresenterViewList) {
        this.iPresenterViewList = iPresenterViewList;
    }

    public void setInterfaceModel(InterfaceModel interfaceModel) {
        this.interfaceModel = interfaceModel;
    }

    @Override
    public void loadBreeds() {
    interfaceModel.loadBreeds();
    }

    @Override
    public void notificar(List<String> list) {
    iPresenterViewList.showDogs(list);
    }
}
