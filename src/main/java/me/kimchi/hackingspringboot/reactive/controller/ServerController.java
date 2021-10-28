package me.kimchi.hackingspringboot.reactive.controller;

import lombok.RequiredArgsConstructor;
import me.kimchi.hackingspringboot.reactive.Dish;
import me.kimchi.hackingspringboot.reactive.service.KitchenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.awt.*;

@RestController
@RequiredArgsConstructor
public class ServerController {

    private final KitchenService kitchen;

    @GetMapping(value = "/server", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    Flux<Dish> serveDishes() {
        return this.kitchen.getDishes();
    }
}
