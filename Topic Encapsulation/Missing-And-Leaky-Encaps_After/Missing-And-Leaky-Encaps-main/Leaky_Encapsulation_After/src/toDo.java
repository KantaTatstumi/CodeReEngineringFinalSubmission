package leaky_Encapsulation_Aefore;

class ToDo {
    private String name;

    public ToDo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

//Tidak ada perubahan pada Class toDO