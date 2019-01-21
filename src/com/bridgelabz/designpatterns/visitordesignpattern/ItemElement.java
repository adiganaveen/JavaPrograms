package com.bridgelabz.designpatterns.visitordesignpattern;

public interface ItemElement {
	public int accept(ShoppingCartVisitor visitor);
}
