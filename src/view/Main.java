package view;

import controller.Controller;

public class Main {

	private static Controller controller = new Controller();
	
	
	public static void main(String[] args) throws Exception {
		
		String nameFlorist1 = "Flower Power";
		controller.createFlorist(nameFlorist1);
		controller.addTree(nameFlorist1, 5.85, 25);
		controller.addTree(nameFlorist1, 2.8, 35);
		controller.addTree(nameFlorist1, 2.14, 55);
		
		controller.addFlower(nameFlorist1, "white", 5.0);
		controller.addFlower(nameFlorist1, "black", 3.7);
		controller.addFlower(nameFlorist1, "purple", 2.5);
		
		controller.addDecoration(nameFlorist1, "wood", 65);
		controller.addDecoration(nameFlorist1, "wood", 47.5);
		controller.addDecoration(nameFlorist1, "plastic", 30);
		
		controller.getAllItems(nameFlorist1);
		
	}

}
