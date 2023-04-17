package bhyt.controller;

import bhyt.model.Data;
import bhyt.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {
    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        super();
        this.customerService = customerService;
    }

//    @GetMapping("/customers/home/report/reportbyyear")
//    public String listCustomers(Model model) {
//        model.addAttribute("listCustomersYear", customerService.getReportByYear());
//        return "report_by_year";
//    }
    @PostMapping("/customers/home/report/reportbyyear")
    public String listCustomersYear(@ModelAttribute("data") Data data,Model model) {
        model.addAttribute("listCustomersYear", customerService.getReportByYear(data));
    return "report_by_year";
    }
    @GetMapping("/customers/home/report/reportbyyear")
    public String reportByYear(Model model) {
        Data data = new Data();
        model.addAttribute("data", data);
        return "report_by_year";
    }
    @GetMapping("/customers")
    public String index() {
        return "index";
    }
    @GetMapping("/customers/home")
    public String home() {
        return "home";
    }
    @GetMapping("/customers/home/report")
    public String report() { return "report"; }
//    @GetMapping("/customers/home/report/reportcomplete")
//    public String listCustomersComplete(Model model) {
//        model.addAttribute("listCustomersComplete", customerService.getReportByCompleteFee());
//        return "report_complete";
//    }
    @PostMapping("/customers/home/report/reportcomplete")
    public String listCustomersComplete(@ModelAttribute("data") Data data,Model model) {
        model.addAttribute("listCustomersComplete", customerService.getReportByCompleteFee(data));
        return "report_complete";
    }
    @GetMapping("/customers/home/report/reportcomplete")
    public String reportComplete(Model model) {
        Data data = new Data();
        model.addAttribute("data", data);
        return "report_complete";
    }

//    @GetMapping("/customers/home/report/reportnotcomplete")
//    public String listCustomersNotComplete(Model model) {
//        model.addAttribute("listCustomersNotComplete", customerService.getReportByNotCompleteFee());
//        return "report_not_complete";
//    }
    @PostMapping("/customers/home/report/reportnotcomplete")
    public String listCustomersNotComplete(@ModelAttribute("data") Data data,Model model) {
        model.addAttribute("listCustomersNotComplete", customerService.getReportByNotCompleteFee(data));
        return "report_not_complete";
    }
    @GetMapping("/customers/home/report/reportnotcomplete")
    public String reportNotComplete(Model model) {
        Data data = new Data();
        model.addAttribute("data", data);
        return "report_not_complete";
    }
    @PostMapping("/customers/home/viewlist")
    public String listCustomers(@ModelAttribute("data") Data data,Model model) {
        model.addAttribute("listCustomers", customerService.getAllCustomer(data));
        return "customers";
    }
    @GetMapping("/customers/home/viewlist")
    public String viewlist(Model model) {
        Data data = new Data();
        model.addAttribute("data", data);
        return "customers";
    }

}
