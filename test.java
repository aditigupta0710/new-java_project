class student {
    String name;    
}
public class student {
    public static void change(student s) {
        s.name = "Aditi" ;
    }
    public static void main(String[] args) {
        student stu = new student();
        stu.name = "choti";
        change(stu);
        System.out.println(stu.name); 
    }
}
