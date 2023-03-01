package com.task.client.contracts;

import com.task.client.jpa.Client;

import java.util.List;

public interface ClientService {

    Client getClientById(Integer id);

    List<Client> getClientListByName(Integer offset, Integer limit);

    List<Client> getClientsByLiveLocation(Integer offset, Integer limit);


}
