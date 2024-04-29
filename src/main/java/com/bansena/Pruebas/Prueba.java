package com.bansena.Pruebas;

import java.time.LocalDate;

import com.bansena.Entidades.Campana;
import com.bansena.Entidades.CuotaDeManejo;

public class Prueba {

      public static void main(String[] args) {
            
            Campana ca = new Campana("Dia de la madre", 
                              LocalDate.of(2024, 5, 12), 
                              LocalDate.of(2024, 5, 30));
      }

}
