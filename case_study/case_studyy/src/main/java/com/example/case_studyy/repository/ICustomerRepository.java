package com.example.case_studyy.repository;

import com.example.case_studyy.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer,Long> {
    @Query(value="SELECT  * FROM customer WHERE  name LIKE concat('%',?1,'%') ",
            countQuery= "SELECT  count(*) from customer WHERE  name LIKE concat('%',?1,'%')",
            nativeQuery=true)
    Page<Customer> searchByName(String name, Pageable pageable);

    @Query(value = "delete contract,customer from contract inner join customer on contract.customer_id = customer.id where contract.customer_id = ?1",nativeQuery=true)
    void deleteCustomer(Long id);


}
