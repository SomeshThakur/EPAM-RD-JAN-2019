import java.util.HashMap;

public class ShapeListService {

    /*
     * This service can be from file or db.
     */
    public HashMap<String, Shape> getList() {
	HashMap<String, Shape> shapesList = new HashMap<>();
	shapesList.put("circle", new Circle());
	shapesList.put("rectangle", new Rectangle());
	shapesList.put("square", new Square());
	return shapesList;
    }
}
