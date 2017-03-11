package jason.chen.mini_springboot.restful

import jason.chen.mini_springboot.restful.biz.CustomerRepository
import jason.chen.mini_springboot.restful.entity.Customer
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import java.util.*

@SpringBootApplication
class Application {

    private val log = LoggerFactory.getLogger(Application::class.java)

    @Bean
    fun init(repository: CustomerRepository) = CommandLineRunner {
        // save a couple of customers
        val now = Date();
        repository.save(Customer("Jason", "Chen", now, now, 0, now))
        repository.save(Customer("Bluce", "Li", now, now, 0, now))
        repository.save(Customer("Michelle", "Chen", now, now, 0, now))

        for (customer in repository.findAll()) {
            log.info(customer.toString())
        }

        // fetch an individual customer by ID
        val customer = repository.findOne(1L)
        log.info(customer.toString())
        // fetch customers by last name
        for (bauer in repository.findByLastName("Chen")) {
            log.info(bauer.toString())
        }
    }

}

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}
