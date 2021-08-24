package com.dbs.trade.repository;

import org.springframework.data.repository.CrudRepository;

import com.dbs.trade.beans.Instrument;

public interface InstrumentRepository  extends CrudRepository<Instrument, String>{

}
