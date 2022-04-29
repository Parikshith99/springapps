package com.springdemos.springcore.reftypes;

public class Scores {
private double math;
private double physics;
private double chemistry;
public double getChemistry() {
	return chemistry;
}
public void setChemistry(double chemistry) {
	this.chemistry = chemistry;
}
public double getPhysics() {
	return physics;
}
public void setPhysics(double physics) {
	this.physics = physics;
}
public double getMath() {
	return math;
}
public void setMath(double math) {
	this.math = math;
}
@Override
public String toString() {
	return "Scores [math=" + math + ", physics=" + physics + ", chemistry=" + chemistry + "]";
}

}
