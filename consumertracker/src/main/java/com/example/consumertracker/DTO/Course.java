package com.example.consumertracker.DTO;

public class Course {
public String id;
public String batch;
public String trainer;
public double fees;

public Course(String id, String batch, String trainer, double fees) {
	super();
	this.id = id;
	this.batch = batch;
	this.trainer = trainer;
	this.fees = fees;
}

public Course() {
	super();
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getBatch() {
	return batch;
}

public void setBatch(String batch) {
	this.batch = batch;
}

public String getTrainer() {
	return trainer;
}

public void setTrainer(String trainer) {
	this.trainer = trainer;
}

public double getFees() {
	return fees;
}

public void setFees(double fees) {
	this.fees = fees;
}

@Override
public String toString() {
	return "Course [id=" + id + ", batch=" + batch + ", trainer=" + trainer + ", fees=" + fees + "]";
}




}
