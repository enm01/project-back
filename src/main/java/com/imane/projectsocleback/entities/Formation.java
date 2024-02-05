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

    @Column(name = "CK_FRM_NO_ANNEE", columnDefinition = "CHECK (N0_ANNEE BETWEEN 1 AND 3)")
    private int checkFormationAnnee;

    // Ajoutez les constructeurs, getters et setters selon vos besoins
}
