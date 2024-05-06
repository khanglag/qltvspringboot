package com.example.qltvspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.example.qltvspringboot.entity.ThanhVien;

@SpringBootApplication
@ComponentScan("com.example.qltvspringboot.repository")
public class QltvspringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(QltvspringbootApplication.class, args);
	}

	@Bean(name = "THANHVIEN_BEAN")
	public ThanhVien setthanhvien() {
		ThanhVien thanhvien = new ThanhVien();
		thanhvien.setMaTV(123456);
		thanhvien.setPassword("pass");
		return thanhvien;
	}

}
