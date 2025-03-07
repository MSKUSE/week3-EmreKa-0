public class FindGrade {

    public static void main(String[] args) {


        //Get the score from the user as a file parameter
        if (args.length != 0) {
            int score = Integer.parseInt(args[0]);
            char grade;
            //Calculate the grade based on the score
            if (score < 60) {
                grade = 'F';
            } else if (score < 70) {
                grade = 'D';
            } else if (score < 80) {
                grade = 'C';
            } else if (score < 90) {
                grade = 'B';
            } else {
                grade = 'A';
                //Print the grade to the console
                System.out.println(grade);
                // 90 - 100 -> A
                // 80 - 89 -> B
                // 70 - 79 -> C
                // 60 - 69 -> D
                // 0 - 59 -> F
            }
        } else {
            System.out.println("Give parameter to args");
        }


    }
}