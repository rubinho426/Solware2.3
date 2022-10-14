package com.app.web.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.web.entidad.Produccion;
import com.app.web.servicio.ProduccionServicio;

@Controller
@RequestMapping(path="/Solware2/home")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST,RequestMethod.PUT})
public class ProduccionControlador {
	@Autowired
	private ProduccionServicio produccionServicio; 
	
	@GetMapping("/InicioP")
	public String InicioP(Model modelo) {
		return "InicioP";
	}
	@GetMapping("/ConsultarPAdmin")

	public String listarproduccion(Model modelo) {
		modelo.addAttribute("Produccion", produccionServicio.listarproduccion());
		return "ConsultarPAdmin";
	}
	
	@GetMapping("/ProducionAdmin")
	public String crearProduccion(Model modelo) {
		Produccion produccion = new Produccion();
		modelo.addAttribute("Produccion", produccion);
		return "ProducionAdmin";
	}
	
	@PostMapping("/ConsultarPAdmin")
	public String guardarProduccion(@ModelAttribute("Produccion") Produccion produccion) {
		produccionServicio.guardarProduccion(produccion);
		return "redirect:/Solware2/home/ConsultarPAdmin";
	}
	@GetMapping("/ConsultarPAdmin/editar/{ID_Produccion}")
	public String Editar(@PathVariable Long ID_Produccion,Model modelo ) {
		modelo.addAttribute("Produccion", produccionServicio.obtenerProduccionPorId(ID_Produccion));
	    return "editar_Produccion";
	}
	
	@PostMapping("/ConsultarPAdmin/{ID_Produccion}")
	public String updateProduccion(@PathVariable Long ID_Produccion, @ModelAttribute("Produccion") Produccion produccion, Model modelo) {
		Produccion produccionExistente = produccionServicio.obtenerProduccionPorId(ID_Produccion);
		produccionExistente.setID_Produccion(ID_Produccion);
		produccionExistente.setOperario(produccion.getOperario());
		produccionExistente.setEstado_Produccion(produccion.getEstado_Produccion());
		produccionExistente.setFecha_Inicio(produccion.getFecha_Inicio());
		produccionExistente.setCantidad(produccion.getCantidad());
		produccionExistente.setFecha_Fin(produccion.getFecha_Fin());
		produccionExistente.setPedido(produccion.getPedido());
		produccionExistente.setID_Inventario(produccion.getID_Inventario());
		
		produccionServicio.updateProduccion(produccionExistente);
		return "redirect:/Solware2/home/ConsultarPAdmin";
	}
	
	@GetMapping("/ConsultarPAdmin/{ID_Produccion}")
	public String deleteProduccion(@PathVariable Long ID_Produccion) {
		
		produccionServicio.delete(ID_Produccion);
		return "redirect:/Solware2/home/ConsultarPAdmin";
		
	}
	
}
