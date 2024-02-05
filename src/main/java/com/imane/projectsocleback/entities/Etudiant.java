package com.imane.projectsocleback.entities;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "ETUDIANT")
public class Etudiant {

    @Id
    @Column(name = "NO_ETUDIANT_NAT", nullable = false, length = 50)
    private String numeroEtudiantNat;

    @Column(name = "ANNEE_PRO", nullable = false, length = 10)
    private String anneePro;

    @Column(name = "CODE_COM", length = 10)
    private String codeCom;

    @Column(name = "NO_ETUDIANT_UBO", length = 20)
    private String numeroEtudiantUBO;

    @Column(name = "SEXE", nullable = false, length = 1)
    private String sexe;

    @Column(name = "NOM", nullable = false, length = 50)
    private String nom;

    @Column(name = "PRENOM", nullable = false, length = 50)
    private String prenom;

    @Column(name = "DATE_NAISSANCE", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    @Column(name = "LIEU_NAISSANCE", nullable = false, length = 255)
    private String lieuNaissance;

    @Column(name = "SITUATION", nullable = false, length = 3)
    private String situation;

    @Column(name = "NATIONALITE", nullable = false, length = 50)
    private String nationalite = "Française";

    @Column(name = "TEL_PORT", length = 20)
    private String telPortable;

    @Column(name = "TEL_FIXE", length = 20)
    private String telFixe;

    @Column(name = "EMAIL", length = 255)
    private String email;

    @Column(name = "ACTU_ADRESSE", length = 255)
    private String adresseActuelle;

    @Column(name = "ACTU_CP", length = 10)
    private String codePostalActuel;

    @Column(name = "ACTU_VILLE", length = 255)
    private String villeActuelle;

    @Column(name = "ACTU_PAYS", length = 255)
    private String paysActuel;

    @Column(name = "PERM_ADRESSE", nullable = false, length = 255)
    private String adressePermanente;

    @Column(name = "PERM_CP", nullable = false, length = 10)
    private String codePostalPermanente;

    @Column(name = "PERM_VILLE", nullable = false, length = 255)
    private String villePermanente;

    @Column(name = "PERM_PAYS", nullable = false, length = 255)
    private String paysPermanente;

    @Column(name = "DERNIER_DIPLOME", nullable = false, length = 255)
    private String dernierDiplome;

    @Column(name = "UNIVERSITE", nullable = false, length = 255)
    private String universite;

    @Column(name = "SIGLE_ETU", nullable = false, length = 3)
    private String sigleEtudiant;

    @Column(name = "COMPTE_CRI", nullable = false, length = 10)
    private String compteCRI;

    @Column(name = "UBO_EMAIL", length = 255)
    private String uboEmail;

    @Column(name = "GRPE_ANGLAIS")
    private Integer groupeAnglais;

    @Column(name = "ABANDON_MOTIF", length = 255)
    private String abandonMotif;

    @Column(name = "ABANDON_DATE")
    @Temporal(TemporalType.DATE)
    private Date abandonDate;

    @Column(name = "EST_DIPLOME", columnDefinition = "CHAR(1) DEFAULT 'N'")
    private char estDiplome = 'N';

    @ManyToOne
    @JoinColumn(name = "ANNEE_PRO", referencedColumnName = "ANNEE_PRO")
    private Promotion promotion;

    @Column(name = "CK_ETU_SITUATION", columnDefinition = "CHECK (SITUATION IN ('CEL', 'MAR', 'VEU', 'DIV'))")
    private String checkEtudiantSituation;

    @Column(name = "CK_ETU_SEXE", columnDefinition = "CHECK (SEXE IN ('H', 'F', 'L'))")
    private String checkEtudiantSexe;

    @Column(name = "CK_ETU_DIPLOME", columnDefinition = "CHECK (EST_DIPLOME IN ('O', 'N'))")
    private String checkEtudiantDiplome;

    // Ajoutez les constructeurs, getters et setters selon vos besoins
}
