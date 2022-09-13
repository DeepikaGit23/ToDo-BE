package com.work.todo.service;

import java.util.List;

import com.work.todo.model.Item;

public interface TodoService {
	
	public List<Item> getItems();

	public String updateItem(boolean isCompleted, Item item);

}
