import java.util.ArrayList;
import java.util.List;

public class ShapeListService {

    /*
     * This service can be from file or db.
     */
    public List<String> getList() {
	List<String> shapesList = new ArrayList<>();
	shapesList.add("Circle");
	shapesList.add("Rectangle");
	shapesList.add("Square");
	return shapesList;
    }
}
