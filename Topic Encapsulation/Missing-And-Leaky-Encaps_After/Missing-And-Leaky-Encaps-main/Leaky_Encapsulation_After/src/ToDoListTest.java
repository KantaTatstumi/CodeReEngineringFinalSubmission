package leaky_Encapsulation_Aefore;

import java.util.Vector;

public class ToDoListTest {
	void test() {
	    ToDoList td = new ToDoList();

	    td.add(new ToDo("a"));
	    assert(td.getByName("a") != null);

	    Todo t = new Todo("b");
	    td.add(t);
		assert(td.getByName("b") != null);

	}
}
