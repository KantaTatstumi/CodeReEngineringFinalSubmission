package leaky_Encapsulation_Aefore;

import java.util.Vector;

class ToDoList {
    private List<ToDo> list = new ArrayList<>();

    public void add(ToDo t) {
        list.add(t);
    }

    public ToDo getByName(String name) {
        for (ToDo t : list) {
            if (t.getName().equals(name)) {
                return t;
            }
        }

        return null;
    }
}

//Perubahan pada Class ToDoList