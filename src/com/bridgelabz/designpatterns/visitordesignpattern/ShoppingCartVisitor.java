package com.bridgelabz.designpatterns.visitordesignpattern;

public interface ShoppingCartVisitor {

	int visit(Book book);
	int visit(Fruit fruit);
}
