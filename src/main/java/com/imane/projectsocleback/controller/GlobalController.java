package com.imane.projectsocleback.controller;

import com.imane.projectsocleback.entities.*;
import com.imane.projectsocleback.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GlobalController {

    @Autowired
    private EtudiantService etudiantService;

    @Autowired
    private PromotionService promotionService;

    @Autowired
    private EnseignantService enseignantService;

    @Autowired
    private FormationService formationService;
    @Autowired
    private  UserService userService;

    @PostMapping("/auth/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest) {
        User user = userService.authenticate(loginRequest.getUsername(), loginRequest.getPassword());

        if (user != null) {
            return ResponseEntity.ok("Login successful!");
        } else {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }

    // Endpoints pour Etudiant
    @GetMapping("/etudiants")
    public List<Etudiant> getAllEtudiants() {
        return etudiantService.getAllEtudiants();
    }

    @GetMapping("/etudiant/{id}")
    public Etudiant getEtudiantById(@PathVariable String id) {
        return etudiantService.getEtudiantById(id);
    }

    @PostMapping("/etudiant")
    public Etudiant saveEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.saveEtudiant(etudiant);
    }

    @DeleteMapping("/etudiant/{id}")
    public void deleteEtudiant(@PathVariable String id) {
        etudiantService.deleteEtudiant(id);
    }

    @GetMapping("/promotions")
    public List<Promotion> getAllPromotions() {
        return promotionService.getAllPromotions();
    }

    @GetMapping("/enseignants")
    public List<Enseignant> getAllEnseignants() {
        return enseignantService.getAllEnseignants();
    }

    @GetMapping("/formations")
    public List<Formation> getAllFormations() {
        return formationService.getAllFormations();
    }

}

