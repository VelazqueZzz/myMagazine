package magaz;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ClothesOrder {
    private String deliveryName;
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryState;
    private String deliveryZip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;

    private List<Clothes> clothess = new ArrayList<>();
    public void addClothes(Clothes clothes) {
        this.clothess.add(clothes);
    }
}
