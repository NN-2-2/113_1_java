import java.util.Scanner;

public class GradeBook {
    private String courseName;
    private student[] students;
    private  double[] grades;
    private  int numberOFStudents;

    public GradeBook(String courseName, student[] students, int numberOFStudents) {
        this.courseName = courseName;
        this.students=students;
        this.numberOFStudents=numberOFStudents;
        this.grades=new double[numberOFStudents];
        displayMessage();
    }

    public  void displayMessage(){
        System.out.printf("歡迎使用%s 成績系統\n",courseName);
    }

    public  void processStudentsGrades(){
        Scanner input = new Scanner(System.in);
        System.out.println("輸入學生成績:");
        for(int i =0; i<numberOFStudents;i++){
            students[i].printData();
            System.out.print("的成績:");
            grades[i]=input.nextDouble();
        }
    }

    public  double getMaixmum() {
        double max = grades[0];
        for(int i=1; i<numberOFStudents; i++){
            if(grades[i]>max){
                max=grades[i];
            }
        }
        return  max;
    }

    public double getMinimum(){
        double min =grades[0];
        for (int i=1; i<numberOFStudents; i++){
            if(grades[i]<min){
                min=grades[i];
            }
        }
        return  min;
    }

    public double getAverage(){
        double sum =0;
        for(int i =0; i<numberOFStudents; i++){
            sum += grades[i];
        }
        return  sum / numberOFStudents;
    }

    public  void displayGradeReport(){
        System.out.println("成績報告:");
        System.out.println("學號\t\t 姓名\t 成績");
        System.out.println("-------------------------------");
        for (int i=0; i<numberOFStudents; i++){
            students[i].printData();
            System.out.printf("%.1f\n", grades[i]);
        }
        System.out.printf("最高分: %.1f\n", getMaixmum());
        System.out.printf("最低分: %.1f\n", getMinimum());
        System.out.printf("平均分: %.1f\n", getAverage());
    }
}
