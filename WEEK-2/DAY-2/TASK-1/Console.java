import java.util.List;
import java.util.Scanner;

public class Console {

    public Shape getShape(List<String> shapesList)
	    throws ClassNotFoundException, InstantiationException, IllegalAccessException {

	if (shapesList.isEmpty()) {
	    System.err.println("No shapes are available!");
	}

	Scanner scan = new Scanner(System.in);
	System.out.println("Enter shape Name:");
	for (int index = 0; index < shapesList.size(); index++) {
	    System.out.println((index + 1) + ". " + shapesList.get(index));
	}
	

	int inputShapeIndex = scan.nextInt()-1;
	String shape = shapesList.get(inputShapeIndex);
	if (shape == null)
	    System.err.println("Wrong input");
	scan.close();
	return ShapeFactory.createInstanceOfClass(shape);
    }

    public static void main(String[] args)
	    throws ClassNotFoundException, InstantiationException, IllegalAccessException {
	Console console = new Console();
	ShapeListService sls = new ShapeListService();
	Shape shape = console.getShape(sls.getList());
	if (shape == null)
	    return;
	DrawShape drawShape = new DrawShape();
	drawShape.draw(shape);
    }
}
