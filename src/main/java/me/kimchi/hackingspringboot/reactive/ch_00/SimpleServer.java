package me.kimchi.hackingspringboot.reactive.ch_00;

import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SimpleServer {

    private final KitchenService kitchen;

    SimpleServer (KitchenService kitchen) {
        this.kitchen = kitchen;
    }

    Flux<Dish> doingMyJob () {
        return this.kitchen.getDishes()
                .map(dish -> Dish.deliver(dish));
    }
}
