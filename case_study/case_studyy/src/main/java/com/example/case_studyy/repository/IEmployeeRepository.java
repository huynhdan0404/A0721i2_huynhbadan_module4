package com.example.case_studyy.repository;

import com.example.case_studyy.model.Customer;
import com.example.case_studyy.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee,Long> {
    @Query(value="SELECT  * FROM employee WHERE  name LIKE concat('%',?1,'%') ",
            countQuery= "SELECT  count(*) from employee WHERE  name LIKE concat('%',?1,'%')",
            nativeQuery=true)
    Page<Employee> searchByName(String name, Pageable pageable);
}
