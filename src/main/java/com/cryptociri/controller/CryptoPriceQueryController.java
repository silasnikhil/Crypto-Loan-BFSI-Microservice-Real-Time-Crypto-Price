package com.cryptociri.controller;

import com.cryptociri.service.CryptoPriceQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("http://localhost:3000")
public class CryptoPriceQueryController {

    @Autowired
    private CryptoPriceQueryService cryptoPriceQueryService;

    @GetMapping("/price")
    public String getCryptoPrice() throws IOException, InterruptedException {
        return cryptoPriceQueryService.getCryptoPrice();
    }

    @GetMapping("/price/{coin}")
    public String getCryptoCoinPriceINR(@PathVariable String coin) throws IOException, InterruptedException {
        return cryptoPriceQueryService.getCryptoCoinPriceINR(coin);
    }
}
