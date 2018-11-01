package com.newer.pojo;

import java.io.Serializable;

/**
 * @author shining
 */
public class Book implements Serializable{

    private Integer bookId;
    private String title;
    private Double price;
    //private Integer auid;
    private Author author;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

//    public Integer getAuid() {
//        return auid;
//    }
//
//    public void setAuid(Integer auid) {
//        this.auid = auid;
//    }


    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
