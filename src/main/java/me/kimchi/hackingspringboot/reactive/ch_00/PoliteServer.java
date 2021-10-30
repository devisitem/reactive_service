package me.kimchi.hackingspringboot.reactive.ch_00;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
public class PoliteServer {

    private final KitchenService kitchen;

    Flux<Dish> doingMyJob() {
        return this.kitchen.getDishes()
                .doOnNext(dish -> System.out.println("Thank you for " + dish + "!"))
                .doOnError(error -> System.out.println("So sorry about " + error.getMessage()))
                .doOnComplete(() -> System.out.println("Thaks for all your hard work!"))
                .map(Dish::deliver);
    }
}
