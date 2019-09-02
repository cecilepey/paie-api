package dev.paie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.paie.entites.Entreprise;
import dev.paie.entites.ProfilRemuneration;

public interface ProfilRemunerationRepository extends JpaRepository<ProfilRemuneration, String> {

}
