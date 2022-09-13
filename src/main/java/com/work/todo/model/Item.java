package com.work.todo.model;

public class Item {
	private String content;
	private boolean isCompleted;
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public boolean getIsCompleted() {
		return isCompleted;
	}
	public void setIsCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	public Item(String content, boolean isCompleted) {
		super();
		this.content = content;
		this.isCompleted = isCompleted;
	}

}
