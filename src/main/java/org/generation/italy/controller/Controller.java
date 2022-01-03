package org.generation.italy.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping("/")
public class Controller {
	
	@GetMapping("/")
	public String best(Model model) {		
		model.addAttribute("name", "Elia");		
		return "index";		
	}
	
	@GetMapping("/movies")
	public String movies(Model model) {
		List<String> musicList = new ArrayList<String>();
		
		model.addAttribute("movies", Arrays.asList("Harry Potter e la pietra filosofale", "Arancia Meccanica", "Il Signore degli anelli - Le due torri", "Diabolik", "Limitless", "Il Buco"));
		
		return "movies";
		
		
	}
	
	@GetMapping("/songs")
	public String songs(Model model) {
		List<String> songsList = new ArrayList<String>();
		
		model.addAttribute("songs", Arrays.asList("Come Together - The Beatles", "Litty - Meek Mill feat Tory Lanez", "3500 - Travis Scott feat Future feat 2 Chainz", "Roma - Achille Lauro feat Simon P remix by Boss Doms", "VVS & Molly - Thelonious B", "TEE - JAY1 feat Loski"));
		
		return "songs";
		
		
	}
}
