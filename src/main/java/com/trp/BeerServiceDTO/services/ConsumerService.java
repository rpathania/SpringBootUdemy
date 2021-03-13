package com.trp.BeerServiceDTO.services;

import com.trp.BeerServiceDTO.model.ConsumerModel;

import java.util.UUID;

public interface ConsumerService {
    ConsumerModel getConsumerById(UUID userId);

    void saveObj(ConsumerModel consumerModel);

    void updateObj(UUID id, ConsumerModel consumerModel);

    void deleteObj(UUID id);
}
