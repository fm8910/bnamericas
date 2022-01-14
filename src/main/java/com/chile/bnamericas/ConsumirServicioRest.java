package com.chile.bnamericas;

import com.chile.bnamericas.model.Feriados;
import com.chile.bnamericas.model.FeriadosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Component
public class ConsumirServicioRest {

    private final RestTemplate restTemplate = new RestTemplate();

    @Autowired
    private FeriadosRepository feriadosRepository;

    @PostConstruct
    public void init(){
        System.out.println("Ejecutando proceso");
       ResponseEntity<Feriados[]> responseEntity =
                restTemplate.getForEntity("https://feriados-cl-api.herokuapp.com/feriados", Feriados[].class);
        Feriados[] userArray = responseEntity.getBody();
        assert userArray != null;
        feriadosRepository.saveAll(Arrays.asList(userArray));
        System.out.println("Total de feriados registrados: " + userArray.length);
    }

}
