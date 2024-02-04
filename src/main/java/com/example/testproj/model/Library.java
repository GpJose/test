package com.example.testproj.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@Table(name = "Library", schema = "public")
@Builder
@AllArgsConstructor
public class Library {
    @Id
    @Column(name = "id",updatable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_Id", updatable = false)
    private User userId;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="book_Id", updatable = false)
    private Book bookId;
}
