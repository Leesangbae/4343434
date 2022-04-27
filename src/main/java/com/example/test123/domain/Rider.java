package com.example.test123.domain;

import lombok.NoArgsConstructor;
import org.hibernate.annotations.NaturalIdCache;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@Entity
public class Rider {
    @Id
    private Long id;
}
