import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Details {
	String Author();

	String AuthorId();

	String DateOfCreation();

	String Version();
}