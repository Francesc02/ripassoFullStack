package com.example.Ripasso.Service;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.Ripasso.Repository.RipassoRepository;

@Service
public class RipassoService {

	 private static final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	
	@Autowired
	private RipassoRepository ripassoRepository;

	private static final Logger logger = LoggerFactory.getLogger(RipassoService.class);
	
    

    // Costruttore con Dependency Injection
    @Autowired
  

    public List<Map<String,Object>> getUsernames() {
    	logger.info("sono dentro il service");
    	
    	return this.ripassoRepository.getUsernames();
        
    }
    
    
    public void insertUser(String username,String password) {
    	String passwordCrypted= passwordEncoder.encode(password);
    	logger.info("password criptata: " + passwordCrypted);
    	this.ripassoRepository.insertUser(username, passwordCrypted);
    }
    
    
    
    
    
    

}
//public void intermezzoBE(String query) {
//	
//	logger.info("sono dentro il service");
//	 
//	this.ripassoRepository.insertQuery(query);
//	
//}