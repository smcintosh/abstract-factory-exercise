package org.mcgill.ecse321.designpatterns.abstractfactory;

public class WindowsFactory implements AbstractFactory {

	@Override
	public AbstractButton createButton() {
		return new WindowsButton();
	}

	@Override
	public AbstractMenuBar createMenuBar() {
		return new WindowsMenuBar();
	}
}