package com.in28minutes.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
	
	/**
	 * Para que JpaRepository pueda interpretar nuestra consulta, los parámetros de la consulta 
	 * se deben llamar igual que como fueron nombrados en el bean ExchangeValue.java
	 * @param from
	 * @param to
	 * @return
	 */
	public ExchangeValue findByFromAndTo(String from, String to);
}
