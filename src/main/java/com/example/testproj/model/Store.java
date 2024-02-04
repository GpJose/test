package com.example.testproj.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor
@Data
@Table(name = "Store", schema = "public")
@Builder
@AllArgsConstructor
public class Store {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="book_Id", updatable = false)
    private Book bookId;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_Id", updatable = false)
    private User userId;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "library_Id")
    private Library libraryId;
    @Column(name = "payed", columnDefinition = "Boolean default false")
    private boolean payed;
    @Column(name = "payed_Date")
    private Date payedDate;
}
