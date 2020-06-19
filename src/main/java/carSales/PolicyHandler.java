package carSales;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import carSales.config.kafka.KafkaProcessor;

@Service
public class PolicyHandler{    
	
	@Autowired
	CarSalesRepository carSalesRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverInsured_InsuredResult(@Payload Insured insured){

        if(insured.isMe()){
            Optional<CarSales> carSalesOptional = carSalesRepository.findById(insured.getCarId());
            carSalesOptional.get().setStatus(insured.getStatus());
            carSalesRepository.save(carSalesOptional.get());
        }
    }

}
