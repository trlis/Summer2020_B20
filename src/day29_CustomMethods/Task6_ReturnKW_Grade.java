package day29_CustomMethods;
/*
    6. calculate the grade of the student based on the score
    grade: int score = 95;
    score < 0 || score > 100 ==> Invalid
	90 ~ 100 ==> A
	80 ~ 89 ==> B
	70 ~ 79 ==> C
	60 ~ 69 ==> D
	otherwise ==> F

 */
public class Task6_ReturnKW_Grade {
    public static void main(String[] args) {


     grade(101);



    }

    public static void grade(int score){

        if(score<0 || score>100){
            System.out.println("Invalid score");
           return;

        }
        char grade = (score>=90)? 'A' : (score>=80)? 'B' : (score>=70)? 'C':(score>=60)? 'D': 'F';
        System.out.println("Your scorer is: " + grade);




    }
}
