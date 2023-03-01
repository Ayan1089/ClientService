package com.task.client.mapper;

import com.task.client.jpa.Client;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClientMapper {

    ClientMapper INSTANCE = Mappers.getMapper( ClientMapper.class );
    com.northlabs.demo.api.model.Client toRestClientObject(Client client);
;
}
