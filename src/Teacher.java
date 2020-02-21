public class Teacher extends Person {
    private String subject;
    private Section[] sections= new Section[10];
    public Teacher(String name, String subject ){
        super(name);
        this.subject=subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Section[] getSections() {
        return this.sections;
    }

    public void addSection(Section s) {
        this.sections[sectionCount] = s;
        this.sectionCount++;
    }

    public String getSubject() {
        return subject;
    }
    public String toString(){
        String x="";
        for(int i=0;i<this.sectionCount;i++){
                if(i-1==this.sectionCount) {
                    x+=this.sections[i].getName()+" with "+this.sections[i].getCurrentSize()+" students.";
                }else{
                    x+=this.sections[i].getName()+" with "+this.sections[i].getCurrentSize()+" students, ";
                }

        }
        return this.name +" teaches the following sections: "+x;
    }
}
