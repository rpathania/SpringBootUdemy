package com.trp.BeerServiceDTO.services;

import com.trp.BeerServiceDTO.model.ConsumerModel;

import java.util.UUID;

public interface ConsumerService {
    ConsumerModel getConsumerById(UUID userId);
}
