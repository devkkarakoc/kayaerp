package com.kaya.erp.kayaerp.entity.model;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Stok_Tb")
public class Stok {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ID otomatik artan ise
    @Column(name = "id")
    private int id;

    @Column(name = "stok_name", length = 150)
    private String stokName;

    @Column(name = "stok_birim", length = 100)
    private String stokBirim;

    @Column(name = "stok_marka", length = 100)
    private String stokMarka;

    

    
    
    
    
}
