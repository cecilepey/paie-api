package dev.paie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.paie.entites.BulletinSalaire;


public interface BulletinSalaireRepository extends JpaRepository<BulletinSalaire, String>  {
	

}
