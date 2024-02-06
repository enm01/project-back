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

//    @Column(name = "CK_ENS_SEXE", columnDefinition = "CHECK (SEXE IN ('H', 'F', 'L'))")
//    private String checkEnseignantSexe;

    public Enseignant() {
    }

    public Long getNoEnseignant() {
        return noEnseignant;
    }

    public void setNoEnseignant(Long noEnseignant) {
        this.noEnseignant = noEnseignant;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getTelPort() {
        return telPort;
    }

    public void setTelPort(String telPort) {
        this.telPort = telPort;
    }

    public String getEncPersoTel() {
        return encPersoTel;
    }

    public void setEncPersoTel(String encPersoTel) {
        this.encPersoTel = encPersoTel;
    }

    public String getEncUboTel() {
        return encUboTel;
    }

    public void setEncUboTel(String encUboTel) {
        this.encUboTel = encUboTel;
    }

    public String getEncPersoEmail() {
        return encPersoEmail;
    }

    public void setEncPersoEmail(String encPersoEmail) {
        this.encPersoEmail = encPersoEmail;
    }

    public String getEncUboEmail() {
        return encUboEmail;
    }

    public void setEncUboEmail(String encUboEmail) {
        this.encUboEmail = encUboEmail;
    }

    public String getIntNoInsee() {
        return intNoInsee;
    }

    public void setIntNoInsee(String intNoInsee) {
        this.intNoInsee = intNoInsee;
    }

    public String getIntSocNom() {
        return intSocNom;
    }

    public void setIntSocNom(String intSocNom) {
        this.intSocNom = intSocNom;
    }

    public String getIntSocAdresse() {
        return intSocAdresse;
    }

    public void setIntSocAdresse(String intSocAdresse) {
        this.intSocAdresse = intSocAdresse;
    }

    public String getIntSocCodePostal() {
        return intSocCodePostal;
    }

    public void setIntSocCodePostal(String intSocCodePostal) {
        this.intSocCodePostal = intSocCodePostal;
    }

    public String getIntSocVille() {
        return intSocVille;
    }

    public void setIntSocVille(String intSocVille) {
        this.intSocVille = intSocVille;
    }

    public String getIntSocPays() {
        return intSocPays;
    }

    public void setIntSocPays(String intSocPays) {
        this.intSocPays = intSocPays;
    }

    public String getIntFonction() {
        return intFonction;
    }

    public void setIntFonction(String intFonction) {
        this.intFonction = intFonction;
    }

    public String getIntProfEmail() {
        return intProfEmail;
    }

    public void setIntProfEmail(String intProfEmail) {
        this.intProfEmail = intProfEmail;
    }

    public String getIntProfTel() {
        return intProfTel;
    }

    public void setIntProfTel(String intProfTel) {
        this.intProfTel = intProfTel;
    }

//    public String getCheckEnseignantSexe() {
//        return checkEnseignantSexe;
//    }
//
//    public void setCheckEnseignantSexe(String checkEnseignantSexe) {
//        this.checkEnseignantSexe = checkEnseignantSexe;
//    }
}
