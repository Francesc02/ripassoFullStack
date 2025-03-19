package com.example.Ripasso.Service;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Ripasso.Repository.RipassoRepository;


@Service
public class RipassoService {
	
	@Autowired
	
	private RipassoRepository ripassoRepository;
	
	
	private static final Logger logger = LoggerFactory.getLogger(RipassoService.class);

	public void intermezzoBE(String query) {
		
		logger.info("sono dentro il service");
		 
		this.ripassoRepository.insertQuery(query);
		
	}
	

}
