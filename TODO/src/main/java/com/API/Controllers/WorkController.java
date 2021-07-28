package com.API.Controllers;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.API.Models.Works;
import com.API.Services.WorkService;

@RestController
public class WorkController {
	
	@Autowired
	private WorkService service;
	
	
	@GetMapping("/works")
	public Page<Works> listAll(Optional<String> sortBy, Optional<Integer> page) { 
		return service.listAll(sortBy, page);
	}		
	
	@GetMapping("/works/{id}")
	public ResponseEntity<Works> getById(@PathVariable Integer id) {
		try {
			Works work = service.getById(id);
			return new ResponseEntity<Works>(work, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Works>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/works")
	public void add(@RequestBody Works work) {
		service.save(work);
	}
	
	@PutMapping("works/{id}")
	public ResponseEntity<Works> update(@RequestBody Works work, @PathVariable Integer id) {
		try {
			Works workUpd = service.getById(id);
			service.save(workUpd);
			return new ResponseEntity<Works>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Works>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/works/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
	
	
//	http://localhost:8080/works?sortBy=status&page=1
	
}
