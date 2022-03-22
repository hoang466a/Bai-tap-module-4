package com.example.test.model;

import javax.persistence.*;

@Entity
public class Blog {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String note;
    private Long time;
    private String category;

    @ManyToOne
    @JoinColumn(name="category_id",referencedColumnName = "id")
    private Category categoryOb;

    public Blog() {
    }

    public Category getCategoryOb(){
        return categoryOb;
    }

    public void setCategoryOb(Category category){
        this.categoryOb=category;
    }

    public Blog(Integer id, String name, String note, Long time, String category) {
        this.id = id;
        this.name = name;
        this.note = note;
        this.time=time;
        this.category=category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
