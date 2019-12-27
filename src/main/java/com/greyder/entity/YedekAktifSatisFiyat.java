package com.greyder.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "YEDEK_AktifSatisFiyat")
public class YedekAktifSatisFiyat {
	
	@Column(name = "URUN_KODU")
	@Id
	private String urun_kodu;
	@Column(name = "URUN_RENK_KOD")
	private String urun_renk_kod;
	@Column(name = "FIYAT1")
	private int fiyat1;
	
	public YedekAktifSatisFiyat() {
		super();
	}

	public YedekAktifSatisFiyat(String urun_kodu, String urun_renk_kod, int fiyat1) {
		super();
		this.urun_kodu = urun_kodu;
		this.urun_renk_kod = urun_renk_kod;
		this.fiyat1 = fiyat1;
	}

	public String getUrun_kodu() {
		return urun_kodu;
	}

	public void setUrun_kodu(String urun_kodu) {
		this.urun_kodu = urun_kodu;
	}

	public String getUrun_renk_kod() {
		return urun_renk_kod;
	}

	public void setUrun_renk_kod(String urun_renk_kod) {
		this.urun_renk_kod = urun_renk_kod;
	}

	public int getFiyat1() {
		return fiyat1;
	}

	public void setFiyat1(int fiyat1) {
		this.fiyat1 = fiyat1;
	}

	@Override
	public String toString() {
		return "YedekAktifSatisFiyat [urun_kodu=" + urun_kodu + ", urun_renk_kod=" + urun_renk_kod + ", fiyat1="
				+ fiyat1 + "]";
	}
	
	
}
