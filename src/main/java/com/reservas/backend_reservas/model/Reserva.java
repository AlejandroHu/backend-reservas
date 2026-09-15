package com.reservas.backend_reservas.model;

public class Reserva {
    private String cliente;
    private String servicio;
    private String fecha;
    private String hora;

    // Constructor vacío (necesario para que Spring/Jackson deserialice el JSON)
    public Reserva(){}

    // Constructor con parámetros
    public Reserva(String cliente, String servicio, String fecha, String hora) {
        this.cliente = cliente;
        this.servicio = servicio;
        this.fecha = fecha;
        this.hora = hora;
    }

    // Getters y Setters
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
