package com.bridgelabz.designpatterns.adapterdesignpattern;

public class Socket {
	public Volt getVolt() {
		return new Volt(120);
	}
}
