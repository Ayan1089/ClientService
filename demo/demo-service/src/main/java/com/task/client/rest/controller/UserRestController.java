package com.task.client.rest.controller;

import com.northlabs.demo.api.ClientsApi;
import com.northlabs.demo.api.model.Client;
import com.task.client.contracts.ClientService;
import com.task.client.impl.ClientServiceImpl;
import com.task.client.jpa.ClientRepository;
import com.task.client.mapper.ClientMapper;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserRestController implements ClientsApi {

    @Lazy
    @Autowired
    ClientRepository clientRepository;

    @Override
    public ResponseEntity<Client> getClientById(Integer id) {
        if (id == null) {
            return new ResponseEntity("User ID must be an integer and larger than 0", HttpStatus.BAD_REQUEST);
        }
        com.task.client.jpa.Client result;
        try {
            ClientService clientService = new ClientServiceImpl(clientRepository);
            result = clientService.getClientById(id);
            Client client = ClientMapper.INSTANCE.toRestClientObject(result);
            return ResponseEntity.ok(client);
        } catch (RuntimeException e) {
            if (e.getClass().equals(EntityNotFoundException.class)) {
                return new ResponseEntity("No client exist with ID: " + id, HttpStatus.NOT_FOUND);
            }
            return ResponseEntity.internalServerError().build();
        }
    }

    @Override
    public ResponseEntity<List<Client>> getClientListByname(Integer offset, Integer limit) {
        try {
            ClientService clientService = new ClientServiceImpl(clientRepository);
            List<com.task.client.jpa.Client> clients = clientService.getClientListByName(offset, limit);
            List<Client> resultClients = new ArrayList<>();
            for (com.task.client.jpa.Client client : clients) {
                resultClients.add(ClientMapper.INSTANCE.toRestClientObject(client));
            }
            return ResponseEntity.ok(resultClients);
        } catch (RuntimeException e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @Override
    public ResponseEntity<List<Client>> getClientsByLiveLocation(Integer offset, Integer limit) {
        try {
            ClientService clientService = new ClientServiceImpl(clientRepository);
            List<com.task.client.jpa.Client> clients = clientService.getClientsByLiveLocation(offset, limit);
            List<Client> resultClients = new ArrayList<>();
            for (com.task.client.jpa.Client client : clients) {
                resultClients.add(ClientMapper.INSTANCE.toRestClientObject(client));
            }
            return ResponseEntity.ok(resultClients);
        } catch (RuntimeException e) {
            return ResponseEntity.internalServerError().build();
        }
    }

}