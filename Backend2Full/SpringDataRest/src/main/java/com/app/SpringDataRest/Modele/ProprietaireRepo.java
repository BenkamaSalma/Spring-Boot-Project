package com.app.SpringDataRest.Modele;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource

public interface ProprietaireRepo extends CrudRepository<Proprietaire, Long> {
}
