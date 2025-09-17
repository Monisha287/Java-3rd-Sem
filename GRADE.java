public class GRADE {
 public static void main(String[] args) {
     int marks=85;
     String grade=(marks>=90)?"A":(marks>=80)?"B":(marks>=70)?"C":(marks>=60)?"D":"F";
     System.out.println("Grade:"+grade);
 }
}
