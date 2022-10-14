package com.app.web.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Insumos")

public class Insumo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID_Insumo;
    @Column(name="Nombre_Material")
    private String Nombre_Material;
    @Column(name="EstadoInsumo")
    private int EstadoInsumo;
	public Insumo() {
		super();
	}
	public Insumo(Long iD_Insumo, String nombre_Material, int estadoInsumo) {
		super();
		ID_Insumo = iD_Insumo;
		Nombre_Material = nombre_Material;
		EstadoInsumo = estadoInsumo;
	}
	public long getID_Insumo() {
		return ID_Insumo;
	}
	public void setID_Insumo(Long iD_Insumo) {
		ID_Insumo = iD_Insumo;
	}
	public String getNombre_Material() {
		return Nombre_Material;
	}
	public void setNombre_Material(String nombre_Material) {
		Nombre_Material = nombre_Material;
	}
	public int getEstadoInsumo() {
		return EstadoInsumo;
	}
	public void setEstadoInsumo(int estadoInsumo) {
		EstadoInsumo = estadoInsumo;
	}
	@Override
	public String toString() {
		return "Insumo [ID_Insumo=" + ID_Insumo + ", Nombre_Material=" + Nombre_Material + ", EstadoInsumo="
				+ EstadoInsumo + "]";
	}
    
}