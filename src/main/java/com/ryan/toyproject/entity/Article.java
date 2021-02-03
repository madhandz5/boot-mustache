package com.ryan.toyproject.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Article {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String content;
}
