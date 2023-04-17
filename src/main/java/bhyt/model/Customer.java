package bhyt.model;

import jakarta.persistence.*;

import java.sql.Date;
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column(nullable = false, unique = true)
    private String code;
    @Column
    private String phone;
    @Column
    private double price;
    @Column
    private String home;
    @Column
    private String ward;
    @Column
    private String district;
    @Column
    private String province;
    @Column(name = "dateStart")
    private Date dateStart;
    @Column(name = "dateEnd")
    private Date dateEnd;
    @Column
    private String status;
    @Column
    private String note;
    @Column
    private int method;

    public Customer() {
    }

    public Customer(Long id, String name, String code, String phone, double price, String home, String ward, String district, String province, Date dateStart, Date dateEnd, String status, String note, int method) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.phone = phone;
        this.price = price;
        this.home = home;
        this.ward = ward;
        this.district = district;
        this.province = province;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.status = status;
        this.note = note;
        this.method=method;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getMethod() {
        return method;
    }

    public void setMethod(int method) {
        this.method = method;
    }
}
