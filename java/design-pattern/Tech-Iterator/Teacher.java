public abstract class Teacher{
    // protected StudentList studentList; // 利用しないことにした
    protected NewStudentList studentList;

    public abstract void createStudentList();
    public abstract void callStudents();
}
