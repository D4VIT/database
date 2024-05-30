package com.example.database;

import com.example.database.models.Student;

public class Main
{
    public static void main(String[] args) {
        DatabaseManager dbManager = new DatabaseManager();
        dbManager.connect();

        // Crear un nou estudiant
        Llibre llibre = new llibre(1, "Joan", "Garcia");
        dbManager.addLlibre(llibre);

        // Recuperar estudiant
        Llibre retrievedLlibre = dbManager.getStudent(1);
        System.out.println(retrievedLlibre);

        // Actualiztzar estudiant
        student.setLastName("Martinez");
        dbManager.updateStudent(student);

        // Eliminar estudiant
        dbManager.deleteStudent(1);

        dbManager.disconnect();
    }
}