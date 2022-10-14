package com.app.web.entidad;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Produccion")
public class Produccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID_Produccion;
    @Column(name = "Operario")
    private int Operario;
    @Column(name = "Estado_Produccion")
    private int Estado_Produccion;
    @Column(name = "Fecha_Inicio")
    private String Fecha_Inicio;
    @Column(name = "Cantidad")
    private int Cantidad;
    @Column(name = "Fecha_Fin")
    private String Fecha_Fin;
    @Column(name = "Pedido")
    private int Pedido;
    @Column(name = "ID_Inventario")
    private int ID_Inventario;
	public Produccion() {
		super();
	}
	public Produccion(Long iD_Produccion, int operario, int estado_Produccion, String fecha_Inicio, int cantidad,
			String fecha_Fin, int pedido, int iD_Inventario) {
		super();
		ID_Produccion = iD_Produccion;
		Operario = operario;
		Estado_Produccion = estado_Produccion;
		Fecha_Inicio = fecha_Inicio;
		Cantidad = cantidad;
		Fecha_Fin = fecha_Fin;
		Pedido = pedido;
		ID_Inventario = iD_Inventario;
	}
	
	public Long getID_Produccion() {
		return ID_Produccion;
	}
	public void setID_Produccion(Long iD_Produccion) {
		ID_Produccion = iD_Produccion;
	}
	public int getOperario() {
		return Operario;
	}
	public void setOperario(int operario) {
		Operario = operario;
	}
	public int getEstado_Produccion() {
		return Estado_Produccion;
	}
	public void setEstado_Produccion(int estado_Produccion) {
		Estado_Produccion = estado_Produccion;
	}
	public String getFecha_Inicio() {
		return Fecha_Inicio;
	}
	public void setFecha_Inicio(String fecha_Inicio) {
		Fecha_Inicio = fecha_Inicio;
	}
	public int getCantidad() {
		return Cantidad;
	}
	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}
	public String getFecha_Fin() {
		return Fecha_Fin;
	}
	public void setFecha_Fin(String fecha_Fin) {
		Fecha_Fin = fecha_Fin;
	}
	public int getPedido() {
		return Pedido;
	}
	public void setPedido(int pedido) {
		Pedido = pedido;
	}
	public int getID_Inventario() {
		return ID_Inventario;
	}
	public void setID_Inventario(int iD_Inventario) {
		ID_Inventario = iD_Inventario;
	}
	@Override
	public String toString() {
		return "Produccion [ID_Produccion=" + ID_Produccion + ", Operario=" + Operario + ", Estado_Produccion="
				+ Estado_Produccion + ", Fecha_Inicio=" + Fecha_Inicio + ", Cantidad=" + Cantidad + ", Fecha_Fin="
				+ Fecha_Fin + ", Pedido=" + Pedido + ", ID_Inventario=" + ID_Inventario + "]";
	}
    
}