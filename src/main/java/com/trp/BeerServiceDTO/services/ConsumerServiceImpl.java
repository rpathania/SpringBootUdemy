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
}
