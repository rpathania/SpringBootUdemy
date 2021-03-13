package com.trp.BeerServiceDTO.controller;

import com.trp.BeerServiceDTO.model.ConsumerModel;
import com.trp.BeerServiceDTO.services.ConsumerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/consumer")
@RestController
public class ConsumerController {

    private ConsumerService consumerService;

    public ConsumerController(ConsumerService consumerService)
    {
        System.out.println("Constructor = "+consumerService);
        this.consumerService = consumerService;
    }

    @GetMapping("/{userId}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void getCostumer(@PathVariable("userId") UUID userId){
        System.out.println("ConsumerController.getCostumer");
        System.out.println(UUID.randomUUID());
     //   return new ResponseEntity<>(consumerService.getConsumerById(userId), HttpStatus.OK);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void handlePost(ConsumerModel consumerModel){

        System.out.println("In post request");

        consumerService.saveObj(consumerModel);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void handlePut(@PathVariable("id") UUID id,ConsumerModel consumerModel){

        System.out.println("In put request");

        consumerService.updateObj(id,consumerModel);

    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void handleDelete(@PathVariable("id") UUID id){

        System.out.println("In delete request");
        consumerService.deleteObj(id);
    }


}
