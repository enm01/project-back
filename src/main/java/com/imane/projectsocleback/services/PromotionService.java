package com.imane.projectsocleback.services;

import com.imane.projectsocleback.entities.Promotion;
import com.imane.projectsocleback.repositories.PromotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromotionService {

    @Autowired
    private PromotionRepository promotionRepository;

    public List<Promotion> getAllPromotions() {
        return promotionRepository.findAll();
    }

    // ... autres méthodes pour les opérations CRUD
}

