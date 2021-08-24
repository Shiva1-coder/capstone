package com.dbs.trade.repository;

import org.springframework.data.repository.CrudRepository;

import com.dbs.trade.beans.Transaction;

public interface TransactionRepository  extends CrudRepository<Transaction, Integer>{

}
