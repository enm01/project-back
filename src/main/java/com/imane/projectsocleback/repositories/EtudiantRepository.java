package com.imane.projectsocleback.repositories;
import com.imane.projectsocleback.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, String> {
    // Ajoutez des méthodes personnalisées si nécessaire
}

