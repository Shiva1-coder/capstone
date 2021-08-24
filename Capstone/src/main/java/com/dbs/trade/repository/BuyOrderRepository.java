package com.dbs.trade.repository;

import org.springframework.data.repository.CrudRepository;

import com.dbs.trade.beans.BuyOrder;

public interface BuyOrderRepository extends CrudRepository<BuyOrder, Integer> {

}
