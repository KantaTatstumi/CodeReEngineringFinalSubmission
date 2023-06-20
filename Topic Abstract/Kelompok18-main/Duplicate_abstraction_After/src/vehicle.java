
abstract class kendaraan{
	abstract void model();
	abstract void color();
	public void stock() {
		System.out.println("available");
	}
	abstract void cylinderCapacity();
}

// abstract class motorcycle{
// 	abstract void model();
// 	abstract void color();
// 	public void stock() {
// 		System.out.println("available");
// 	}
// 	abstract void cylinderCapacity();
// }

class mercedes extends kendaraan{
	public void model() {
		System.out.println("e320");
	}
	public void color() {
		System.out.println("silver");
	}
	public void cylinderCapacity(){
		System.out.println("6700cc");
	}

}

class ducati extends kendaraan{
	public void model() {
		System.out.println("v4S");
	}
	public void color() {
		System.out.println("red");
	}
	public void cylinderCapacity() {
		System.out.println("1103cc");
	}
}