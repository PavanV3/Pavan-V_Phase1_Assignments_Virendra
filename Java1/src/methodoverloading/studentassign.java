package methodoverloading;

public class studentassign {
	    String name;
	    int age;
	    char section;
	    char gender;
	    int subject1;
	    int subject2;
	    int subject3;
	    
	    studentassign(String n, int a, char s, char g, int s1, int s2, int s3)
	    {
	        name = n;
	        age = a;
	        section = s;
	        gender = g;
	        subject1 = s1;
	        subject2 = s2;
	        subject3 = s3;
	    }
	    public int marks(){
	        return subject1+subject2+subject3;
	    }
	    public float percentage(){
	        return (marks()*100)/300;
	    }
	    public static void main(String[] args) {
	        studentassign s1 = new studentassign("Rajesh", 20, 'B','M', 97,89,87);
	        studentassign s2 = new studentassign("Mani", 23, 'B','M', 0,96,95);
	        studentassign s3 = new studentassign("Pozhil", 22, 'A','M', 0,89,66);
	        studentassign s4 = new studentassign("Pavan", 23, 'B','M', 79,98,87);
	        
	        System.out.println("Marks of student s1 "+ s1.marks() + " Percentage of student s1 " + s1.percentage());
	        System.out.println("Marks of student s2 "+ s2.marks() + " Percentage of student s2 " + s2.percentage());
	        System.out.println("Marks of student s3 "+ s3.marks() + " Percentage of student s2 " + s3.percentage());
	        System.out.println("Marks of student s4 "+ s4.marks() + " Percentage of student s4 " + s4.percentage());
	    }
}