package com.dbs.trade.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.trade.beans.Client;
import com.dbs.trade.repository.ClientRepository;



@Service
public class ClientService {


	@Autowired
	private ClientRepository clientRepository;
	

	
	public boolean addClient(Client client)
	{
		try {
			this.clientRepository.save(client);
		}
		
		catch (IllegalArgumentException e)
		{
			return false;
		}
		
		return true;
	}
	

}