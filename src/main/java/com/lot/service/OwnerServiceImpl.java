package com.lot.service;

import com.lot.model.Owner;
import com.lot.repository.OwnerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class OwnerServiceImpl implements OwnerService{
    private OwnerRepository repository;
    @Override
    public Owner save(Owner owner) {
        return repository.save(owner);
    }

    @Override
    public Owner findById(Long id) {
        return repository.findById(id).orElseGet(null);
    }
}
