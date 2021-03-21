package com.serjer.controller;

import com.serjer.model.ClientRequest;
import com.serjer.model.Product;
import com.serjer.service.ClientService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@CrossOrigin(origins = "*")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping("/send-client-data")
    public List< Product> postClientData(@RequestBody ClientRequest request){
        log.info("REQUEST={}", request);
        return clientService.getProductListByRequest(request);
    }
}

