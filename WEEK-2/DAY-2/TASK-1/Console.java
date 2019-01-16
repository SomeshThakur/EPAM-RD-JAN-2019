import java.util.HashMap;
import java.util.Scanner;

public class Console {

    public Shape getShape(HashMap<String, Shape> shapesList) {

	if (shapesList.isEmpty()) {
	    System.err.println("No shapes are available!");
	}

	Scanner scan = new Scanner(System.in);
	for (String shapeName : shapesList.keySet()) {
	    System.out.println(shapeName);
	}
	System.out.println("Enter shape Name:");

	String inputShapeName = scan.nextLine().trim().toLowerCase();
	Shape shape = shapesList.get(inputShapeName);
	if (shape == null)
	    System.err.println("Wrong input");
	scan.close();
	return shape;
    }

    public static void main(String[] args) {
	Console console = new Console();
	ShapeListService sls = new ShapeListService();
	Shape shape = console.getShape(sls.getList());
	if (shape == null)
	    return;
	DrawShape drawShape = new DrawShape();
	drawShape.draw(shape);
    }
}
