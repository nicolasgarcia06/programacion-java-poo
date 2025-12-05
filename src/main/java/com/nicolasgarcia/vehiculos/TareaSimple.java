package com.nicolasgarcia.vehiculos;

public class TareaSimple {
	private String nombre;
	boolean encontrada;
	int nota;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TareaSimple(String nombre, int nota, boolean encontrada) {
		super();
		this.nombre = nombre;
		this.encontrada = encontrada;
		this.nota = nota;
	}

	public TareaSimple() {

	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public void mostrarTarea() {

		if (encontrada) {
			System.out.println("La tarea " + nombre + "esta completada");
		} else {
			System.out.println("La tarea" + nombre + "no esta completada");
		}
	}
	public void cambiarEstado() {
		this.encontrada=!encontrada;
	}
}
