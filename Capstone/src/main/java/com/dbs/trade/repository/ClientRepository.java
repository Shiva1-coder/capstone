package com.dbs.trade.repository;

import org.springframework.data.repository.CrudRepository;

import com.dbs.trade.beans.Client;

public interface ClientRepository extends CrudRepository<Client, String> {

}
