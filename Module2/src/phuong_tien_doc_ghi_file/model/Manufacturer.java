package phuong_tien_doc_ghi_file.model;

public class Manufacturer {
    private int code;
    private String name;
    private String country;
    public Manufacturer(int code, String name, String country) {
        this.code = code;
        this.name = name;
        this.country = country;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
