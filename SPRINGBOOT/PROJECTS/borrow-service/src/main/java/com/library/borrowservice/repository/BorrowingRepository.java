package com.library.borrowservice.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.borrowservice.model.Borrowing;



@Repository
public interface BorrowingRepository extends JpaRepository<Borrowing, Long> {
    List<Borrowing> findByUserId(Long userId);
}
