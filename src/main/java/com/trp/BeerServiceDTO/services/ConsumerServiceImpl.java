package com.trp.BeerServiceDTO.services;

import com.trp.BeerServiceDTO.model.ConsumerModel;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ConsumerServiceImpl implements ConsumerService {
    @Override
    public ConsumerModel getConsumerById(UUID userId) {
        return ConsumerModel.builder()
                .id(userId)
                .name("Rishi")
                .build();
    }

    @Override
    public void saveObj(ConsumerModel consumerModel) {
        System.out.println("Saving the object");
    }

    @Override
    public void updateObj(UUID id, ConsumerModel consumerModel) {
        System.out.println("Updating the object");
    }

    @Override
    public void deleteObj(UUID id) {
        System.out.println("Deleting the object");
    }
}
