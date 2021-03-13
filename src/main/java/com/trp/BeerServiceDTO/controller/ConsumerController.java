package com.trp.BeerServiceDTO.controller;

import com.trp.BeerServiceDTO.model.ConsumerModel;
import com.trp.BeerServiceDTO.services.ConsumerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/consumer")
@RestController
public class ConsumerController {

    private ConsumerService consumerService;

    public ConsumerController(ConsumerService consumerService)
    {
        this.consumerService = consumerService;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<ConsumerModel>getCostumer(@PathVariable("userId") UUID userId){
        System.out.println("ConsumerController.getCostumer");
        System.out.println(UUID.randomUUID());
        return new ResponseEntity<>(consumerService.getConsumerById(userId), HttpStatus.OK);
    }

}
