package co.micol.lamda;

import java.util.function.BiFunction;

public class LamdaTest {

	public static void main(String[] args) {
		
		//셋중 마지막 Integer는 리턴 타입을 적어준 것임
		BiFunction<Integer, Integer, Integer> f1 = (x, y) -> {  
			if (x > y) {
				return x;
			} else
				return y;
		};
		System.out.println(f1.apply(10, 20));
		
//		MyFunctionInterface f1 = (x, y) -> {
//			if (x > y) {
//				return x;
//			} else
//				return y;
//		};
//		System.out.println(f1.max(10, 20));

	}

}
