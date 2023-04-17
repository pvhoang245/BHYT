package bhyt.model;

import jakarta.persistence.*;

@Entity
@Table(name = "config")
public class Config {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private double salary;
    @Column
    private double worker;
    @Column
    private double retirement;
    @Column
    private double maternity;
    @Column
    private double unemployment;
    @Column
    private double other;
    @Column
    private double familyOne;
    @Column
    private double familyTwo;
    @Column
    private double familyThree;
    @Column
    private double familyFour;
    @Column
    private double familyFive;
    @Column
    private double poor;
    @Column
    private double nearPoor;
    @Column
    private double student;
    @Column
    private double farmer;

    public Config() {
    }

    public Config(Long id, double salary, double worker, double retirement, double maternity, double unemployment, double other, double familyOne, double familyTwo, double familyThree, double familyFour, double familyFive, double poor, double nearPoor, double student, double farmer) {
        this.id = id;
        this.salary = salary;
        this.worker = worker;
        this.retirement = retirement;
        this.maternity = maternity;
        this.unemployment = unemployment;
        this.other = other;
        this.familyOne = familyOne;
        this.familyTwo = familyTwo;
        this.familyThree = familyThree;
        this.familyFour = familyFour;
        this.familyFive = familyFive;
        this.poor = poor;
        this.nearPoor = nearPoor;
        this.student = student;
        this.farmer = farmer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getWorker() {
        return worker;
    }

    public void setWorker(double worker) {
        this.worker = worker;
    }

    public double getRetirement() {
        return retirement;
    }

    public void setRetirement(double retirement) {
        this.retirement = retirement;
    }

    public double getMaternity() {
        return maternity;
    }

    public void setMaternity(double maternity) {
        this.maternity = maternity;
    }

    public double getUnemployment() {
        return unemployment;
    }

    public void setUnemployment(double unemployment) {
        this.unemployment = unemployment;
    }

    public double getOther() {
        return other;
    }

    public void setOther(double other) {
        this.other = other;
    }

    public double getFamilyOne() {
        return familyOne;
    }

    public void setFamilyOne(double familyOne) {
        this.familyOne = familyOne;
    }

    public double getFamilyTwo() {
        return familyTwo;
    }

    public void setFamilyTwo(double familyTwo) {
        this.familyTwo = familyTwo;
    }

    public double getFamilyThree() {
        return familyThree;
    }

    public void setFamilyThree(double familyThree) {
        this.familyThree = familyThree;
    }

    public double getFamilyFour() {
        return familyFour;
    }

    public void setFamilyFour(double familyFour) {
        this.familyFour = familyFour;
    }

    public double getFamilyFive() {
        return familyFive;
    }

    public void setFamilyFive(double familyFive) {
        this.familyFive = familyFive;
    }

    public double getPoor() {
        return poor;
    }

    public void setPoor(double poor) {
        this.poor = poor;
    }

    public double getNearPoor() {
        return nearPoor;
    }

    public void setNearPoor(double nearPoor) {
        this.nearPoor = nearPoor;
    }

    public double getStudent() {
        return student;
    }

    public void setStudent(double student) {
        this.student = student;
    }

    public double getFarmer() {
        return farmer;
    }

    public void setFarmer(double farmer) {
        this.farmer = farmer;
    }
}