package com.in28minutes.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	//Con esta varible obtenemos el puerto que esta usando la aplicación.
	@Autowired
	Environment environment; 
	
	@Autowired
	ExchangeValueRepository exchangeValueRepository; 
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveValue(@PathVariable String from, @PathVariable String to) {
		ExchangeValue exchangeValue = exchangeValueRepository.findByFromAndTo(from, to);
		if( exchangeValue != null )
			exchangeValue.setPuerto(Integer.parseInt(environment.getProperty("local.server.port")));
		
		logger.info("*************** Message From CurrencyExchangeController ---->>> {}", exchangeValue);
		
		return exchangeValue;
	}
}
