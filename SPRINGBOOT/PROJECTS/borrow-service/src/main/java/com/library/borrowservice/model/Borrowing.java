package com.library.borrowservice.model;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
@Entity
public class Borrowing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private Long bookId;
	/*
	 * @JsonDeserialize(using = LocalDateTimeDeserializer.class)
	 * 
	 * @JsonSerialize(using = LocalDateTimeSerializer.class)
	 */
    @JsonFormat(pattern = "dd-MM-yyyy", shape = JsonFormat.Shape.STRING) 
    private LocalDate borrowDate;
    @JsonFormat(pattern = "dd-MM-yyyy", shape = JsonFormat.Shape.STRING) 
    private LocalDate returnDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	public LocalDate getBorrowDate() {
		return borrowDate;
	}
	public void setBorrowDate(LocalDate borrowDate) {
		//this.borrowDate = borrowDateStr == null ? null : LocalDate.parse(borrowDateStr, df);
		this.borrowDate=borrowDate;
	}
	public LocalDate getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}
    
    // Getters and Setters
    
}
