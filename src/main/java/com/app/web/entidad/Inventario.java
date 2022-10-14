package com.app.web.entidad;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table (name="Inventario")

public class Inventario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID_Inventario;
    @Column(name="Insumo")
    private int Insumo;
    @Column(name="Movimiento")
    private int Movimiento;
    @Column(name="Entrada")
    private int Entrada;
    @Column(name="Salida")
    private int Salida;
    @Column(name="Disponible")
    private int Disponible;
    @Column(name="Fecha")
    private String Fecha;
	public Inventario() {
		super();
	}
	public Inventario(Long iD_Inventario, int insumo, int movimiento, int entrada, int salida, int disponible,
			String fecha) {
		super();
		ID_Inventario = iD_Inventario;
		Insumo = insumo;
		Movimiento = movimiento;
		Entrada = entrada;
		Salida = salida;
		Disponible = disponible;
		Fecha = fecha;
	}
	public Long getID_Inventario() {
		return ID_Inventario;
	}
	public void setID_Inventario(Long iD_Inventario) {
		ID_Inventario = iD_Inventario;
	}
	public int getInsumo() {
		return Insumo;
	}
	public void setInsumo(int insumo) {
		Insumo = insumo;
	}
	public int getMovimiento() {
		return Movimiento;
	}
	public void setMovimiento(int movimiento) {
		Movimiento = movimiento;
	}
	public int getEntrada() {
		return Entrada;
	}
	public void setEntrada(int entrada) {
		Entrada = entrada;
	}
	public int getSalida() {
		return Salida;
	}
	public void setSalida(int salida) {
		Salida = salida;
	}
	public int getDisponible() {
		return Disponible;
	}
	public void setDisponible(int disponible) {
		Disponible = disponible;
	}
	public String getFecha() {
		return Fecha;
	}
	public void setFecha(String fecha) {
		Fecha = fecha;
	}
	@Override
	public String toString() {
		return "Inventario [ID_Inventario=" + ID_Inventario + ", Insumo=" + Insumo + ", Movimiento=" + Movimiento
				+ ", Entrada=" + Entrada + ", Salida=" + Salida + ", Disponible=" + Disponible + ", Fecha=" + Fecha
				+ "]";
	}
    
}