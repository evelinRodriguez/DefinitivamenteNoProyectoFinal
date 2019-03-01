package com.example.familia.proyectofinal;
import androidx.room.Dao;
import androidx.room.Insert;
@Dao
public interface DaoClass {
    @Insert

    public void addUbicacion(Ubicacion miUbicacion);
}
