package org.saadeddine.reportingservice.controller;

import lombok.RequiredArgsConstructor;
import org.saadeddine.reportingservice.webClient.ExchangeRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.Map;

@RestController
@RequestMapping("/reporting")
@RequiredArgsConstructor
public class ExchangeRateController {
    @Autowired
    private ExchangeRateService service; // Lombok injects this automatically

    @GetMapping("/rates")
    public Mono<Map> getRates(@RequestParam String base) {
        return service.getLatestRates(base);
    }
}
