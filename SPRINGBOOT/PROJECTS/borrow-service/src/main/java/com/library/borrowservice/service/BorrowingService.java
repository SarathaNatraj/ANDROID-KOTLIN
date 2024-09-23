package com.library.borrowservice.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.library.borrowservice.model.Book;
import com.library.borrowservice.model.Borrowing;
import com.library.borrowservice.repository.BorrowingRepository;

@Service
public class BorrowingService {
	@Autowired
	private BorrowingRepository borrowingRepository;

	@Autowired
	private RestTemplate restTemplate;

	public List<Borrowing> findBorrowedBooks(Long userId) {
		return borrowingRepository.findByUserId(userId);
	}

	public String borrowBook(Borrowing borrowing) {
		// Connect with BookService -> if Books are available then continue for borrow
		// if Book are not available, We will display can not borrow books

		ResponseEntity<Book> response = restTemplate
				.getForEntity("http://localhost:5556/books/" + borrowing.getBookId(), Book.class);

		System.out.println("RESPONSE ::: "+response);
		if (response.getStatusCode() == HttpStatusCode.valueOf(200)) {

			borrowing.setBorrowDate(LocalDate.now());
			borrowingRepository.save(borrowing);
			return "Book Borrowed Successfully!!";
		} else {
		//	ResponseEntity<?> borrow = new Borrowing("");
			return "Book is not available";
		}
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
