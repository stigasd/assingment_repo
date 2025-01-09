package stringmethod;

public class Stringinsert {

	public static void main(String[] args) {

		StringBuffer s = new StringBuffer("hello");
		s.insert(5, "world");

		System.out.println(s);

	}

}
