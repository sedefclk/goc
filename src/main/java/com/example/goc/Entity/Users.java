package com.example.goc.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "g_users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "adi")
    private String adi;

	@Column(name = "soyadi")
    private String soyadi;

	 @Column(name = "dogum_tarihi")
    private String dogumTarihi;

	 @Column(name = "cinsiyet")
    private String cinsiyet;

	 @Column(name = "email")
    private String email;

	 @Column(name = "telefon")
    private String telefon;

	 @Column(name = "uyruk")
    private String uyruk;

	 @Column(name = "basvuru_sebebi")
    private String basvuruSebebi;

	 @Column(name = "basvuru_sekli")
    private String basvuruSekli;

	 @Column(name = "basvuru_yapilan_il")
	 private String basvuruYapilanIl;

	 @Column(name = "kimlik_no")
	 private String kimlikNo;



	 @Override
	 public String toString() {
	     return "Users{" +
	             "id=" + id +
	             ", adi='" + adi + '\'' +
	             ", soyadi='" + soyadi + '\'' +
	             ", dogumTarihi='" + dogumTarihi + '\'' +
	             ", cinsiyet='" + cinsiyet + '\'' +
	             ", email='" + email + '\'' +
	             ", telefon='" + telefon + '\'' +
	             ", uyruk='" + uyruk + '\'' +
	             ", basvuruSebebi='" + basvuruSebebi + '\'' +
	             ", basvuruSekli='" + basvuruSekli + '\'' +
	             ", kimlikNo='" + kimlikNo + '\'' +", basvuru_yapilan_il='" + basvuruYapilanIl + '\'' +
	             '}';
	 }



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getAdi() {
		return adi;
	}



	public void setAdi(String adi) {
		this.adi = adi;
	}



	public String getSoyadi() {
		return soyadi;
	}



	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}



	public String getDogumTarihi() {
		return dogumTarihi;
	}



	public void setDogumTarihi(String dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}



	public String getCinsiyet() {
		return cinsiyet;
	}



	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getTelefon() {
		return telefon;
	}



	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}



	public String getUyruk() {
		return uyruk;
	}



	public void setUyruk(String uyruk) {
		this.uyruk = uyruk;
	}



	public String getBasvuruSebebi() {
		return basvuruSebebi;
	}



	public void setBasvuruSebebi(String basvuruSebebi) {
		this.basvuruSebebi = basvuruSebebi;
	}



	public String getBasvuruSekli() {
		return basvuruSekli;
	}



	public void setBasvuruSekli(String basvuruSekli) {
		this.basvuruSekli = basvuruSekli;
	}



	public String getBasvuruYapilanIl() {
		return basvuruYapilanIl;
	}



	public void setBasvuruYapilanIl(String basvuruYapilanIl) {
		this.basvuruYapilanIl = basvuruYapilanIl;
	}



	public String getKimlikNo() {
		return kimlikNo;
	}



	public void setKimlikNo(String kimlikNo) {
		this.kimlikNo = kimlikNo;
	}



}