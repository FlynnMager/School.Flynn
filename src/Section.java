public class Section {
    private Teacher teacher;
    private Student[] students= new Student[50];
    private String name;
    private int currentSize=0;
    public Section(String name){
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student s){
     this.students[currentSize]=s;
     this.currentSize++;
    }

    public Student[] getStudents() {
        return this.students;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public Teacher getTeacher() {
        return this.teacher;
    }
    public String toString() {
        String x="";
        for(int i=0;i<this.currentSize;i++){
            if(i-1==this.currentSize) {
                x+= this.students[i].name;
            }else{
                x += this.students[i].name + ", ";
            }
        }
        return this.name +" is taught by "+this.teacher.name+" and has "+this.currentSize+" students: "+x;
    }
}
