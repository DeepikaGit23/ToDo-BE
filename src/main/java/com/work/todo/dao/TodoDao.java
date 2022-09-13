package com.work.todo.dao;

import java.util.List;
import com.work.todo.model.Item;

public interface TodoDao {
	public List<Item> getItems();

	public String updateItem(boolean isCompleted, Item item);
}
