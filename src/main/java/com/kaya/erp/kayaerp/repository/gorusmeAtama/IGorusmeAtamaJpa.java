package com.kaya.erp.kayaerp.repository.gorusmeAtama;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaya.erp.kayaerp.entity.model.GorusmeAtama;


public interface IGorusmeAtamaJpa extends JpaRepository<GorusmeAtama,Integer>,ICustomGorusmeAtama {

}
