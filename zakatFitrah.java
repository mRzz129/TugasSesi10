public class zakatFitrah {
    private String nama;
    private String alamat;
    private String metodePembayaran;
    private boolean sedekah;
    private int nominalSedekah;
  
  public zakatFitrah(String nama, String alamat, String metodePembayaran, String sedekah2, int nominalSedekah) {
      this.nama = nama;
      this.alamat = alamat;
      this.metodePembayaran = metodePembayaran;
      this.nominalSedekah = nominalSedekah;
  }
  
  public zakatFitrah(String nama2, String alamat2, String metodePembayaran2, int jumlahZakat, String jawabanSedekah,
        int nominalSedekah2) {
}

public String getNama() {
      return nama;
  }
  
  public void setNama(String nama) {
      this.nama = nama;
  }
  
  public String getAlamat() {
      return alamat;
  }
  
  public void setAlamat(String alamat) {
      this.alamat = alamat;
  }
  
  public String getMetodePembayaran() {
      return metodePembayaran;
  }
  
  public void setMetodePembayaran(String metodePembayaran) {
      this.metodePembayaran = metodePembayaran;
  }
  
  public boolean getSedekah() {
      return sedekah;
  }
  
  public void setSedekah(boolean sedekah) {
      this.sedekah = sedekah;
  }
  
  public int getNominalSedekah() {
      return nominalSedekah;
  }
  
  public void setNominalSedekah(int nominalSedekah) {
      this.nominalSedekah = nominalSedekah;
  }
  
  
  }
