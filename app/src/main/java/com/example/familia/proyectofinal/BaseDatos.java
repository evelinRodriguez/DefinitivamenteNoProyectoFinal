package com.example.familia.proyectofinal;

import androidx.room.Dao;
import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Ubicacion.class},version = 1)

public abstract class BaseDatos extends RoomDatabase{

    public abstract DaoClass daoUbicacion();
}
