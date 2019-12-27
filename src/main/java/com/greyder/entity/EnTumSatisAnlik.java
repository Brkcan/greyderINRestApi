package com.greyder.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EnTumSatisAnlik")
public class EnTumSatisAnlik {

	
	@Column(name = "BRANCHID")
	private int branchId;
	@Column(name = "VID")
	private int vid;
	
	@Id
	@Column(name = "ID")
	private int id;
	
	@Column(name = "BELGE_TIP")
	private String belge_tip;
	@Column(name = "SUBE")
	private int sube;
	@Column(name = "M_F")
	private String m_f;
	@Column(name = "MAGAZA")
	private String magaza;
	@Column(name = "YIL")
	private int yil;
	@Column(name = "AY")
	private int ay;
	@Column(name = "HAFTA")
	private int hafta;
	@Column(name = "GUN")
	private int gün;
	@Column(name = "GUNLER")
	private String gunler;
	@Column(name = "SAAT")
	private int saat;
	@Column(name = "TIP")
	private String tip;
	@Column(name = "BELGE_NO")
	private String belge_no;
	@Column(name = "TARIH")
	private Date tarih;
	@Column(name = "PLASIYER_ADI")
	private String plasiyer_adi;
	@Column(name = "MIKTAR")
	private int miktar;
	@Column(name = "STOK_ADI")
	private String stok_adi;
	@Column(name = "BIRIM")
	private String birim;
	@Column(name = "KDV_ORANI")
	private int kdv_orani;
	@Column(name = "KDV_TUTAR")
	private int kdv_tutar;
	@Column(name = "BRUT_TUTAR")
	private int brüt_tutar;
	@Column(name = "NET_TUTAR")
	private int net_tutar;
	@Column(name = "BRUT_FIYAT")
	private int brüt_fiyat;
	@Column(name = "NET_FIYAT")
	private int net_fiyat;
	@Column(name = "INDIRIM")
	private int indirim;
	@Column(name = "AVANTAJ_INDIRIM")
	private int avantaj_indirim;
	@Column(name = "TUTAR")
	private int tutar;
	@Column(name = "CINSIYET")
	private String cinsiyet;
	@Column(name = "BARKOD")
	private String barkod;
	@Column(name = "STOK_KODU")
	private String stok_kodu;
	@Column(name = "DEPO_KODU")
	private int depo_kodu;
	@Column(name = "URUN_GRUBU")
	private String urun_grubu;

	public EnTumSatisAnlik() {
		super();
	}

	public EnTumSatisAnlik(int branchId, int vid, int id, String belge_tip, int sube, String m_f, String magaza,
			int yil, int ay, int hafta, int gün, String gunler, int saat, String tip, String belge_no, Date tarih,
			String plasiyer_adi, int miktar, String stok_adi, String birim, int kdv_orani, int kdv_tutar,
			int brüt_tutar, int net_tutar, int brüt_fiyat, int net_fiyat, int indirim, int avantaj_indirim, int tutar,
			String cinsiyet, String barkod, String stok_kodu, int depo_kodu, String urun_grubu) {
		super();
		this.branchId = branchId;
		this.vid = vid;
		this.id = id;
		this.belge_tip = belge_tip;
		this.sube = sube;
		this.m_f = m_f;
		this.magaza = magaza;
		this.yil = yil;
		this.ay = ay;
		this.hafta = hafta;
		this.gün = gün;
		this.gunler = gunler;
		this.saat = saat;
		this.tip = tip;
		this.belge_no = belge_no;
		this.tarih = tarih;
		this.plasiyer_adi = plasiyer_adi;
		this.miktar = miktar;
		this.stok_adi = stok_adi;
		this.birim = birim;
		this.kdv_orani = kdv_orani;
		this.kdv_tutar = kdv_tutar;
		this.brüt_tutar = brüt_tutar;
		this.net_tutar = net_tutar;
		this.brüt_fiyat = brüt_fiyat;
		this.net_fiyat = net_fiyat;
		this.indirim = indirim;
		this.avantaj_indirim = avantaj_indirim;
		this.tutar = tutar;
		this.cinsiyet = cinsiyet;
		this.barkod = barkod;
		this.stok_kodu = stok_kodu;
		this.depo_kodu = depo_kodu;
		this.urun_grubu = urun_grubu;
	}

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBelge_tip() {
		return belge_tip;
	}

	public void setBelge_tip(String belge_tip) {
		this.belge_tip = belge_tip;
	}

	public int getSube() {
		return sube;
	}

	public void setSube(int sube) {
		this.sube = sube;
	}

	public String getM_f() {
		return m_f;
	}

	public void setM_f(String m_f) {
		this.m_f = m_f;
	}

	public String getMagaza() {
		return magaza;
	}

	public void setMagaza(String magaza) {
		this.magaza = magaza;
	}

	public int getYil() {
		return yil;
	}

	public void setYil(int yil) {
		this.yil = yil;
	}

	public int getAy() {
		return ay;
	}

	public void setAy(int ay) {
		this.ay = ay;
	}

	public int getHafta() {
		return hafta;
	}

	public void setHafta(int hafta) {
		this.hafta = hafta;
	}

	public int getGün() {
		return gün;
	}

	public void setGün(int gün) {
		this.gün = gün;
	}

	public String getGunler() {
		return gunler;
	}

	public void setGunler(String gunler) {
		this.gunler = gunler;
	}

	public int getSaat() {
		return saat;
	}

	public void setSaat(int saat) {
		this.saat = saat;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public String getBelge_no() {
		return belge_no;
	}

	public void setBelge_no(String belge_no) {
		this.belge_no = belge_no;
	}

	public Date getTarih() {
		return tarih;
	}

	public void setTarih(Date tarih) {
		this.tarih = tarih;
	}

	public String getPlasiyer_adi() {
		return plasiyer_adi;
	}

	public void setPlasiyer_adi(String plasiyer_adi) {
		this.plasiyer_adi = plasiyer_adi;
	}

	public int getMiktar() {
		return miktar;
	}

	public void setMiktar(int miktar) {
		this.miktar = miktar;
	}

	public String getStok_adi() {
		return stok_adi;
	}

	public void setStok_adi(String stok_adi) {
		this.stok_adi = stok_adi;
	}

	public String getBirim() {
		return birim;
	}

	public void setBirim(String birim) {
		this.birim = birim;
	}

	public int getKdv_orani() {
		return kdv_orani;
	}

	public void setKdv_orani(int kdv_orani) {
		this.kdv_orani = kdv_orani;
	}

	public int getKdv_tutar() {
		return kdv_tutar;
	}

	public void setKdv_tutar(int kdv_tutar) {
		this.kdv_tutar = kdv_tutar;
	}

	public int getBrüt_tutar() {
		return brüt_tutar;
	}

	public void setBrüt_tutar(int brüt_tutar) {
		this.brüt_tutar = brüt_tutar;
	}

	public int getNet_tutar() {
		return net_tutar;
	}

	public void setNet_tutar(int net_tutar) {
		this.net_tutar = net_tutar;
	}

	public int getBrüt_fiyat() {
		return brüt_fiyat;
	}

	public void setBrüt_fiyat(int brüt_fiyat) {
		this.brüt_fiyat = brüt_fiyat;
	}

	public int getNet_fiyat() {
		return net_fiyat;
	}

	public void setNet_fiyat(int net_fiyat) {
		this.net_fiyat = net_fiyat;
	}

	public int getIndirim() {
		return indirim;
	}

	public void setIndirim(int indirim) {
		this.indirim = indirim;
	}

	public int getAvantaj_indirim() {
		return avantaj_indirim;
	}

	public void setAvantaj_indirim(int avantaj_indirim) {
		this.avantaj_indirim = avantaj_indirim;
	}

	public int getTutar() {
		return tutar;
	}

	public void setTutar(int tutar) {
		this.tutar = tutar;
	}

	public String getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}

	public String getBarkod() {
		return barkod;
	}

	public void setBarkod(String barkod) {
		this.barkod = barkod;
	}

	public String getStok_kodu() {
		return stok_kodu;
	}

	public void setStok_kodu(String stok_kodu) {
		this.stok_kodu = stok_kodu;
	}

	public int getDepo_kodu() {
		return depo_kodu;
	}

	public void setDepo_kodu(int depo_kodu) {
		this.depo_kodu = depo_kodu;
	}

	public String getUrun_grubu() {
		return urun_grubu;
	}

	public void setUrun_grubu(String urun_grubu) {
		this.urun_grubu = urun_grubu;
	}

	@Override
	public String toString() {
		return "EnTumSatisAnlik [branchId=" + branchId + ", vid=" + vid + ", id=" + id + ", belge_tip=" + belge_tip
				+ ", sube=" + sube + ", m_f=" + m_f + ", magaza=" + magaza + ", yil=" + yil + ", ay=" + ay + ", hafta="
				+ hafta + ", gün=" + gün + ", gunler=" + gunler + ", saat=" + saat + ", tip=" + tip + ", belge_no="
				+ belge_no + ", tarih=" + tarih + ", plasiyer_adi=" + plasiyer_adi + ", miktar=" + miktar
				+ ", stok_adi=" + stok_adi + ", birim=" + birim + ", kdv_orani=" + kdv_orani + ", kdv_tutar="
				+ kdv_tutar + ", brüt_tutar=" + brüt_tutar + ", net_tutar=" + net_tutar + ", brüt_fiyat=" + brüt_fiyat
				+ ", net_fiyat=" + net_fiyat + ", indirim=" + indirim + ", avantaj_indirim=" + avantaj_indirim
				+ ", tutar=" + tutar + ", cinsiyet=" + cinsiyet + ", barkod=" + barkod + ", stok_kodu=" + stok_kodu
				+ ", depo_kodu=" + depo_kodu + ", urun_grubu=" + urun_grubu + "]";
	}

}
