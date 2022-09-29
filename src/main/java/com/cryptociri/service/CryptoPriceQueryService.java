package com.cryptociri.service;

import java.io.IOException;

public interface CryptoPriceQueryService {
    String getCryptoPrice() throws IOException, InterruptedException;

    String getCryptoCoinPriceINR(String coin) throws IOException, InterruptedException;
}
