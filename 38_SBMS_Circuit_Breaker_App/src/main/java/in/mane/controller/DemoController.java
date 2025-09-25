package in.mane.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.mane.service.ExternalService;

@RestController
public class DemoController {

    private final ExternalService externalService;

    public DemoController(ExternalService externalService) {
        this.externalService = externalService;
    }

    @GetMapping("/test")
    public String testCircuit() {
        return externalService.getDataFromRedis();
    }
}