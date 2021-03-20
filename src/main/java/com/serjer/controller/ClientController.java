package com.serjer.controller;

import com.serjer.model.ClientRequest;
import com.serjer.model.Product;
import com.serjer.service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping("/send-client-data")
    public List< Product> postClientData(@RequestBody ClientRequest request){
        return clientService.getProductListByRequest(request);
    }
}

