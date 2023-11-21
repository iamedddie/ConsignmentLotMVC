package com.lot.service;


import com.lot.model.Owner;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


public interface OwnerService {

    Owner save (Owner owner);
}
