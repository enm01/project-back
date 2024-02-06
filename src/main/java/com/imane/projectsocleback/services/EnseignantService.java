package com.imane.projectsocleback.services;

import com.imane.projectsocleback.entities.Enseignant;
import com.imane.projectsocleback.repositories.EnseignantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EnseignantService {

    @Autowired
    private EnseignantRepository enseignantRepository;

    public List<Enseignant> getAllEnseignants() {
        return enseignantRepository.findAll();
    }

    // ... autres méthodes pour les opérations CRUD
}
