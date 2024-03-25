package com.implementations.thirdapi.service;

import com.implementations.thirdapi.client.BeerClient;
import com.implementations.thirdapi.response.BeerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeerService {

    @Autowired
    BeerClient beerClient;

    public List<BeerResponse> getBeerById(Long id) {
        return beerClient.getBeerById(id);
    }

    public List<BeerResponse> gerRandomBeer() {
        return beerClient.getRandomBeer();
    }
}
