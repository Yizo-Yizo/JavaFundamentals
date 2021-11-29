import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NumberArrangement {

	public static void main(String[] args) {
		
		//Collection<Integer> numbers = Arrays.
		var input = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";
		Printer printer = new Printer();
		
		printer.print(input, new NumberRangeSummarizer() {
			
			public Collection<Integer> collect(String input) {
				
				return SortNGroup.sort(input);
			}
			
			public String summarizeCollection(Collection<Integer> sortedNumbers) {
				
				return SortNGroup.groupNumbers(sortedNumbers);
			}
		});

	}

}

