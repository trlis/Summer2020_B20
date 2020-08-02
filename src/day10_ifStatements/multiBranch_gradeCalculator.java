package day10_ifStatements;
/*
grade:
    90 ~ 100 ==> A
    80 ~ 89 ==> B
    70 ~ 79 ==> C;
    60 ~ 69 ==> D
    otherwise ==> F
*/
public class multiBranch_gradeCalculator {
    public static void main(String[] args) {


        int score = 55;

        String grade = "";

        if( score >= 90 && score <= 100 ) {
            grade = "grade is A";
        }else if ( score >= 80 && score <= 89) {
            grade = "grade is B";
        }else if ( score >= 70 && score <=79) {
            grade = "grade is C";
        }else if ( score >= 60 && score <= 69) {
            grade = "grade is D";
        }else {
            grade = "grade is F";
        }
            System.out.println(grade);


        }


        }



