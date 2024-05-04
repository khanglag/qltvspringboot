/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.qltvspringboot.controllers.PasswordResetController;

/**
 *
 * @author khang
 */
import com.example.qltvspringboot.Email.EmailService;
import java.security.SecureRandom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PasswordResetController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/reset-password")
    @ResponseBody
    public String resetPassword(@RequestParam String email) {
        // 1. Xác thực email có tồn tại trong hệ thống hay không
        // 2. Nếu email tồn tại, tạo mật khẩu mới và lưu vào cơ sở dữ liệu
        // 3. Gửi email chứa mật khẩu mới đến địa chỉ email được cung cấp
        // 4. Trả về thông báo cho người dùng rằng email đã được gửi

        // Ví dụ: Gửi email chứa mật khẩu mới
        String newPassword = generateNewPassword();
        emailService.sendSimpleMessage(email, "Đặt lại mật khẩu", "Mật khẩu mới của bạn là: " + newPassword);

        return "Một email chứa mật khẩu mới đã được gửi đến địa chỉ email của bạn.";
    }

    private static String generateNewPassword() {
        // Viết mã để tạo mật khẩu mới, ví dụ: random một chuỗi ký 
        int length = 8;

        // Mảng chứa các ký tự có thể xuất hiện trong chuỗi
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        // StringBuilder để xây dựng chuỗi kết quả
        StringBuilder sb = new StringBuilder();

        // SecureRandom object để tạo số ngẫu nhiên
        SecureRandom random = new SecureRandom();

        // Tạo chuỗi ngẫu nhiên bằng cách chọn một ký tự ngẫu nhiên từ mảng characters
        for (int i = 0; i < length; i++) {
            // Chọn một ký tự ngẫu nhiên từ mảng characters và thêm vào chuỗi kết quả
            int randomIndex = random.nextInt(characters.length());
            sb.append(characters.charAt(randomIndex));
        }
        return sb.toString();
    }
    public static void main(final String[] args) {
        System.out.println(generateNewPassword());
    }
}

