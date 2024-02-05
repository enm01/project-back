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

    @Column(name = "PROCESSUS_STAGE", columnDefinition = "VARCHAR2(5) DEFAULT 'RECH'")
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

    @Column(name = "CK_PRO_ETAT_PRESELECTION", columnDefinition = "CHECK (ETAT_PRESELECTION IN ('TER', 'ENC'))")
    private String checkPromotionEtatPreselection;

    // Ajoutez les constructeurs, getters et setters selon vos besoins
}
