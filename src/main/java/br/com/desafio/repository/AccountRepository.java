package br.com.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.desafio.domain.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
	
	

}
