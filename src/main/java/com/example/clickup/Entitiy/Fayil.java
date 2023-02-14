package com.example.clickup.Entitiy;

import com.example.clickup.Entitiy.Abstrakt.AbstaraktEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Fayil extends AbstaraktEntity {
    @Column(nullable = false)
    private String nomi;
    @Column(nullable = false)
    private String orginalnomi;
    @Column(nullable = false)
    private String hajim;
    @Column(nullable = false)
    private String kengaytmasi;
}
