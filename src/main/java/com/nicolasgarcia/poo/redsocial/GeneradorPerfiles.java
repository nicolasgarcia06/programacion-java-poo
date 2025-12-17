package com.nicolasgarcia.poo.redsocial;

public class GeneradorPerfiles {

	public static PerfilRedSocial crearPerfil(String usuario) {
		PerfilRedSocial p = new PerfilRedSocial();
		p.setNombre(usuario);
		p.setPais("Barcelona");
		p.setBiografia(usuario);
		p.setSeguidores(0);
		return p;
	}

	public static PerfilRedSocial crearPerfilPublicaciones(String usuario, int publicacion) {
		PerfilRedSocial p = crearPerfil(usuario);
		return p;
	}
	public static void main(String []args) {
		PerfilRedSocial p = new PerfilRedSocial();
		p.setNombre("pepe");
		System.out.println(p.getNombre());
	}
}
