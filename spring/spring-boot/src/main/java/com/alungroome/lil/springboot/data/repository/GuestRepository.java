package com.alungroome.lil.springboot.data.repository;

import com.alungroome.lil.springboot.data.entity.Guest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Long> {
}
