package ca.mcgill.ecse321.designpatterns.abstractfactory;

public interface AbstractFactory {
	public AbstractButton createButton();
	public AbstractMenuBar createMenuBar();
}
