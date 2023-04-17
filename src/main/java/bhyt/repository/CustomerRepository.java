package bhyt.repository;

import bhyt.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    @Query(" SELECT YEAR(e.dateEnd) AS year, SUM(e.price) AS total_price FROM Customer e WHERE ((''=:city OR e.province = :city) AND (''=:district OR e.district = :district) AND (''=:ward OR e.ward = :ward)) GROUP BY YEAR(e.dateStart) ")
    List<Object[]> reportByYear(String city, String district, String ward);
//    @Query(" SELECT e FROM Customer e WHERE  (e.status='Đã hoàn thành' AND (''=:province OR e.province = :province)  AND (''=:district OR e.district = :district) AND (''=:ward OR e.ward = :ward) AND (''=:dateStart OR e.dateStart >= :dateStart) AND (''=:dateEnd OR e.dateStart <= :dateEnd)) ")
//    List<Customer> reportComplete(String province, String district, String ward, Date dateStart, Date dateEnd);
    @Query(" SELECT e FROM Customer e WHERE  (e.status='Đã hoàn thành'  AND e.dateStart >= :dateStart AND e.dateStart <= :dateEnd) ")
    List<Customer> reportComplete0(Date dateStart, Date dateEnd);
    @Query(" SELECT e FROM Customer e WHERE  (e.status='Đã hoàn thành' AND e.province = :province AND e.dateStart >= :dateStart AND e.dateStart <= :dateEnd) ")
    List<Customer> reportComplete1(String province, Date dateStart, Date dateEnd);
    @Query(" SELECT e FROM Customer e WHERE  (e.status='Đã hoàn thành' AND e.province = :province  AND e.district = :district AND e.dateStart >= :dateStart AND e.dateStart <= :dateEnd) ")
    List<Customer> reportComplete2(String province, String district, Date dateStart, Date dateEnd);
    @Query(" SELECT e FROM Customer e WHERE  (e.status='Đã hoàn thành' AND e.province = :province  AND e.district = :district AND e.ward = :ward AND e.dateStart >= :dateStart AND e.dateStart <= :dateEnd) ")
    List<Customer> reportComplete3(String province, String district, String ward, Date dateStart, Date dateEnd);

//    @Query(" SELECT e FROM Customer e WHERE  (e.status='Chưa hoàn thành' AND (''=:province OR e.province = :province) AND (''=:district OR e.district = :district) AND (''=:ward OR e.ward = :ward) AND (''=:dateStart OR e.dateStart >= :dateStart) AND (''=:dateEnd OR e.dateStart <= :dateEnd)) ")
//    List<Customer> reportNotComplete(String province, String district, String ward, Date dateStart, Date dateEnd);
    @Query(" SELECT e FROM Customer e WHERE  (e.status='Đã hoàn thành'  AND e.dateStart >= :dateStart AND e.dateStart <= :dateEnd) ")
    List<Customer> reportNotComplete0(Date dateStart, Date dateEnd);
    @Query(" SELECT e FROM Customer e WHERE  (e.status='Chưa hoàn thành' AND e.province = :province AND  e.dateStart >= :dateStart AND e.dateStart <= :dateEnd) ")
    List<Customer> reportNotComplete1(String province, Date dateStart, Date dateEnd);
    @Query(" SELECT e FROM Customer e WHERE  (e.status='Chưa hoàn thành' AND e.province = :province AND e.district = :district AND e.dateStart >= :dateStart AND e.dateStart <= :dateEnd) ")
    List<Customer> reportNotComplete2(String province, String district,  Date dateStart, Date dateEnd);
    @Query(" SELECT e FROM Customer e WHERE  (e.status='Chưa hoàn thành' AND e.province = :province AND e.district = :district AND e.ward = :ward AND e.dateStart >= :dateStart AND e.dateStart <= :dateEnd) ")
    List<Customer> reportNotComplete3(String province, String district, String ward, Date dateStart, Date dateEnd);
}

