package com.example.app.entities;

public class Beneficiary {
    private final long id;
	private final String name;

	public Beneficiary(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
