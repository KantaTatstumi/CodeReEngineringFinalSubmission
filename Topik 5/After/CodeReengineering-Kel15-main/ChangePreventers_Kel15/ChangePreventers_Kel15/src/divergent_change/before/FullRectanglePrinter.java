package divergent_change.before;

public class FullRectanglePrinter extends RectanglePrinter {

	public FullRectanglePrinter(Rectangle r) {
		super(r);
	}

	@Override
	public void print() {

		int height = r.getHeight();
		int width = r.getWidth();

		int i;

		for( i = 0; i < height; i++) {  //print rectangle border
			for( i = 0; i < height; i++) {
				for(int j = 0; j < width; j++) {
					System.out.print("*");
				}
			}

			for(int j = 0; j < width; j++) {
				System.out.print(
					j == 0 || j == width-1 || i == 0 || i == height-1 ? "*" : " ");
				}
				System.out.println("");
		}
	}
}