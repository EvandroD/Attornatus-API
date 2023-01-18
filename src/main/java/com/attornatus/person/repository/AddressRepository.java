package com.attornatus.person.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.attornatus.person.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
    public Optional<Address> findById(Long id);
}
