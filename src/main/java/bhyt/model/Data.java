package bhyt.model;


import java.sql.Date;

public class Data {
    private Date dateStart;
    private Date dateEnd;
    private String province;
    private String district;
    private String ward;

    public Data() {
    }

    public Data(Date dateStart, Date dateEnd, String province, String district, String ward) {
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.province = province;
        this.district = district;
        this.ward = ward;
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

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }
}
