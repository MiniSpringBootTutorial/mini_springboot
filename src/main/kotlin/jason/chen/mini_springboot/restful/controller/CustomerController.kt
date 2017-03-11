package jason.chen.mini_springboot.restful.controller

import jason.chen.mini_springboot.restful.biz.CustomerService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class CustomerController(val customerService: CustomerService) {

    @GetMapping(value = "/")
    fun index(): String {
        return "index"
    }

    @GetMapping("/customers.do")
    fun listAll(model: Model): String {
        val allCustomers = customerService.findAll()
        model.addAttribute("customers", allCustomers)
        return "customers"
    }

    @GetMapping("/listCustomers")
    @ResponseBody
    fun listCustomers(model: Model) = customerService.findAll()

    @GetMapping("/{lastName}")
    @ResponseBody
    fun findByLastName(@PathVariable lastName: String)
            = customerService.findByLastName(lastName)
}