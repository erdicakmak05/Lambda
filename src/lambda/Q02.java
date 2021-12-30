package lambda;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<>(Arrays.asList(5,6,8,9,10));
		
		System.out.println(list.stream().sorted().filter(t->list.indexOf(t)>1).map(t->t*t).reduce(Integer::sum));

	}

}
