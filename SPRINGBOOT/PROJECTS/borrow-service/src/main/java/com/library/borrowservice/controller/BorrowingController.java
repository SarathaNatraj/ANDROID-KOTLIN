package com.library.borrowservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.library.borrowservice.model.Borrowing;
import com.library.borrowservice.service.BorrowingService;


@RestController
@RequestMapping("/borrow")
public class BorrowingController {
    @Autowired
    private BorrowingService borrowingService;

    @PostMapping
    public String borrowBook(@RequestBody Borrowing borrowing) {
    	String result = borrowingService.borrowBook(borrowing);
    	return result;
    }

    @PostMapping("/return/{id}")
    public ResponseEntity<Borrowing> returnBook(@PathVariable Long id) {
        return ResponseEntity.ok(borrowingService.returnBook(id));
    }

    @GetMapping("/{userId}")
    public List<Borrowing> getBorrowedBooks(@PathVariable Long userId) {
        return borrowingService.findBorrowedBooks(userId);
    }
}
