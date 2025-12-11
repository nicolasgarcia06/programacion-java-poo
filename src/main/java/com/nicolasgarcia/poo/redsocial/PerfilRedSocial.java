package com.nicolasgarcia.poo.redsocial;

import java.util.ArrayList;

public class PerfilRedSocial {
private String usuario;
private String nombre;
private String biografia;
private String pais;
private int seguidores;
private int publicaciones;
private boolean verificada;
private Estado estado;
private ArrayList<String> lista;
public PerfilRedSocial() {
	super();
	// TODO Auto-generated constructor stub
}
public PerfilRedSocial(String usuario, String nombre, String biografia, String pais, int seguidores, int publicaciones,
		boolean verificada, Estado estado) {
	super();
	this.usuario = usuario;
	this.nombre = nombre;
	this.biografia = biografia;
	this.pais = pais;
	this.seguidores = seguidores;
	this.publicaciones = publicaciones;
	this.verificada = verificada;
	this.estado = estado;
}

public String getUsuario() {
	return usuario;
}
public void setUsuario(String usuario) {
	this.usuario = usuario;
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
public int getSeguidores() {
	return seguidores;
}
public void setSeguidores(int seguidores) {
	this.seguidores = seguidores;
}
public int getPublicaciones() {
	return publicaciones;
}
public void setPublicaciones(int publicaciones) {
	this.publicaciones = publicaciones;
}
public boolean isVerificada() {
	return verificada;
}
public void setVerificada(boolean verificada) {
	this.verificada = verificada;
}
public Estado getEstado() {
	return estado;
}
public void setEstado(Estado estado) {
	this.estado = estado;
}
public  void mostrarInformacion() {
	
	System.out.println(this.nombre);
}
public void añadirSeguidores(int seguidores) {
	this.seguidores +=seguidores;
	
	}
public void cambiarEstadoPerfil(Estado estado) {
	this.estado=estado;
}
public boolean activo(boolean verificada) {
	if(this.verificada) {
		System.out.println("no esta activo");
	}
	else {
		System.out.println("esta activo");
	}
	return this.verificada;
}
public static void crearPublicacion(String lista) {
	
}
public static void mostrarPublicaciones() {
	
}
}

