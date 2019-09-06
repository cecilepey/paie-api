package dev.paie.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import dev.paie.security.InfosAuthentification;


@Service
public class AuthentificationService {
	
	
    RestTemplate rt = new RestTemplate();
   

    public ResponseEntity<?> authenticate(InfosAuthentification infos) {
        return rt.postForEntity("https://cecile-top-collegue.herokuapp.com/auth", infos, String.class);
    }
  


}
