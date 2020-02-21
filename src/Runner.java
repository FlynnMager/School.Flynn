public class Runner {
    public static void main(String[] args){
        School BHS= new School("Berkeley High School");
        Teacher austera=new Teacher("Austera","Math");
        Teacher albinson=new Teacher("Albinson", "Computer Science");
        Teacher aardal=new Teacher("Aardal","Biology");
        Section bio=new Section("Biology");
        Section compSci= new Section("Computer Science");
        Section math= new Section("Math");
        Student s1=new Student("Flynn", 11);
        Student s2=new Student("Dash", 11);
        Student s3=new Student("Ella", 11);
        Student s4=new Student("Emmet", 11);
        Student s5=new Student("Logan", 11);
        Student s6=new Student("Andrew", 11);

        BHS.addSection(math);
        BHS.addSection(bio);
        BHS.addSection(compSci);

        s2.addSection(bio);
        s3.addSection(bio);
        s5.addSection(bio);
        s6.addSection(bio);
        bio.addStudent(s2);
        bio.addStudent(s3);
        bio.addStudent(s5);
        bio.addStudent(s6);


        s1.addSection(compSci);
        s2.addSection(compSci);
        s4.addSection(compSci);
        s6.addSection(compSci);
        compSci.addStudent(s1);
        compSci.addStudent(s2);
        compSci.addStudent(s4);
        compSci.addStudent(s6);


        s1.addSection(math);
        s3.addSection(math);
        s4.addSection(math);
        s5.addSection(math);
        math.addStudent(s1);
        math.addStudent(s3);
        math.addStudent(s4);
        math.addStudent(s5);

        math.setTeacher(austera);
        compSci.setTeacher(albinson);
        bio.setTeacher(aardal);
        austera.addSection(math);
        albinson.addSection(compSci);
        aardal.addSection(bio);

        System.out.println(BHS.toString());
        System.out.println(albinson.toString());
        System.out.println(austera.toString());
        System.out.println(aardal.toString());
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        System.out.println(s4.toString());
        System.out.println(s5.toString());
        System.out.println(s6.toString());
        System.out.println(math.toString());
        System.out.println(compSci.toString());
        System.out.println(bio.toString());

    }
}
