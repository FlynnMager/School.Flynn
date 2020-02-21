class Person {
    private static int nextID=0;
    private int id;
    String name;
    int sectionCount;
    public Person(String name){
        this.id=nextID;
        this.name= name;
        nextID++;
        this.sectionCount=0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
