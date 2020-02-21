public class School {
    private String name;
    private Section[] sections= new Section[200];
    private int sectionCount=0;
    public School(String name){
        this.name=name;
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSection(Section s) {
        this.sections[sectionCount] = s;
        this.sectionCount++;
    }
    public Section[] getSections() {
        return this.sections;
    }

    public String toString() {
        return "The school named "+this.name+" has "+this.sectionCount+" sections.";
    }
}
