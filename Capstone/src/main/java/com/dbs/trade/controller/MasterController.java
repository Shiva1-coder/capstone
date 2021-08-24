package com.dbs.trade.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.trade.beans.BuyOrder;
import com.dbs.trade.beans.Client;
import com.dbs.trade.beans.Custodian;
import com.dbs.trade.beans.Instrument;
import com.dbs.trade.repository.BuyOrderRepository;
import com.dbs.trade.repository.ClientRepository;
import com.dbs.trade.repository.CustodianRepository;
import com.dbs.trade.repository.InstrumentRepository;
import com.dbs.trade.service.ClientService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class MasterController {
	
	
	@Autowired
	private ClientRepository clientrepo;
	
	@Autowired
	private CustodianRepository custrepo;
	
	@Autowired
	private InstrumentRepository instrepo;
	
	@Autowired
	private BuyOrderRepository buyrepo;
	
	@Autowired
	private ClientService cservice;
	
	
	
	
	@GetMapping("/clients")
	
	public List<Client> getClients()
	{	
		List<Client> clients = new ArrayList<>();
		this.clientrepo.findAll().forEach(currency ->clients.add(currency));
		return clients ;
	} 
	
	@GetMapping("/client/{cid}")
	public Client getClient(@PathVariable String cid)
	{
		return this.clientrepo.findById(cid).get();
	}
	
	@GetMapping("/custodians")
	public List<Custodian> getCustodians()
	{	
		List<Custodian> custodians = new ArrayList<>();
		this.custrepo.findAll().forEach(currency ->custodians.add(currency));
		return custodians ;
	}
	
	@GetMapping("/custodian/{custid}")
	public Custodian getCustodian(@PathVariable String custid)
	{
		return this.custrepo.findById(custid).get();
	}
	
	@GetMapping("/instruments")
	public List<Instrument> getInstruments()
	{	
		List<Instrument> instruments = new ArrayList<>();
		this.instrepo.findAll().forEach(currency -> instruments.add(currency));
		return instruments ;
	}

	
	@GetMapping("/instrument/{instid}")
	public Instrument geInstrument(@PathVariable String instid)
	{
		return this.instrepo.findById(instid).get();
	}
	
	
	@PostMapping("/addclient")
	public boolean insertClient(@RequestBody Client client)
	{
		
			 return this.cservice.addClient(client);

	}

	
	

}
