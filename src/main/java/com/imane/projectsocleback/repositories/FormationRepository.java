package com.imane.projectsocleback.repositories;

import com.imane.projectsocleback.entities.Formation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormationRepository extends JpaRepository<Formation, String> {
    // Ajoutez des méthodes personnalisées si nécessaire
}

