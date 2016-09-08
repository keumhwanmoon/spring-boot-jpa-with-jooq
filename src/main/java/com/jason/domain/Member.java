package com.jason.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author jason, Moon
 * @since 2016. 9. 8.
 */

@Data
@Entity
public class Member {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
