package ca.mcgill.ecse321.designpatterns.abstractfactory;

public class WindowsMenuBar implements AbstractMenuBar {
	@Override
	public String getType() {
		return "Qt";
	}
}
