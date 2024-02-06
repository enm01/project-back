package com.imane.projectsocleback.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "PROMOTION")
public class Promotion {

    @Id
    @Column(name = "ANNEE_PRO", nullable = false, length = 10)
    private String anneePro;

    @Column(name = "CODE_FORMATION", length = 8)
    private String codeFormation;

    @Column(name = "NO_ENSEIGNANT")
    private Long noEnseignant;

    @Column(name = "SIGLE_PRO", nullable = false, length = 5)
    private String siglePromotion;

    @Column(name = "NB_ETU_SOUHAITE", nullable = false)
    private Integer nbEtudiantsSouhaite;

    @Column(name = "ETAT_PRESELECTION", nullable = false, length = 3)
    private String etatPreselection;

    @Column(name = "DATE_RENTREE")
    @Temporal(TemporalType.DATE)
    private Date dateRentree;

    @Column(name = "LIEU_RENTREE", length = 255)
    private String lieuRentree;

    @Column(name = "DATE_REPONSE_LP")
    @Temporal(TemporalType.DATE)
    private Date dateReponseLP;

    @Column(name = "COMMENTAIRE", length = 255)
    private String commentaire;

    @Column(name = "DATE_REPONSE_LALP")
    @Temporal(TemporalType.DATE)
    private Date dateReponseLALP;

    @Column(name = "PROCESSUS_STAGE")
    private String processusStage = "RECH";

    @Column(name = "NO_EVALUATION")
    private Integer noEvaluation;

    @Column(name = "NO_BAREME")
    private Integer noBareme;

    @ManyToOne
    @JoinColumn(name = "NO_ENSEIGNANT", referencedColumnName = "NO_ENSEIGNANT", insertable = false, updatable = false)
    private Enseignant enseignant;

    @ManyToOne
    @JoinColumn(name = "CODE_FORMATION", referencedColumnName = "CODE_FORMATION", insertable = false, updatable = false)
    private Formation formation;

//    @Column(name = "CK_PRO_ETAT_PRESELECTION", columnDefinition = "CHECK (ETAT_PRESELECTION IN ('TER', 'ENC'))")
//    private String checkPromotionEtatPreselection;

    public Promotion() {
    }

    public String getAnneePro() {
        return anneePro;
    }

    public void setAnneePro(String anneePro) {
        this.anneePro = anneePro;
    }

    public String getCodeFormation() {
        return codeFormation;
    }

    public void setCodeFormation(String codeFormation) {
        this.codeFormation = codeFormation;
    }

    public Long getNoEnseignant() {
        return noEnseignant;
    }

    public void setNoEnseignant(Long noEnseignant) {
        this.noEnseignant = noEnseignant;
    }

    public String getSiglePromotion() {
        return siglePromotion;
    }

    public void setSiglePromotion(String siglePromotion) {
        this.siglePromotion = siglePromotion;
    }

    public Integer getNbEtudiantsSouhaite() {
        return nbEtudiantsSouhaite;
    }

    public void setNbEtudiantsSouhaite(Integer nbEtudiantsSouhaite) {
        this.nbEtudiantsSouhaite = nbEtudiantsSouhaite;
    }

    public String getEtatPreselection() {
        return etatPreselection;
    }

    public void setEtatPreselection(String etatPreselection) {
        this.etatPreselection = etatPreselection;
    }

    public Date getDateRentree() {
        return dateRentree;
    }

    public void setDateRentree(Date dateRentree) {
        this.dateRentree = dateRentree;
    }

    public String getLieuRentree() {
        return lieuRentree;
    }

    public void setLieuRentree(String lieuRentree) {
        this.lieuRentree = lieuRentree;
    }

    public Date getDateReponseLP() {
        return dateReponseLP;
    }

    public void setDateReponseLP(Date dateReponseLP) {
        this.dateReponseLP = dateReponseLP;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Date getDateReponseLALP() {
        return dateReponseLALP;
    }

    public void setDateReponseLALP(Date dateReponseLALP) {
        this.dateReponseLALP = dateReponseLALP;
    }

    public String getProcessusStage() {
        return processusStage;
    }

    public void setProcessusStage(String processusStage) {
        this.processusStage = processusStage;
    }

    public Integer getNoEvaluation() {
        return noEvaluation;
    }

    public void setNoEvaluation(Integer noEvaluation) {
        this.noEvaluation = noEvaluation;
    }

    public Integer getNoBareme() {
        return noBareme;
    }

    public void setNoBareme(Integer noBareme) {
        this.noBareme = noBareme;
    }

    public Enseignant getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(Enseignant enseignant) {
        this.enseignant = enseignant;
    }

    public Formation getFormation() {
        return formation;
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
    }

//    public String getCheckPromotionEtatPreselection() {
//        return checkPromotionEtatPreselection;
//    }
//
//    public void setCheckPromotionEtatPreselection(String checkPromotionEtatPreselection) {
//        this.checkPromotionEtatPreselection = checkPromotionEtatPreselection;
//    }
}
