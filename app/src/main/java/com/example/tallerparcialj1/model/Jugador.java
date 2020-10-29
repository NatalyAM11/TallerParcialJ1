package com.example.tallerparcialj1.model;

public class Jugador {

        public String type="Jugador";
        public String personaje;
        public int vidas;


        public Jugador (String personaje, int vidas){
            this.personaje=personaje;
            this.vidas=vidas;

        }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
}
