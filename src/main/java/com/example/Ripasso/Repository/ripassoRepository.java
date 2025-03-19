package com.example.Ripasso.Repository;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.Ripasso.Service.RipassoService;

@Repository
public class RipassoRepository  {
	
	private static final Logger logger = LoggerFactory.getLogger(RipassoService.class);
	
	
	 @Query(value = "SELECT * FROM provaString", nativeQuery = true)
	public String insertQuery(@Param("query") String query) {
		 logger.info("ritorno: " + query);
		 return query;
		
		 
	 }
	
	

}
