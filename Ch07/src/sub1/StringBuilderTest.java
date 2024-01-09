package sub1;

public class StringBuilderTest {
	
	public static void main(String[] args) {
		
		// String 불변성(immutable)
		String str = "Hello";
		System.out.println("str 객체 주소 : " + System.identityHashCode(str));
		
		str += "World";
		System.out.println("str 객체 주소 : " + System.identityHashCode(str));
		
		System.out.println("str : " + str);
		
		// String의 immutalbe 단점을 개선한 StringBuilder
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println("sd 객체 주소 : " + System.identityHashCode(sb));
		
		sb.append("world");
		System.out.println("sd 객체 주소 : " + System.identityHashCode(sb));
		
		System.out.println("sb : " + sb);
		
	}
	
}
