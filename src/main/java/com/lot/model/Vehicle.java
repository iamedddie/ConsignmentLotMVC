package com.lot.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


//@MappedSuperclass

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="Vehicle Type")
@NoArgsConstructor
@Getter
@Setter
public class Vehicle {

    @Id
    @GeneratedValue
    private Long id;
    private String make;

    @ManyToMany
   private List<Owner> owner;

    @Override
    public String toString() {
        return make;
    }
}
