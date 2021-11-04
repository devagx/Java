package com.alungroome.lil.springboot.data.repository;

import com.alungroome.lil.springboot.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
}
