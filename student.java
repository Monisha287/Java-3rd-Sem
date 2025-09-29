public class student {
    String name;
    int age;
    String college;
    student(String n,int a,String c){
        name=n;
        age=a;
        college=c;
    }
    void display(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("college:"+college);
    }
    public static void main(String[] args){
        student s1=new student("Alice",20,"XYZ University");
        student s2=new student("Bob",22,"ABC College");
        s1.display();
        s2.display();
    }
    
}
