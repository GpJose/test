package com.example.testproj.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Book", schema = "public")
public class Book {
    @Id
    @Column(name = "bookID", unique = true, updatable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookId;
    @Column(name = "author", updatable = false, nullable = false)
    private String author;
    @Column(name = "price", nullable = false)
    private Long price;
}
