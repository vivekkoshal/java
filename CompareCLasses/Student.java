package CompareCLasses;

public class Student implements Comparable<Student> {
    int rollno ;
    float marks ;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }


    @Override
    public int compareTo(Student o) {
        System.out.println("running compare to method");
        int diff = (int)(this.marks - o.marks);
        //if diff == 0: means boath have equal marks
        //if diff< 0 : means o is bigger else o is smaller
        return diff;
    }

    @Override
    public String toString() {
        return marks+" ";
    }
}
