package com.example.clickup.Entitiy;

import com.example.clickup.Entitiy.Abstrakt.AbstaraktEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class User extends AbstaraktEntity {
    @Column(nullable = false)
    private String name;
    @Column(nullable = false,unique = true)
    private String username;
    @Column(nullable = false)
    private String captcha;
    @Column(nullable = false)
    private char boshHarif;
    @Column(nullable = false)
    private String avaratRangi;
    @Column(nullable = false)
    private String platformaRang;
    @Column(nullable = false)
    private int ishchilarSoni;
    @ManyToOne
    private Fayil fayil;

}
