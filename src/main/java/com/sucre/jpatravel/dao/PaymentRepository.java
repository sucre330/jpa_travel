package com.sucre.jpatravel.dao;

import com.sucre.jpatravel.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment,Integer> {

   /* @Query("select t from payment t where t.id=?1")
    Payment findOneById(Integer id);*/
}
