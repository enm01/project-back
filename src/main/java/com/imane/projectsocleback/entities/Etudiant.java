package com.imane.projectsocleback.entities;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "ETUDIANT")
public class Etudiant {

    @Id
    @Column(name = "NO_ETUDIANT_NAT", nullable = false, length = 50)
    private String numeroEtudiantNat;

    @Column(name = "annee_pro", insertable = false, updatable = false)
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

    @Column(name = "EST_DIPLOME")
    private char estDiplome = 'N';

    @ManyToOne
    @JoinColumn(name = "ANNEE_PRO", referencedColumnName = "ANNEE_PRO")
    private Promotion promotion;

//    @Column(name = "CK_ETU_SITUATION", columnDefinition = "CHECK (SITUATION IN ('CEL', 'MAR', 'VEU', 'DIV'))")
//    private String checkEtudiantSituation;
//
//    @Column(name = "CK_ETU_SEXE", columnDefinition = "CHECK (SEXE IN ('H', 'F', 'L'))")
//    private String checkEtudiantSexe;
//
//    @Column(name = "CK_ETU_DIPLOME", columnDefinition = "CHECK (EST_DIPLOME IN ('O', 'N'))")
//    private String checkEtudiantDiplome;

    // Ajoutez les constructeurs, getters et setters selon vos besoins


    public Etudiant() {
    }

    public String getNumeroEtudiantNat() {
        return numeroEtudiantNat;
    }

    public void setNumeroEtudiantNat(String numeroEtudiantNat) {
        this.numeroEtudiantNat = numeroEtudiantNat;
    }

    public String getAnneePro() {
        return anneePro;
    }

    public void setAnneePro(String anneePro) {
        this.anneePro = anneePro;
    }

    public String getCodeCom() {
        return codeCom;
    }

    public void setCodeCom(String codeCom) {
        this.codeCom = codeCom;
    }

    public String getNumeroEtudiantUBO() {
        return numeroEtudiantUBO;
    }

    public void setNumeroEtudiantUBO(String numeroEtudiantUBO) {
        this.numeroEtudiantUBO = numeroEtudiantUBO;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getLieuNaissance() {
        return lieuNaissance;
    }

    public void setLieuNaissance(String lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public String getTelPortable() {
        return telPortable;
    }

    public void setTelPortable(String telPortable) {
        this.telPortable = telPortable;
    }

    public String getTelFixe() {
        return telFixe;
    }

    public void setTelFixe(String telFixe) {
        this.telFixe = telFixe;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresseActuelle() {
        return adresseActuelle;
    }

    public void setAdresseActuelle(String adresseActuelle) {
        this.adresseActuelle = adresseActuelle;
    }

    public String getCodePostalActuel() {
        return codePostalActuel;
    }

    public void setCodePostalActuel(String codePostalActuel) {
        this.codePostalActuel = codePostalActuel;
    }

    public String getVilleActuelle() {
        return villeActuelle;
    }

    public void setVilleActuelle(String villeActuelle) {
        this.villeActuelle = villeActuelle;
    }

    public String getPaysActuel() {
        return paysActuel;
    }

    public void setPaysActuel(String paysActuel) {
        this.paysActuel = paysActuel;
    }

    public String getAdressePermanente() {
        return adressePermanente;
    }

    public void setAdressePermanente(String adressePermanente) {
        this.adressePermanente = adressePermanente;
    }

    public String getCodePostalPermanente() {
        return codePostalPermanente;
    }

    public void setCodePostalPermanente(String codePostalPermanente) {
        this.codePostalPermanente = codePostalPermanente;
    }

    public String getVillePermanente() {
        return villePermanente;
    }

    public void setVillePermanente(String villePermanente) {
        this.villePermanente = villePermanente;
    }

    public String getPaysPermanente() {
        return paysPermanente;
    }

    public void setPaysPermanente(String paysPermanente) {
        this.paysPermanente = paysPermanente;
    }

    public String getDernierDiplome() {
        return dernierDiplome;
    }

    public void setDernierDiplome(String dernierDiplome) {
        this.dernierDiplome = dernierDiplome;
    }

    public String getUniversite() {
        return universite;
    }

    public void setUniversite(String universite) {
        this.universite = universite;
    }

    public String getSigleEtudiant() {
        return sigleEtudiant;
    }

    public void setSigleEtudiant(String sigleEtudiant) {
        this.sigleEtudiant = sigleEtudiant;
    }

    public String getCompteCRI() {
        return compteCRI;
    }

    public void setCompteCRI(String compteCRI) {
        this.compteCRI = compteCRI;
    }

    public String getUboEmail() {
        return uboEmail;
    }

    public void setUboEmail(String uboEmail) {
        this.uboEmail = uboEmail;
    }

    public Integer getGroupeAnglais() {
        return groupeAnglais;
    }

    public void setGroupeAnglais(Integer groupeAnglais) {
        this.groupeAnglais = groupeAnglais;
    }

    public String getAbandonMotif() {
        return abandonMotif;
    }

    public void setAbandonMotif(String abandonMotif) {
        this.abandonMotif = abandonMotif;
    }

    public Date getAbandonDate() {
        return abandonDate;
    }

    public void setAbandonDate(Date abandonDate) {
        this.abandonDate = abandonDate;
    }

    public char getEstDiplome() {
        return estDiplome;
    }

    public void setEstDiplome(char estDiplome) {
        this.estDiplome = estDiplome;
    }

    public Promotion getPromotion() {
        return promotion;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }
//
//    public String getCheckEtudiantSituation() {
//        return checkEtudiantSituation;
//    }
//
//    public void setCheckEtudiantSituation(String checkEtudiantSituation) {
//        this.checkEtudiantSituation = checkEtudiantSituation;
//    }
//
//    public String getCheckEtudiantSexe() {
//        return checkEtudiantSexe;
//    }
//
//    public void setCheckEtudiantSexe(String checkEtudiantSexe) {
//        this.checkEtudiantSexe = checkEtudiantSexe;
//    }
//
//    public String getCheckEtudiantDiplome() {
//        return checkEtudiantDiplome;
//    }
//
//    public void setCheckEtudiantDiplome(String checkEtudiantDiplome) {
//        this.checkEtudiantDiplome = checkEtudiantDiplome;
//    }
}
