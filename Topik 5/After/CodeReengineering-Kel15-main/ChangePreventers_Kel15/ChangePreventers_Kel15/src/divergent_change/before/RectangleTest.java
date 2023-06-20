package divergent_change.before;

import org.junit.jupiter.api.Test;

class RectangleTest {

	@Test
	void test() {
		Rectangle r = new Rectangle(5, 3);
		FullRectanglePrinter f = new FullRectanglePrinter(r);
		assertEquals(r.area(), 15);
		assertEquals(r.perimeter(), 16);
		
		System.out.println("Border");
		
		f.print();
		System.out.println("full");
		f.print();
	}

	private void assertEquals(int area, int i) {
		// TODO Auto-generated method stub
		
	}

}