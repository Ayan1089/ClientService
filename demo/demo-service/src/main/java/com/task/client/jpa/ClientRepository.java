package com.task.client.jpa;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

    @Query("SELECT c FROM clients c WHERE c.location IS NOT NULL")
    Page<Client> findClientsByNonNullLocation(Pageable pageable);

    @Query("SELECT c FROM clients c WHERE c.name IS NOT NULL")
    Page<Client> findClientsByNonNullNames(Pageable pageable);

}
