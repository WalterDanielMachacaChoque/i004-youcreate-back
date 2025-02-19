package com.igrowker.miniproject.Payment.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.igrowker.miniproject.Payment.Model.Payment;
import com.igrowker.miniproject.Payment.Model.PaymentStatus;

import java.sql.Date;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    List<Payment> findByDate(Date date);
    List<Payment> findByStatus(PaymentStatus status);
    List<Payment> findByCollaboratorId(Long collaboratorId);

    @Query("SELECT p FROM Payment p WHERE YEAR(p.date) = :year")
    List<Payment> findByYear(@Param("year") int year);

    @Query("SELECT p FROM Payment p WHERE MONTH(p.date) = :month")
    List<Payment> findByMonth(@Param("month") int month);

    @Query("SELECT p FROM Payment p WHERE MONTH(p.date) = :month AND YEAR(p.date) = :year")
    List<Payment> findByMonthAndYear(@Param("month") int month, @Param("year") int year);

   
}
