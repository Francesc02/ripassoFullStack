package com.example.Ripasso.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Ripasso.Service.RipassoService;

@RestController
@RequestMapping("api/")
public class RipassoController {
	
	@Autowired 
	private RipassoService ripassoService;
	
	private static final Logger logger = LoggerFactory.getLogger(RipassoController.class);

	
	
	@GetMapping("error")
	public String error() {
		
		return "sei andato in errore e non c'è nulla da vedere qui";
		
	}
	@GetMapping("get")
	public void ricezioneDalFe(@RequestParam String query) {
		logger.info("sono dentro il controller e ho questa frase -> " + query);
		this.ripassoService.intermezzoBE(query);
		
		
		
	}
	
	
	

}
