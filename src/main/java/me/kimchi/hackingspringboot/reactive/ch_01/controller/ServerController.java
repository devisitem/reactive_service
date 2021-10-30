package me.kimchi.hackingspringboot.reactive.ch_01.controller;

import lombok.RequiredArgsConstructor;
import me.kimchi.hackingspringboot.reactive.ch_01.Dish;
import me.kimchi.hackingspringboot.reactive.ch_01.service.KitchenService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
public class ServerController {

    private final KitchenService kitchen;

    @GetMapping(value = "/server", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    Flux<Dish> serveDishes() {
        return this.kitchen.getDishes();
    }
}
