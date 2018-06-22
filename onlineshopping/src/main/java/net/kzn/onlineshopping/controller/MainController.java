package net.kzn.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping(value= {"/","/home"})
	public String getName(ModelMap model)
	{
		model.put("title", "home");
		model.put("userClickHome", true);
		return "index";
	}
	
	@RequestMapping(value= "/about")
	public String getAbout(ModelMap model)
	{
		model.put("title", "About");
		model.put("userClickAbout", true);
		return "index";
	}
	
	@RequestMapping(value="/products")
	public String getProducts(ModelMap model)
	{
		model.put("title", "Products");
		model.put("userClickProduct", true);
		return "index";
	}
	
	@RequestMapping(value= "/contact")
	public String getContact(ModelMap model)
	{
		model.put("title", "Contact");
		model.put("userClickContact", true);
		return "index";
	}
}
