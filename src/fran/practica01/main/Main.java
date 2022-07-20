package fran.practica01.main;
import models.estudiante;

import java.time.LocalDate;


public class Main {
    public static void main(String [] args){
        estudiante fran = new estudiante (221253,
                "fran",
                "Mapastepec",
                LocalDate.of(2002, 3,21),
                'M');

         System.out.println(fran.getEdad());
    }
}
