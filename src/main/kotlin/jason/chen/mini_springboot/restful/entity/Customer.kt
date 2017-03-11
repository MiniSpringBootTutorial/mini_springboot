package jason.chen.mini_springboot.restful.entity

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Customer(
        val firstName: String,
        val lastName: String,
        val gmtCreated: Date,
        val gmtModified: Date,
        val isDeleted: Int, //1 Yes 0 No
        val deletedDate:Date,
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = -1) {
    override fun toString(): String {
        return "Customer(id=$id, firstName='$firstName', lastName='$lastName')"
    }
}
