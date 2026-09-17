package com.reservas.backend_reservas.controller;

import com.reservas.backend_reservas.model.Reserva;
import com.reservas.backend_reservas.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservas")
@CrossOrigin(origins = "http://localhost:5173") // Permite la comunicación desde React (Vite)
public class ReservaController {

    @Autowired
    private ReservaRepository reservaRepository;

    // POST: Recibe los datos del formulario de React y los guarda de forma permanente en MySQL
    @PostMapping
    public Reserva crearReserva(@RequestBody Reserva reserva){
        Reserva reservaGuardada = reservaRepository.save(reserva);
        System.out.println("Reserva guardada con éxito en la base de datos con ID: " + reservaGuardada.getId());
        return reservaGuardada;
    }

    // GET: Devuelve el listado completo de reservas guardadas en la base de datos
    @GetMapping
    public List<Reserva> obtenerReservas() {
        return reservaRepository.findAll();
    }
}
