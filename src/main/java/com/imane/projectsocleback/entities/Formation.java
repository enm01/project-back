package com.imane.projectsocleback.entities;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "FORMATION")
public class Formation {

    @Id
    @Column(name = "CODE_FORMATION", nullable = false, length = 8)
    private String codeFormation;

    @Column(name = "DIPLOME", nullable = false, length = 3)
    private String diplome;

    @Column(name = "N0_ANNEE", nullable = false)
    private int numeroAnnee;

    @Column(name = "NOM_FORMATION", nullable = false, length = 64)
    private String nomFormation;

    @Column(name = "DOUBLE_DIPLOME", nullable = false, length = 1)
    private String doubleDiplome;

    @Column(name = "DEBUT_HABILITATION")
    @Temporal(TemporalType.DATE)
    private Date debutHabilitation;

    @Column(name = "FIN_HABILITATION")
    @Temporal(TemporalType.DATE)
    private Date finHabilitation;

//    @Column(name = "CK_FRM_NO_ANNEE", columnDefinition = "CHECK (N0_ANNEE BETWEEN 1 AND 3)")
//    private int checkFormationAnnee;

    public Formation() {
    }

    public String getCodeFormation() {
        return codeFormation;
    }

    public void setCodeFormation(String codeFormation) {
        this.codeFormation = codeFormation;
    }

    public String getDiplome() {
        return diplome;
    }

    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }

    public int getNumeroAnnee() {
        return numeroAnnee;
    }

    public void setNumeroAnnee(int numeroAnnee) {
        this.numeroAnnee = numeroAnnee;
    }

    public String getNomFormation() {
        return nomFormation;
    }

    public void setNomFormation(String nomFormation) {
        this.nomFormation = nomFormation;
    }

    public String getDoubleDiplome() {
        return doubleDiplome;
    }

    public void setDoubleDiplome(String doubleDiplome) {
        this.doubleDiplome = doubleDiplome;
    }

    public Date getDebutHabilitation() {
        return debutHabilitation;
    }

    public void setDebutHabilitation(Date debutHabilitation) {
        this.debutHabilitation = debutHabilitation;
    }

    public Date getFinHabilitation() {
        return finHabilitation;
    }

    public void setFinHabilitation(Date finHabilitation) {
        this.finHabilitation = finHabilitation;
    }

//    public int getCheckFormationAnnee() {
//        return checkFormationAnnee;
//    }
//
//    public void setCheckFormationAnnee(int checkFormationAnnee) {
//        this.checkFormationAnnee = checkFormationAnnee;
//    }
}
