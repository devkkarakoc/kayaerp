package com.kaya.erp.kayaerp.entity.model;

import java.security.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Bayi_Tb")
public class Bayi {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ID otomatik artan ise
    @Column(name = "id")
    private int id;

    @Column(name = "bayi_adres", length = 255)
    private String bayiAdres;

    @Column(name = "bayi_il", length = 100)
    private String bayiIl;

    @Column(name = "bayi_ilce", length = 100)
    private String bayiIlce;

    @Column(name = "bayi_mail", length = 150, unique = true)
    private String bayiMail;

    @Column(name = "bayi_statu")
    private int bayiStatu;

    @Column(name = "bayi_tel", length = 20)
    private String bayiTel;

    @Column(name = "bayi_ismi", length = 150)
    private String bayiIsmi;

    @Column(name = "bayi_kodu", length = 50, unique = true)
    private String bayiKodu;

    @Column(name = "bayi_acilis_tarih")
    private Timestamp bayiAcilisTarih;

    
    @Column(name = "bayi_güncelleme_tarihi")
    private Timestamp bayiGuncellemeTarihi;

    @Column(name = "bayi_vergi_no", length = 50, unique = true)
    private String bayiVergiNo;

    @Column(name = "bayi_vergi_dairesi", length = 100)
    private String bayiVergiDairesi;

    
    
    
	public Bayi() {
		super();
	}

	public Bayi(int id, String bayiAdres, String bayiIl, String bayiIlce, String bayiMail, int bayiStatu,
			String bayiTel, String bayiIsmi, String bayiKodu, Timestamp bayiAcilisTarih, Timestamp bayiGuncellemeTarihi,
			String bayiVergiNo, String bayiVergiDairesi) {
		super();
		this.id = id;
		this.bayiAdres = bayiAdres;
		this.bayiIl = bayiIl;
		this.bayiIlce = bayiIlce;
		this.bayiMail = bayiMail;
		this.bayiStatu = bayiStatu;
		this.bayiTel = bayiTel;
		this.bayiIsmi = bayiIsmi;
		this.bayiKodu = bayiKodu;
		this.bayiAcilisTarih = bayiAcilisTarih;
		this.bayiGuncellemeTarihi = bayiGuncellemeTarihi;
		this.bayiVergiNo = bayiVergiNo;
		this.bayiVergiDairesi = bayiVergiDairesi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBayiAdres() {
		return bayiAdres;
	}

	public void setBayiAdres(String bayiAdres) {
		this.bayiAdres = bayiAdres;
	}

	public String getBayiIl() {
		return bayiIl;
	}

	public void setBayiIl(String bayiIl) {
		this.bayiIl = bayiIl;
	}

	public String getBayiIlce() {
		return bayiIlce;
	}

	public void setBayiIlce(String bayiIlce) {
		this.bayiIlce = bayiIlce;
	}

	public String getBayiMail() {
		return bayiMail;
	}

	public void setBayiMail(String bayiMail) {
		this.bayiMail = bayiMail;
	}

	public int getBayiStatu() {
		return bayiStatu;
	}

	public void setBayiStatu(int bayiStatu) {
		this.bayiStatu = bayiStatu;
	}

	public String getBayiTel() {
		return bayiTel;
	}

	public void setBayiTel(String bayiTel) {
		this.bayiTel = bayiTel;
	}

	public String getBayiIsmi() {
		return bayiIsmi;
	}

	public void setBayiIsmi(String bayiIsmi) {
		this.bayiIsmi = bayiIsmi;
	}

	public String getBayiKodu() {
		return bayiKodu;
	}

	public void setBayiKodu(String bayiKodu) {
		this.bayiKodu = bayiKodu;
	}

	public Timestamp getBayiAcilisTarih() {
		return bayiAcilisTarih;
	}

	public void setBayiAcilisTarih(Timestamp bayiAcilisTarih) {
		this.bayiAcilisTarih = bayiAcilisTarih;
	}

	public Timestamp getBayiGuncellemeTarihi() {
		return bayiGuncellemeTarihi;
	}

	public void setBayiGuncellemeTarihi(Timestamp bayiGuncellemeTarihi) {
		this.bayiGuncellemeTarihi = bayiGuncellemeTarihi;
	}

	public String getBayiVergiNo() {
		return bayiVergiNo;
	}

	public void setBayiVergiNo(String bayiVergiNo) {
		this.bayiVergiNo = bayiVergiNo;
	}

	public String getBayiVergiDairesi() {
		return bayiVergiDairesi;
	}

	public void setBayiVergiDairesi(String bayiVergiDairesi) {
		this.bayiVergiDairesi = bayiVergiDairesi;
	}
    
    
}
