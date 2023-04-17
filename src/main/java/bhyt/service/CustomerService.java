package bhyt.service;

import bhyt.model.Customer;
import bhyt.model.Data;

import java.util.List;
public interface CustomerService {
    List<Object[]> getReportByYear(Data data);
    List<Customer> getReportByCompleteFee(Data data);
    List<Customer> getReportByNotCompleteFee(Data data);
    List<Customer> getAllCustomer();

}
