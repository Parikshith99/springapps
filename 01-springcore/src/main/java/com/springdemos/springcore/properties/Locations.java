package com.springdemos.springcore.properties;

import java.util.Properties;

public class Locations {
	private Properties dialect;

	public Properties getDialect() {
		return dialect;
	}

	public void setDialect(Properties dialect) {
		this.dialect = dialect;
	}

	@Override
	public String toString() {
		return "Locations [dialect=" + dialect + "]";
	}

}
