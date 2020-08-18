package th.go.rd.atm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {

    @RequestMapping("/customer")
    public String getCustomerPage(Model model) {
        model.addAttribute("allCustomers", new String[]{"Peter", "Nancy", "Rick"});
        return "customer";
    }
}
