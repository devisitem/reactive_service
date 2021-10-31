package me.kimchi.hackingspringboot.reactive;

import me.kimchi.hackingspringboot.reactive.ch_00.KitchenService;
import me.kimchi.hackingspringboot.reactive.ch_00.PoliteServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HackingSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(HackingSpringBootApplication.class, args);

        PoliteServer server = new PoliteServer(new KitchenService());

        server.doingMyJob().subscribe(
                dish -> System.out.println("Consuming "+dish),
                throwable -> System.err.println(throwable));
    }

}
