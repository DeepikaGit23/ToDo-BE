package com.work.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.work.todo.dao.TodoDao;
import com.work.todo.model.Item;

@Service
public class TodoServiceImpl implements TodoService {

	@Autowired
	private TodoDao todoRepository;
	
	@Override
	public List<Item> getItems() {
		// TODO Auto-generated method stub
		return todoRepository.getItems();
	}

	@Override
	public String updateItem(boolean isCompleted, Item item) {
		// TODO Auto-generated method stub
		return todoRepository.updateItem(isCompleted,item);
	}

}
