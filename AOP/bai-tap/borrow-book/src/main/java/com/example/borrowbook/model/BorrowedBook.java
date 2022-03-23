package com.example.borrowbook.model;

import javax.persistence.*;

@Entity
public class BorrowedBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String borrowedNumber;
    @ManyToOne
    @JoinColumn(name="book_id",referencedColumnName = "id")
    private Book book;
    @ManyToOne
    @JoinColumn(name="customer_id",referencedColumnName = "id")
    private Customer customer;

}
