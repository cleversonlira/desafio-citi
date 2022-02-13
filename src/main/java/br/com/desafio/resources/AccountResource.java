package br.com.desafio.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafio.domain.Account;
import br.com.desafio.repository.AccountRepository;

@RestController
@RequestMapping("/account")
public class AccountResource {
	
	@Autowired
	AccountRepository repository;
	
	@GetMapping
	public List<Account> list() {
		return repository.findAll();
	}
	
	@PostMapping
	public void createAccount(@RequestBody Account account) {
		repository.save(account); 
	}

	@DeleteMapping("/{id}")
	public void remove(@RequestParam Long id) {
		repository.deleteById(id);
	}
	
}
