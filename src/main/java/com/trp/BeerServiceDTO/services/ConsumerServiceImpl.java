package com.trp.BeerServiceDTO.services;

import com.trp.BeerServiceDTO.model.ConsumerModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
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
        log.debug("Saving the object..." + consumerModel.getId());
    }

    @Override
    public void updateObj(UUID id, ConsumerModel consumerModel) {
        System.out.println("Updating the object");
        log.debug("Updating the object..." + id);

    }

    @Override
    public void deleteObj(UUID id) {
        System.out.println("Deleting the object");
        log.debug("deleting the object..." + id);

    }
}
