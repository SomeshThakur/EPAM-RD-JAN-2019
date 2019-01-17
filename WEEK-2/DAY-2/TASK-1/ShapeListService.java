import java.util.ArrayList;
import java.util.List;

/**
 * The Class ShapeListService.
 */
public class ShapeListService {

    /**
     * Gets the list.
     *
     * @return the list
     */
    public List<String> getList() {
	List<String> shapesList = new ArrayList<>();
	shapesList.add("Circle");
	shapesList.add("Rectangle");
	shapesList.add("Square");
	return shapesList;
    }
}
