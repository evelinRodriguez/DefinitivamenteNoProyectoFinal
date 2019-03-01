package com.example.familia.proyectofinal;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity
public class Ubicacion {
   @PrimaryKey (autoGenerate = true)
    int idUbicacion;

    int salon;

    String sede;

    String edificion;

    public int getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(int idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public int getSalon() {
        return salon;
    }

    public void setSalon(int salon) {
        this.salon = salon;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getEdificion() {
        return edificion;
    }

    public void setEdificion(String edificion) {
        this.edificion = edificion;
    }




}
