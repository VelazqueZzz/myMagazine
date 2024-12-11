package magaz;

import lombok.Data;

@Data
public class Сharacteristic { //Ingredient
    private final String id;
    private final String name;
    private final Type type;
    public enum Type {
        COLOR,SIZE,PRICE
    }
}
