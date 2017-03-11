package jason.chen.mini_springboot.restful.controller

import jason.chen.mini_springboot.restful.biz.CustomerRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class CustomerController(val repository: CustomerRepository) {

	@GetMapping("/")
	fun findAll() = repository.findAll()

	@GetMapping("/{lastName}")
	fun findByLastName(@PathVariable lastName:String)
			= repository.findByLastName(lastName)
}