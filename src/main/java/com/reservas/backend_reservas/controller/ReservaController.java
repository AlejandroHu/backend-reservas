package com.reservas.backend_reservas.controller;

import com.reservas.backend_reservas.model.Reserva;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reservas")
@CrossOrigin(origins = "http://localhost:5174") // Permite la comunicación desde React (Vite)
public class ReservaController {
    @PostMapping
    public String crearReserva(@RequestBody Reserva reserva){
        System.out.println("--- NUEVA RESERVA RECIBIDA DESDE REACT ---");
        System.out.println("Cliente: " + reserva.getCliente());
        System.out.println("Servicio: " + reserva.getServicio());
        System.out.println("Fecha: " + reserva.getFecha());
        System.out.println("Hora: " + reserva.getHora());
        System.out.println("------------------------------------------");

        return "Reserva recibida correctamente en Spring Boot para " + reserva.getCliente();
    }
}
