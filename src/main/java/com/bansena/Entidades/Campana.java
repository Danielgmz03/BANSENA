package com.bansena.Entidades;

import java.time.LocalDate;

public class Campana extends Habilitantes {

      String nombre;
      LocalDate fechaInicio;
      LocalDate fechaFin;

      public Campana(String nombre, LocalDate fechaInicio, LocalDate fechaFin) {
            this.nombre = nombre;
            this.fechaInicio = fechaInicio;
            this.fechaFin = fechaFin;
      }
      public String getNombre() {
            return nombre;
      }
      public void setNombre(String nombre) {
            this.nombre = nombre;
      }
      public LocalDate getFechaInicio() {
            return fechaInicio;
      }
      public void setFechaInicio(LocalDate fechaInicio) {
            this.fechaInicio = fechaInicio;
      }
      public LocalDate getFechaFin() {
            return fechaFin;
      }
      public void setFechaFin(LocalDate fechaFin) {
            this.fechaFin = fechaFin;
      }
      
      

}
