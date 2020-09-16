package main.java.desingPattrens.Structural.Facade.Hukuksal;

import java.util.List;

public class HukuksalKontrolService {
    private HukuksalSurecEntityService hukuksalSurecEntityService;

    public HukuksalKontrolService() {
        hukuksalSurecEntityService=new HukuksalSurecEntityService();
    }

    public boolean isHukuksalIslemde(Long borcId) {
        List<Long> hukuksalIslemdekiBorcList=hukuksalSurecEntityService.findAllHukuksalIslem();

        boolean isHukuksalIslemde = hukuksalIslemdekiBorcList.contains(borcId);
        if (isHukuksalIslemde) {
            System.out.println("Borç hukuksal işlemde. Tahsil edilemez!");
        }
        return isHukuksalIslemde;
    }
}
