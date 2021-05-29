package com.learning.springweb.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class User{
    private Integer id;

    @Size(min=2, message = "Name should have at least 2 characters.")
    private String name;

    @Past
    private Date birthDate;
}
