package jason.chen.mini_springboot.restful.biz

import jason.chen.mini_springboot.restful.entity.Customer
import org.springframework.data.repository.CrudRepository

interface CustomerRepository : CrudRepository<Customer, Long> {

    fun findByLastName(lastName: String): Iterable<Customer>
}
