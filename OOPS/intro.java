package OOPS;

 class intro {
    public static void main (String[] args) {
        //for five students
        //Store rollno , name , marks of student in single data type;
        //Student[] students = new Student[5];   //class

        Student vivek;   //vivek is declaring reference to  object
        vivek= new Student() ;
        vivek.rno = 69;
        vivek.name = "rao";

       // vivek.marks = 99.99f;

        System.out.println(vivek.rno);
        System.out.println(vivek.name);
        System.out.println(vivek.marks);



        Student kunal = new Student( 12 , "kushwaha" , 90.2f);
        System.out.println(kunal.marks);
        System.out.println(kunal.name);
        System.out.println(kunal.rno);


        Student random = new Student(kunal);

        kunal.gret();
        vivek.changename("nectar");
        vivek.gret();

        System.out.println(random.name);
    }
}



 class Student{
    int rno;          //rno is called instance variable
    String name;
    float marks;

    void gret(){
        System.out.println("nameste " + this.name);
    }

    void changename(String newname){
        name = newname;
    }
    //add properties object by object
    //we need one word to access every object 'this'
   /* Student(){
       this.rno = 12;
       this.marks = 90.2f;
       this.name = "kushwaha";

    }
    */
    // the above one can also be written as below
    Student(){
        this(12 , "khushwaha" , 90.2f  );
    }


    Student(int rno , String name , float marks){
        this.rno = rno;
        this.name = name ;
        this.marks = marks;
    }


    Student(Student other){
        this.rno = other.rno;
        this.marks = other.marks;
        this.name = other.name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(" object is distroyed");
    }
}