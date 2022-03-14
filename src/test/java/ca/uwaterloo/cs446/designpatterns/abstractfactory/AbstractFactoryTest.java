package ca.uwaterloo.cs446.designpatterns.abstractfactory;

import static org.junit.Assert.*;

import org.junit.Test;

public class AbstractFactoryTest {
	@Test
	public void testOSX() {
		testExpectedValues(new OSXFactory(), "Nice looking button", "Cocoa");
	}
	
	@Test
	public void testWindows() {
		testExpectedValues(new WindowsFactory(), "Ugly button", "Qt");
	}
	
	private void testExpectedValues(AbstractFactory factory, String buttonDesc, String menuType) {
		AbstractButton button = factory.createButton();
		AbstractMenuBar menuBar = factory.createMenuBar();
		
		assertEquals(button.getDescription(), buttonDesc);
		assertEquals(menuBar.getType(), menuType);
	}
}
