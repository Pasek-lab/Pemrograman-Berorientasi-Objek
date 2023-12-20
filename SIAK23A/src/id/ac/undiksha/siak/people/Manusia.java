package id.ac.undiksha.siak.people;

public abstract class Manusia {
	private String nama;
	private String tglLahir;
	private String alamat;
	private boolean jenisKelamin;
	
	public Manusia() {
		this.setNama("(Nama belum diisi)");
		this.setTglLahir("(Nama belum diisi)");
		this.setAlamat("(Alamat belum diisi)");
	}

	public Manusia(String nama, String tglLahir, String alamat, boolean jenisKelamin) {
		super();
		this.nama 			= nama;
		this.tglLahir 		= tglLahir;
		this.alamat 		= alamat;
		this.jenisKelamin 	= jenisKelamin;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public String getTglLahir() {
		return tglLahir;
	}

	public void setTglLahir(String tglLahir) {
		this.tglLahir = tglLahir;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public boolean getJenisKelamin() {
		return jenisKelamin;
	}

	public void setJenisKelamin(boolean jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}
}