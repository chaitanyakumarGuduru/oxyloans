package com.oxy.security.springsecurityauthserver;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoRepository extends CrudRepository<OxyRegistration, Integer> {
    
	
	//@Query("select email,password from oxy_registration where email = :email")
    List<OxyRegistration> findByemail(String email);

	

}
