package wsClient;

import ws.DemoService;
import ws.DemoServiceService;

public class Main {

    public static void main(String[] args) {

        DemoServiceService service = new DemoServiceService();
        DemoService port = service.getDemoServicePort();
        System.out.println("Im here");

        port.add("Pooh", "Pooh - message 0");
        port.add("Pooh", "Pooh - message 1");
        port.add("Piglet", "Piglet - message 0");
        port.add("Piglet", "Piglet - message 1");

        System.out.println(port.getMessage("Pooh", 0));
        System.out.println(port.getMessage("Piglet", 1));

    }



}
