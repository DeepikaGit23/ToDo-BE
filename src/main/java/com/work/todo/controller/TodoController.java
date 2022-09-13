package com.work.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.work.todo.model.Item;
import com.work.todo.service.TodoService;

@RestController
@RequestMapping("/todo")
public class TodoController {
	
	@Autowired
	private TodoService todoService;
	
	@GetMapping("/items")
	public ResponseEntity<List<Item>> getItems() {
		List<Item> todoList=todoService.getItems();
		return new ResponseEntity<>(todoList,HttpStatus.OK);
	}

//	@GetMapping(value = "/customers/{customerId}")
//	public ResponseEntity<CustomerDTO> getCustomer(@PathVariable Integer customerId) throws InfyBankException {
//		CustomerDTO customer = customerService.getCustomer(customerId);
//		return new ResponseEntity<>(customer, HttpStatus.OK);
//	}
	
//	@PostMapping(value = "/customers")
//	public ResponseEntity<String> addCustomer(@RequestBody CustomerDTO customer) throws InfyBankException {
//		Integer customerId = customerService.addCustomer(customer);
//		String successMessage = environment.getProperty("API.INSERT_SUCCESS") + customerId;
//		return new ResponseEntity<>(successMessage, HttpStatus.CREATED);
//	}
	
	@PutMapping(value = "/item/{isCompleted}")
	public ResponseEntity<String> updateCustomer(@PathVariable boolean isCompleted, @RequestBody Item item)
	{
		String message=todoService.updateItem(isCompleted, item);
		return new ResponseEntity<>(message, HttpStatus.OK);
	}
	
//	@DeleteMapping(value = "/customers/{customerId}")
//	public ResponseEntity<String> deleteCustomer(@PathVariable Integer customerId) throws InfyBankException {
//		customerService.deleteCustomer(customerId);
//		String successMessage = environment.getProperty("API.DELETE_SUCCESS");
//		return new ResponseEntity<>(successMessage, HttpStatus.OK);
//	}

}
