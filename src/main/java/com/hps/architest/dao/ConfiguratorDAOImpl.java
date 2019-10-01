package com.hps.architest.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hps.architest.model.Country;

@Repository

public class ConfiguratorDAOImpl{

	@Autowired
	private JdbcTemplate jdbcTemplate;
		
	public Country getDemographics(String countryId) 
	{
		String sql= "SELECT id,name,district FROM world.city where id=?";
		System.out.println("Calling from DB. Id:"+countryId);
		Country countryData=jdbcTemplate.queryForObject(sql,new Object[]{countryId}, new BeanPropertyRowMapper<Country>(Country.class));
		return countryData; 
	}	
	
}