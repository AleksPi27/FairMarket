package com.marketplace.fairmarket.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Document(collection = "customers")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Customer {

    @Id
    private Integer id;

    private String name;

    private String surname;

    private String email;

    private String phoneNumber;

    @DBRef
    private List<Order> orders;

    @DBRef
    private List<Review> productReviews;

    @DBRef
    private List<Review> sellerReviews;

    @DBRef
    private List<Review> shopReviews;
}