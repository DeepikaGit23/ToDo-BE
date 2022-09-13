package com.work.todo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.work.todo.model.Item;

@Repository
public class TodoDaoImpl implements TodoDao{
	
	public static ArrayList<Item> items=new ArrayList<>() {
		{
			add(new Item("Angular",true));
			add(new Item("Spring Boot",true));
			add(new Item("Java",true));
			add(new Item("Jenkins",true));
		}
	};
	@Override
	public List<Item> getItems() {
		// TODO Auto-generated method stub
		return items;
	}

	@Override
	public String updateItem(boolean isCompleted, Item item) {
		// TODO Auto-generated method stub
		for (Item i : items) {
			if(i.getContent()==item.getContent()) {
				i.setIsCompleted(isCompleted);
				
			}
		}
		return "updated status as " + isCompleted +" ..";
	}
	
//	@Override
//	public CustomerDTO getCustomer(Integer customerId) throws InfyBankException {
//		Optional<Customer> optional = customerRepository.findById(customerId);
//		Customer customer = optional.orElseThrow(() -> new InfyBankException("Service.CUSTOMER_NOT_FOUND"));
//		CustomerDTO customer2 = new CustomerDTO();
//		customer2.setCustomerId(customer.getCustomerId());
//		customer2.setDateOfBirth(customer.getDateOfBirth());
//		customer2.setEmailId(customer.getEmailId());
//		customer2.setName(customer.getName());
//		return customer2;
//	}
//	@Override
//	public List<CustomerDTO> getAllCustomers() throws InfyBankException {
//		Iterable<Customer> customers = customerRepository.findAll();
//		List<CustomerDTO> customers2 = new ArrayList<>();
//		customers.forEach(customer -> {
//			CustomerDTO cust = new CustomerDTO();
//			cust.setCustomerId(customer.getCustomerId());
//			cust.setDateOfBirth(customer.getDateOfBirth());
//			cust.setEmailId(customer.getEmailId());
//			cust.setName(customer.getName());
//			customers2.add(cust);
//		});
//		if (customers2.isEmpty())
//			throw new InfyBankException("Service.CUSTOMERS_NOT_FOUND");
//		return customers2;
//	}
//	@Override
//	public Integer addCustomer(CustomerDTO customer) throws InfyBankException {
//		Customer customerEntity = new Customer();
//		customerEntity.setDateOfBirth(customer.getDateOfBirth());
//		customerEntity.setEmailId(customer.getEmailId());
//		customerEntity.setName(customer.getName());
//		customerEntity.setCustomerId(customer.getCustomerId());
//		Customer customerEntity2 = customerRepository.save(customerEntity);
//		return customerEntity2.getCustomerId();
//	}
//	@Override
//	public void updateCustomer(Integer customerId, String emailId) throws InfyBankException {
//		Optional<Customer> customer = customerRepository.findById(customerId);
//		Customer c = customer.orElseThrow(() -> new InfyBankException("Service.CUSTOMER_NOT_FOUND"));
//		c.setEmailId(emailId);
//	}
//	@Override
//	public void deleteCustomer(Integer customerId) throws InfyBankException {
//		Optional<Customer> customer = customerRepository.findById(customerId);
//		customer.orElseThrow(() -> new InfyBankException("Service.CUSTOMER_NOT_FOUND"));
//		customerRepository.deleteById(customerId);
//	}

}
