package com.example.borrowbook.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int quantity;
    private int currentQuantity;
    private String name;
    @OneToMany(mappedBy = "book")
    private List<BorrowedBook> borrowedBookList;

    public Book() {
    }

    public Book(Long id, int quantity, int currentQuantity, String name, List<BorrowedBook> borrowedBookList) {
        this.id = id;
        this.quantity = quantity;
        this.currentQuantity = currentQuantity;
        this.name = name;
        this.borrowedBookList = borrowedBookList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCurrentQuantity() {
        return currentQuantity;
    }

    public void setCurrentQuantity(int currentQuantity) {
        this.currentQuantity = currentQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BorrowedBook> getBorrowedBookList() {
        return borrowedBookList;
    }

    public void setBorrowedBookList(List<BorrowedBook> borrowedBookList) {
        this.borrowedBookList = borrowedBookList;
    }
}
