package me.kimchi.hackingspringboot.reactive.ch_00;

public class PoliteRestaurant {

    public void goWorks() {
        PoliteServer server = new PoliteServer(new KitchenService());

        server.doingMyJob().subscribe(
                dish -> System.out.println("Consuming "+dish),
                throwable -> System.err.println(throwable));
    }
}
