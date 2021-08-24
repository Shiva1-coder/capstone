package com.dbs.trade.repository;

import org.springframework.data.repository.CrudRepository;

import com.dbs.trade.beans.SellOrder;

public interface SellOrderRepository  extends CrudRepository<SellOrder, Integer>{

}
