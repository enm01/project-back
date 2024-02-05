package com.imane.projectsocleback.entities;
import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "ENSEIGNANT")
public class Enseignant {

    @Id
    @Column(name = "NO_ENSEIGNANT", nullable = false)
    private Long noEnseignant;

    @Column(name = "TYPE", nullable = false, length = 10)
    private String type;

    @Column(name = "SEXE", nullable = false, length = 1)
    private String sexe;

    @Column(name = "NOM", nullable = false, length = 50)
    private String nom;

    @Column(name = "PRENOM", nullable = false, length = 50)
    private String prenom;

    @Column(name = "ADRESSE", nullable = false, length = 255)
    private String adresse;

    @Column(name = "CP", nullable = false, length = 10)
    private String codePostal;

    @Column(name = "VILLE", nullable = false, length = 255)
    private String ville;

    @Column(name = "PAYS", nullable = false, length = 255)
    private String pays;

    @Column(name = "TEL_PORT", length = 20)
    private String telPort;

    @Column(name = "ENC_PERSO_TEL", length = 20)
    private String encPersoTel;

    @Column(name = "ENC_UBO_TEL", length = 20)
    private String encUboTel;

    @Column(name = "ENC_PERSO_EMAIL", length = 255)
    private String encPersoEmail;

    @Column(name = "ENC_UBO_EMAIL", length = 255)
    private String encUboEmail;

    @Column(name = "INT_NO_INSEE", length = 50)
    private String intNoInsee;

    @Column(name = "INT_SOC_NOM", length = 50)
    private String intSocNom;

    @Column(name = "INT_SOC_ADRESSE", length = 255)
    private String intSocAdresse;

    @Column(name = "INT_SOC_CP", length = 10)
    private String intSocCodePostal;

    @Column(name = "INT_SOC_VILLE", length = 255)
    private String intSocVille;

    @Column(name = "INT_SOC_PAYS", length = 255)
    private String intSocPays;

    @Column(name = "INT_FONCTION", length = 50)
    private String intFonction;

    @Column(name = "INT_PROF_EMAIL", length = 255)
    private String intProfEmail;

    @Column(name = "INT_PROF_TEL", length = 20)
    private String intProfTel;

    @Column(name = "CK_ENS_SEXE", columnDefinition = "CHECK (SEXE IN ('H', 'F', 'L'))")
    private String checkEnseignantSexe;

    // Ajoutez les constructeurs, getters et setters selon vos besoins
}
