package Assignment2;

class Student implements Comparable<Student> {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("%s \t %s\n", id, name);
    }

    @Override
    public int compareTo(Student o) {
        if (id > o.getId())
            return 1;
        else if (id < o.getId())
            return -1;
        return 0;
    }
}