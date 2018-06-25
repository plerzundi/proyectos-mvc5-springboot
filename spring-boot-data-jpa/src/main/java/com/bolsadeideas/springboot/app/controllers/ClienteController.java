package com.bolsadeideas.springboot.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bolsadeideas.springboot.app.models.dao.IClienteDao;

@Controller
public class ClienteController {
	
	@Autowired // busca un componente registrado en el contenedor
	//@Qualifier("clienteDaoJPA") indica el nombre del componente
	private IClienteDao clienteDao;
	
	// hace una lista generica de los clientes
	@RequestMapping(value="/listar",method=RequestMethod.GET)
	public String listar(Model model) {
		model.addAttribute("titulo","Listado de clientes");
		model.addAttribute("clientes", clienteDao.findAll());
		return "listar";
	}

}
