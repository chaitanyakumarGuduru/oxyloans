package com.oxy.security.springsecurityauthserver;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/htm")
public class Dao {
@Autowired
private DaoRepository repository;
/*@PostMapping("/")
public void  insert(@RequestBody OxyRegistration registration ){
	repository.save(registration);
}*/
@GetMapping("/")
public @ResponseBody List<OxyRegistration> getdata() {
	
	
	return (List<OxyRegistration>) repository.findAll();
		
		
		
	
}
}
