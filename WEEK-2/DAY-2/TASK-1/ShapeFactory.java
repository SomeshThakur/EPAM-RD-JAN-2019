
public class ShapeFactory {
   static Shape createInstanceOfClass(String className)
	    throws ClassNotFoundException, InstantiationException, IllegalAccessException {
	Class<?> classTemp = Class.forName(className);
	Shape obj = (Shape) classTemp.newInstance();
	return obj;
    }
}
