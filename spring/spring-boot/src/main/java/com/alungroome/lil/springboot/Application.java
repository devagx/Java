package com.alungroome.lil.springboot;

import com.alungroome.lil.springboot.data.entity.Guest;
import com.alungroome.lil.springboot.data.entity.Reservation;
import com.alungroome.lil.springboot.data.entity.Room;
import com.alungroome.lil.springboot.data.repository.GuestRepository;
import com.alungroome.lil.springboot.data.repository.ReservationRepository;
import com.alungroome.lil.springboot.data.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}



}
