package model;

public class HangHoa {
	private String maSanPham;
	private String tenSanPham;
	private String nhaSanXuat;
	private float soLuong;
	private float giaBan;
	private int ngaySanXuat;
	private int hanSuDung;
	public HangHoa(String maSanPham, String tenSanPham, String nhaSanXuat, float soLuong, float giaBan, int ngaySanXuat,
			int hanSuDung) {
		super();
		this.maSanPham = maSanPham;
		this.tenSanPham = tenSanPham;
		this.nhaSanXuat = nhaSanXuat;
		this.soLuong = soLuong;
		this.giaBan = giaBan;
		this.ngaySanXuat = ngaySanXuat;
		this.hanSuDung = hanSuDung;
	}
	public String getMaSanPham() {
		return maSanPham;
	}
	public void setMaSanPham(String maSanPham) {
		this.maSanPham = maSanPham;
	}
	public String getTenSanPham() {
		return tenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	public String getNhaSanXuat() {
		return nhaSanXuat;
	}
	public void setNhaSanXuat(String nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}
	public float getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(float soLuong) {
		this.soLuong = soLuong;
	}
	public float getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(float giaBan) {
		this.giaBan = giaBan;
	}
	public int getNgaySanXuat() {
		return ngaySanXuat;
	}
	public void setNgaySanXuat(int ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}
	public int getHanSuDung() {
		return hanSuDung;
	}
	public void setHanSuDung(int hanSuDung) {
		this.hanSuDung = hanSuDung;
	}
	
	
}


