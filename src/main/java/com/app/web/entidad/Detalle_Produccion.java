package com.app.web.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Detalle_Produccion")
	public class Detalle_Produccion {
		
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long ID_Detalle_Produccion;
	    @Column(name = "Insumo")
	    private int Insumo;
	    @Column(name = "Produccion")
	    private int Produccion;
	    @Column(name = "Cantidad")
	    private String Cantidad;
		public Detalle_Produccion() {
			super();
		}
		public Detalle_Produccion(Long iD_Detalle_Produccion, int insumo, int produccion, String cantidad) {
			super();
			ID_Detalle_Produccion = iD_Detalle_Produccion;
			Insumo = insumo;
			Produccion = produccion;
			Cantidad = cantidad;
		}
		public long getID_Detalle_Produccion() {
			return ID_Detalle_Produccion;
		}
		public void setID_Detalle_Produccion(Long iD_Detalle_Produccion) {
			ID_Detalle_Produccion = iD_Detalle_Produccion;
		}
		public int getInsumo() {
			return Insumo;
		}
		public void setInsumo(int insumo) {
			Insumo = insumo;
		}
		public int getProduccion() {
			return Produccion;
		}
		public void setProduccion(int produccion) {
			Produccion = produccion;
		}
		public String getCantidad() {
			return Cantidad;
		}
		public void setCantidad(String cantidad) {
			Cantidad = cantidad;
		}
		@Override
		public String toString() {
			return "Detalle_Produccion [ID_Detalle_Produccion=" + ID_Detalle_Produccion + ", Insumo=" + Insumo
					+ ", Produccion=" + Produccion + ", Cantidad=" + Cantidad + "]";
		}
	    
	    
}

