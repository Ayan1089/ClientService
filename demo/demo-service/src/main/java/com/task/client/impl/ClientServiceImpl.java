package com.task.client.impl;

import com.task.client.contracts.ClientService;
import com.task.client.jpa.Client;
import com.task.client.jpa.ClientRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client getClientById(Integer id) throws RuntimeException {
        return clientRepository.getReferenceById(id);
    }

    @Override
    public List<Client> getClientListByName(Integer offset, Integer limit) throws RuntimeException {
        return new ArrayList<>(clientRepository.findClientsByNonNullNames(PageRequest.of(offset, limit,
                Sort.by(Sort.Direction.ASC, "name"))).stream().toList());
    }

    @Override
    public List<Client> getClientsByLiveLocation(Integer offset, Integer limit) throws RuntimeException {
        return clientRepository.findClientsByNonNullLocation(PageRequest.of(offset, limit)).toList();
    }
}
