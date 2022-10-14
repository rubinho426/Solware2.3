package com.app.web.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Proveedores")
public class Proveedor {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID_Proveedor;
    @Column(name = "Nombre ")
    private String Nombre;
    @Column(name = "Email ")
    private String Email;
    @Column(name = "telefono ")
    private int  telefono;
    @Column(name = "TipoProducto ")
    private String TipoProducto;
    @Column(name = "Producto ")
    private String Producto;
	
    
    public Proveedor() {
		
	}


	public Proveedor(Long iD_Proveedor, String nombre, String email, int telefono, String tipoProducto,
			String producto) {
	
		ID_Proveedor = iD_Proveedor;
		Nombre = nombre;
		Email = email;
		this.telefono = telefono;
		TipoProducto = tipoProducto;
		Producto = producto;
	}


	public Long getID_Proveedor() {
		return ID_Proveedor;
	}


	public void setID_Proveedor(Long iD_Proveedor) {
		ID_Proveedor = iD_Proveedor;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	public String getTipoProducto() {
		return TipoProducto;
	}


	public void setTipoProducto(String tipoProducto) {
		TipoProducto = tipoProducto;
	}


	public String getProducto() {
		return Producto;
	}


	public void setProducto(String producto) {
		Producto = producto;
	}


	@Override
	public String toString() {
		return "Proveedor [ID_Proveedor=" + ID_Proveedor + ", Nombre=" + Nombre + ", Email=" + Email + ", telefono="
				+ telefono + ", TipoProducto=" + TipoProducto + ", Producto=" + Producto + "]";
	}


}
