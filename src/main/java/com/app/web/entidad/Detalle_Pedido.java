package com.app.web.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Detalle_Pedido")
public class Detalle_Pedido {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID_Detalle_Pedido;
    @Column(name = "Cantidad ")
    private int Cantidad;
    @Column(name = "SubTotal ")
    private int SubTotal;
    @Column(name = "Pedido ")
    private int  Pedido;
    @Column(name = "Producto ")
    private int Producto;
	public Detalle_Pedido() {
		
	}
	public Detalle_Pedido(Long iD_Detalle_Pedido, int cantidad, int subTotal, int pedido, int producto) {
		super();
		ID_Detalle_Pedido = iD_Detalle_Pedido;
		Cantidad = cantidad;
		SubTotal = subTotal;
		Pedido = pedido;
		Producto = producto;
	}
	public Long getID_Detalle_Pedido() {
		return ID_Detalle_Pedido;
	}
	public void setID_Detalle_Pedido(Long iD_Detalle_Pedido) {
		ID_Detalle_Pedido = iD_Detalle_Pedido;
	}
	public int getCantidad() {
		return Cantidad;
	}
	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}
	public int getSubTotal() {
		return SubTotal;
	}
	public void setSubTotal(int subTotal) {
		SubTotal = subTotal;
	}
	public int getPedido() {
		return Pedido;
	}
	public void setPedido(int pedido) {
		Pedido = pedido;
	}
	public int getProducto() {
		return Producto;
	}
	public void setProducto(int producto) {
		Producto = producto;
	}
	@Override
	public String toString() {
		return "Detalle_Pedido [ID_Detalle_Pedido=" + ID_Detalle_Pedido + ", Cantidad=" + Cantidad + ", SubTotal="
				+ SubTotal + ", Pedido=" + Pedido + ", Producto=" + Producto + "]";
	}
	
	
    
    
    
    
}
