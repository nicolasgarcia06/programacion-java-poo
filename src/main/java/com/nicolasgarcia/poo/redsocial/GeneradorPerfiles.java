package com.nicolasgarcia.poo.redsocial;

public class GeneradorPerfiles {
private String nombre;
private String biografia;
private String pais;
public GeneradorPerfiles() {
	super();
	// TODO Auto-generated constructor stub
}
public GeneradorPerfiles(String nombre, String biografia, String pais) {
	super();
	this.nombre = nombre;
	this.biografia = biografia;
	this.pais = pais;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getBiografia() {
	return biografia;
}
public void setBiografia(String biografia) {
	this.biografia = biografia;
}
public String getPais() {
	return pais;
}
public void setPais(String pais) {
	this.pais = pais;
}
public static String crearPerfil(String usuario)
}
