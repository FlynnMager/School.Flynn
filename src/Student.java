public class Student extends Person{
    private int grade;
    private Section[] sections= new Section[10];
    public Student(String name, int grade ){
        super(name);

        this.grade=grade;
    }

    public Section[] getSections() {
        return sections;
    }

    public void addSection(Section s) {
        this.sections[sectionCount] = s;
        this.sectionCount++;
    }

    public int getGrade() {
        return this.grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    public String toString(){
        String x="";
        for(int i=0;i<this.sectionCount;i++){
            if(i-1==this.sectionCount) {
                x+=this.sections[i].getName()+" taught by "+this.sections[i].getTeacher().getName()+" .";
            }else{
                x+=this.sections[i].getName()+" taught by "+this.sections[i].getTeacher().getName()+", ";
            }

        }
        return this.name +" is in "+ this.grade+"th grade and is enrolled in the following sections: "+x;
    }
}


