package com.nicolasgarcia.poo.redsocial;

import java.time.LocalTime;

public class publicacion {
private String texto;
private LocalTime hora;
     private int likes;

	public publicacion() {
	super();
	// TODO Auto-generated constructor stub
}

	public publicacion(String texto, LocalTime hora, int likes) {
	super();
	this.texto = texto;
	this.hora = LocalTime.now();
	this.likes = likes;
}

	public String getTexto() {
	return texto;
}

public void setTexto(String texto) {
	this.texto = texto;
}

public LocalTime getHora() {
	return hora;
}

public void setHora(LocalTime hora) {
	this.hora = hora;
}

public int getLikes() {
	return likes;
}

public void setLikes(int likes) {
	this.likes = likes;
}
public void mostrar() {
	System.out.println(mostrar.getNombre());
	System.out.println();
	
}
public darMeGusta()
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
