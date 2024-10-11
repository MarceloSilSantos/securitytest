package br.dev.loggin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.loggin.model.User;

public interface UserRepository extends JpaRepository <User,Long>{
	User findByUsername (String username);

}
