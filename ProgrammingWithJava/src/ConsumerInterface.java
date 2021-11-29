import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {

	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(1,2,3,4,5);
		
		//Consumer<Integer> c = new ConsImpl();
		
		// This is one way of creating an anonymous class
//		Consumer<Integer> c = new Consumer<Integer>() {
//			
//			public void accept(Integer i) {
//				System.out.println(i);
//			}
//		};
		
		//This is the other way of creating anonymous class
		Consumer<Integer> c = (Integer i) -> {
			System.out.println(i);
		};
		values.forEach(c);
	}

}

// This class is only used once so we can just use anonymous class 
//class ConsImpl implements Consumer<Integer>{
//	
//	public void accept(Integer i) {
//		System.out.println(i);
//	}
//}
