package com.imane.projectsocleback.services;
import com.imane.projectsocleback.entities.Etudiant;
import com.imane.projectsocleback.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EtudiantService {

    @Autowired
    private EtudiantRepository etudiantRepository;

    public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }

    public Etudiant getEtudiantById(String id) {
        return etudiantRepository.findById(id).orElse(null);
    }

    public Etudiant saveEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    public void deleteEtudiant(String id) {
        etudiantRepository.deleteById(id);
    }
}
