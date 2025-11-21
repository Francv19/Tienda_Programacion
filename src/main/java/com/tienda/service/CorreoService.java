package com.tienda.service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class CorreoService {

    private final JavaMailSender mailSender;

    public CorreoService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void enviarCorreoHtml(String para,
<<<<<<< HEAD
                                 String asunto,
                                 String contenido) throws MessagingException {
=======
            String asunto,
            String contenido) throws MessagingException {
>>>>>>> 41d628433a12caa4fb2d2c1112476f387bc8efdc

        MimeMessage mensaje = mailSender.createMimeMessage();
        MimeMessageHelper correo = new MimeMessageHelper(mensaje, true);

        correo.setTo(para);
        correo.setSubject(asunto);
        correo.setText(contenido, true);
        mailSender.send(mensaje);
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 41d628433a12caa4fb2d2c1112476f387bc8efdc
