package com.library.borrowservice.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.borrowservice.model.Borrowing;
import com.library.borrowservice.repository.BorrowingRepository;

@Service
public class BorrowingService {
    @Autowired
    private BorrowingRepository borrowingRepository;

    public List<Borrowing> findBorrowedBooks(Long userId) {
        return borrowingRepository.findByUserId(userId);
    }

    public Borrowing borrowBook(Borrowing borrowing) {
        borrowing.setBorrowDate(LocalDate.now());
        return borrowingRepository.save(borrowing);
    }

    public Borrowing returnBook(Long id) {
        Optional<Borrowing> borrowingOptional = borrowingRepository.findById(id);
        if (borrowingOptional.isPresent()) {
            Borrowing borrowing = borrowingOptional.get();
            borrowing.setReturnDate(LocalDate.now());
            return borrowingRepository.save(borrowing);
        }
        return null;
    }
}

