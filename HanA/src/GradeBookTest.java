public class GradeBookTest {
    public  static  void main(String[] args){
        final int NUMBER_OF_STUDENTS=3;
        student[] students= new student[NUMBER_OF_STUDENTS];
        students[0]= new student("a111223002", "林瑀恩");
        students[1]= new student("a111223000", "黃曉明");
        students[2]= new student("a111223001", "黃大銘");
        GradeBook gradeBook= new GradeBook("Java程式設計", students, NUMBER_OF_STUDENTS);
        gradeBook.processStudentsGrades();
        gradeBook.displayGradeReport();
    }
}
