package quan_ly_phuong_tien_giao_thong.src.model;

public class Manufacturer {
    private String manufacturerCode;
    private String manufacturerName;
    private String country;

    public  Manufacturer(String manufacturerCode, String manufacturerName, String country) {
        this.manufacturerCode = manufacturerCode;
        this.manufacturerName = manufacturerName;
        this.country = country;
    }

    public String getManufacturerCode() {
        return manufacturerCode;
    }

    public void setManufacturerCode(String manufacturerCode) {
        this.manufacturerCode = manufacturerCode;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String toString() {
        return manufacturerName;
    }
}
