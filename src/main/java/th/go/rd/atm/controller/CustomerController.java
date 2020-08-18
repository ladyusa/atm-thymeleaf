package th.go.rd.atm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CustomerController {

    @RequestMapping("/customer")
    public String getCustomerPage(Model model) {
        List<Customer> customerList= new ArrayList<>();
        customerList.add(new Customer(1,"Peter",1234));
        customerList.add(new Customer(2,"Nancy",2345));
        customerList.add(new Customer(3,"Rick",3456));
        model.addAttribute("allCustomers", customerList);
        return "customer";
    }
}
