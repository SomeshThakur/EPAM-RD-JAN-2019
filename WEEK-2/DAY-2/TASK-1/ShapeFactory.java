
/**
 * A factory for creating Shape objects.
 */
public class ShapeFactory {

    /**
     * Creates a new Shape object.
     *
     * @param className the class name
     * @return the shape
     * @throws ClassNotFoundException the class not found exception
     * @throws InstantiationException the instantiation exception
     * @throws IllegalAccessException the illegal access exception
     */
    static Shape createInstanceOfClass(String className)
	    throws ClassNotFoundException, InstantiationException, IllegalAccessException {
	Class<?> classTemp = Class.forName(className);
	Shape obj = (Shape) classTemp.newInstance();
	return obj;
    }
}
