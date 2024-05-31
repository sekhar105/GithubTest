package Java8;

import java.util.function.Function;

public class Test {
	
	
public static void main(String[] args) {
	Function<String, String> impl=t->t==null?"enter a valid value":t;
	
	Function<String, String>  functionstring =(t)->{
		return t.toUpperCase();
		
	};
String apply = impl.andThen(functionstring).apply(null);	
	System.out.println(apply);
}
}
