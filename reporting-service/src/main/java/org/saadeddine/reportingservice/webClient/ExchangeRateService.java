package org.saadeddine.reportingservice.webClient;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class ExchangeRateService {
    @Autowired
    private  WebClient webClient; // injected by Spring

    public Mono<Map> getLatestRates(String baseCurrency) {
        return webClient.get()
                .uri("/v1/currencies/{currency}.json", baseCurrency.toLowerCase())
                .retrieve()
                .bodyToMono(Map.class);
    }
}
