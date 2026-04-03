package com.elearning.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "courses")
public class Course {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 private String title;
 private String description;
}