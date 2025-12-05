package com.nicolasgarcia.vehiculos;

public class MainTareasSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TareaSimple objeto1= new TareaSimple();
objeto1.setNombre("nuevo titulo");
System.out.println(objeto1.getNombre());

TareaSimple objeto2= new TareaSimple("Otra tarea",5,true);
System.out.println(objeto2.getNombre());




	}
	

}
