package bhyt.impl;

import bhyt.model.Customer;
import bhyt.model.Data;
import bhyt.repository.CustomerRepository;
import bhyt.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerImpl implements CustomerService {
    private CustomerRepository customerRepository;

    public CustomerImpl(CustomerRepository customerRepository) {
        super();
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Object[]> getReportByYear(Data data) {
        System.out.println(data.getProvince());
        System.out.println(data.getDistrict());
        System.out.println(data.getWard());
        System.out.println(data.getDateStart());
        System.out.println(data.getDateEnd());
        return customerRepository.reportByYear(data.getProvince(), data.getDistrict(), data.getWard());
    }

    @Override
    public List<Customer> getReportByCompleteFee(Data data) {
        System.out.println(data.getProvince());
        System.out.println(data.getDistrict());
        System.out.println(data.getWard());
        System.out.println(data.getDateStart());
        System.out.println(data.getDateEnd());
        if (data.getProvince() == "") {
            return customerRepository.reportComplete0(  data.getDateStart(), data.getDateEnd());
        } else if (data.getDistrict() == "") {
            return customerRepository.reportComplete1(data.getProvince(),  data.getDateStart(), data.getDateEnd());
        } else if (data.getWard() == "") {
            return customerRepository.reportComplete2(data.getProvince(), data.getDistrict(),  data.getDateStart(), data.getDateEnd());
        } else {
            return customerRepository.reportComplete3(data.getProvince(), data.getDistrict(), data.getWard(), data.getDateStart(), data.getDateEnd());
        }

    }

    @Override
    public List<Customer> getReportByNotCompleteFee(Data data) {
        System.out.println(data.getProvince());
        System.out.println(data.getDistrict());
        System.out.println(data.getWard());
        System.out.println(data.getDateStart());
        System.out.println(data.getDateEnd());
        if (data.getProvince() == "") {
            return customerRepository.reportNotComplete0( data.getDateStart(), data.getDateEnd());
        } else if (data.getDistrict() == "") {
            return customerRepository.reportNotComplete1(data.getProvince(),  data.getDateStart(), data.getDateEnd());
        } else if (data.getWard() == "") {
            return customerRepository.reportNotComplete2(data.getProvince(), data.getDistrict(),  data.getDateStart(), data.getDateEnd());
        } else {
            return customerRepository.reportNotComplete3(data.getProvince(), data.getDistrict(), data.getWard(), data.getDateStart(), data.getDateEnd());
        }
    }
    @Override
    public List<Customer> getAllCustomer(Data data) {
        System.out.println(data.getProvince());
        System.out.println(data.getDistrict());
        System.out.println(data.getWard());
        System.out.println(data.getDateStart());
        System.out.println(data.getDateEnd());
        if (data.getProvince() == "") {
            return customerRepository.getAll0(data.getDateStart(), data.getDateEnd());
        } else if (data.getDistrict() == "") {
            return customerRepository.getAll1(data.getProvince(), data.getDateStart(), data.getDateEnd());
        } else if (data.getWard() == "") {
            return customerRepository.getAll2(data.getProvince(), data.getDistrict(), data.getDateStart(), data.getDateEnd());
        } else {
            return customerRepository.getAll3(data.getProvince(), data.getDistrict(), data.getWard(), data.getDateStart(), data.getDateEnd());
        }
    }
}
