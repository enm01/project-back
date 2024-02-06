package com.imane.projectsocleback.repositories;
import com.imane.projectsocleback.entities.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PromotionRepository extends JpaRepository<Promotion, String> {
    // Ajoutez des méthodes personnalisées si nécessaire
}
