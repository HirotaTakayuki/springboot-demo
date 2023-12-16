package com.example.demo.domain;

import lombok.Data;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Data
@Entity
@Table(name = "users")
public class User implements Serializable {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private Integer id;
  private String firstName;
  private String lastName;
}