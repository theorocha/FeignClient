package com.implementations.thirdapi.resource;


import com.implementations.thirdapi.response.BeerResponse;
import com.implementations.thirdapi.service.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/beer")
public class BeerController {

    @Autowired
    BeerService beerService;

    @GetMapping("/{id}")
    public List<BeerResponse> getById(@PathVariable Long id){
        return beerService.getBeerById(id);
    }

    @GetMapping("/random")
    public List<BeerResponse> getRandomBeer(){
        return beerService.gerRandomBeer();
    }
}
