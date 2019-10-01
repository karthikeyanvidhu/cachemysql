package com.hps.architest.controller;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hps.architest.dao.ConfiguratorDAOImpl;
import com.hps.architest.model.Country;

@RestController
public class DBController {

	@Autowired
	private ConfiguratorDAOImpl db;
	
    @Cacheable(value = "countries", key = "#countryId")
    @RequestMapping(value = "country/{countryId}", method = RequestMethod.GET)
	public Country getCountry(@PathVariable String countryId) throws Exception {		
    	Country data=db.getDemographics(countryId);		
		return data;
	}
	

}