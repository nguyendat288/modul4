package Model;

public class Product {
    private int idsp;
    private String namesp;
    private String loaisp;
    private float gia;

    public Product() {
    }

    public int getIdsp() {
        return idsp;
    }

    public void setIdsp(int idsp) {
        this.idsp = idsp;
    }

    public String getNamesp() {
        return namesp;
    }

    public void setNamesp(String namesp) {
        this.namesp = namesp;
    }

    public String getLoaisp() {
        return loaisp;
    }

    public void setLoaisp(String loaisp) {
        this.loaisp = loaisp;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public Product(int idsp, String namesp, String loaisp, float gia) {
        this.idsp = idsp;
        this.namesp = namesp;
        this.loaisp = loaisp;
        this.gia = gia;
    }
}
