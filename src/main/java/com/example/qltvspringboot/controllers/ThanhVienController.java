// package com.example.qltvspringboot.controllers;

// import com.example.qltvspringboot.entity.ThanhVien;
// import com.example.qltvspringboot.service.ThanhVienService;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import java.util.List;

// @RestController
// @RequestMapping("/thanhvien")
// public class ThanhVienController {

//     private final ThanhVienService thanhVienService;

//     @Autowired
//     public ThanhVienController(ThanhVienService thanhVienService) {
//         this.thanhVienService = thanhVienService;
//     }

//     @GetMapping
//     public List<ThanhVien> getAllThanhViens() {
//         return thanhVienService.getAll();
//     }
// }
