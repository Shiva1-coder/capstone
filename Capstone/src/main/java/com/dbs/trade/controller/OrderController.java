package com.dbs.trade.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.trade.beans.BuyOrder;
import com.dbs.trade.beans.Client;
import com.dbs.trade.beans.Instrument;
import com.dbs.trade.beans.SellOrder;
import com.dbs.trade.beans.Transaction;
import com.dbs.trade.repository.BuyOrderRepository;
import com.dbs.trade.repository.ClientRepository;
import com.dbs.trade.repository.SellOrderRepository;
import com.dbs.trade.repository.TransactionRepository;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/order")
public class OrderController {
	
	
	@Autowired
	private BuyOrderRepository buyrepo;
	@Autowired
	private ClientRepository clientrepo;
	
	@Autowired
	private SellOrderRepository sellrepo;
	
	@Autowired
	private TransactionRepository trepo;
	

	
	@PostMapping("/buyorder")
	@ResponseBody
	public BuyOrder insertBuyOrder(@RequestBody BuyOrder buyorder)
	{ 
		
		this.buyrepo.save(buyorder);
		System.out.println("bye");
		Client client = this.clientrepo.findById(buyorder.getClient().getClientId()).get();
		
		int balance =client.getTxnLimit();
		System.out.println(balance);
		balance = (int) (balance - (buyorder.getPrice() * buyorder.getQuantity()));
		client.setTxnLimit(balance);
		this.clientrepo.save(client);
		
		return buyorder;
	}
	
	@GetMapping("/buyorders")
	
	public List<BuyOrder> geBuyOrders()
	{	
		List<BuyOrder> buys = new ArrayList<>();
		this.buyrepo.findAll().forEach(msg -> buys.add(msg));
		return buys;}
	
@GetMapping("/sellorders")
	
	public List<SellOrder> geSellOrder()
	{	
		List<SellOrder> sells = new ArrayList<>();
		this.sellrepo.findAll().forEach(msg -> sells.add(msg));
		return sells;}
	
	
	
	
	
	@PostMapping("/sellorder")
	public SellOrder insertSellOrder(@RequestBody SellOrder sellorder)
	{
		
		this.sellrepo.save(sellorder);
		System.out.println("bye sell");
		Client client = this.clientrepo.findById(sellorder.getClient().getClientId()).get();
		
		int balance =client.getTxnLimit();
		System.out.println(balance);
		balance = (int) (balance - (sellorder.getPrice() * sellorder.getQuantity()));
		client.setTxnLimit(balance);
		this.clientrepo.save(client);
		return sellorder;
	}
	
	
	@PostMapping("/transaction")
	public Transaction insertTransaction(@RequestBody Transaction transaction)
	{
		this.trepo.save(transaction);
		return transaction;
	}
	

}
