package me.kimchi.hackingspringboot.reactive;

import lombok.Getter;
import lombok.Setter;

public class Dish {

    @Getter
    @Setter
    private String description;

    @Getter
    private boolean delivered = false;

    public static Dish deliver(Dish dish) {
        Dish deliveredDish = new Dish(dish.description);
        deliveredDish.delivered = true;
        return deliveredDish;
    }

    public Dish (String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "description='" + description + "'\'" +
                ", delivered=" + delivered +
                '}';
    }
}
