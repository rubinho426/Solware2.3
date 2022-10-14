package com.app.web.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Pedidos")
public class Pedido {
	
	

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID_Pedido;
    @Column(name = "Fecha_Pedido ")
    private String Fecha_Pedido;
    @Column(name = "Total ")
    private int Total;
    @Column(name = "ID_Cliente ")
    private int  ID_Cliente;
	public Pedido() {
	
	}
	public Pedido(Long iD_Pedido, String fecha_Pedido, int total, int iD_Cliente) {
		
		ID_Pedido = iD_Pedido;
		Fecha_Pedido = fecha_Pedido;
		Total = total;
		ID_Cliente = iD_Cliente;
	}
	public Long getID_Pedido() {
		return ID_Pedido;
	}
	public void setID_Pedido(Long iD_Pedido) {
		ID_Pedido = iD_Pedido;
	}
	public String getFecha_Pedido() {
		return Fecha_Pedido;
	}
	public void setFecha_Pedido(String fecha_Pedido) {
		Fecha_Pedido = fecha_Pedido;
	}
	public int getTotal() {
		return Total;
	}
	public void setTotal(int total) {
		Total = total;
	}
	public int getID_Cliente() {
		return ID_Cliente;
	}
	public void setID_Cliente(int iD_Cliente) {
		ID_Cliente = iD_Cliente;
	}
	@Override
	public String toString() {
		return "Pedidos [ID_Pedido=" + ID_Pedido + ", Fecha_Pedido=" + Fecha_Pedido + ", Total=" + Total
				+ ", ID_Cliente=" + ID_Cliente + "]";
	}
	
	
	
	
    
    
    
    
	
	

}
