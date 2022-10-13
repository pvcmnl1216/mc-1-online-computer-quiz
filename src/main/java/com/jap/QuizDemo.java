package com.jap;

public class QuizDemo {

    public String highestScore(String []nameOfSchool , String[] scores ) {
        int number = 0;
        try {
            int highestScore = Integer.parseInt(scores[0]);
            int index;
            for (index = 0; index < scores.length; index++) {
                if (Integer.parseInt(scores[index]) > highestScore) {
                    highestScore = Integer.parseInt(scores[index]);
                    number = index;
                }
            }
        } catch (NumberFormatException exception) {
            return exception.toString();
        }

        return nameOfSchool[number];
    }
    public String[] convertAllNamesToCapital(String name[]){
        String upperCase[] = new String[0];
        try {
            for (int index = 0; index < name.length; index++) {
                upperCase[index] = name[index].toUpperCase();
            }
        } catch (NullPointerException exception){
          return new String[]{"java.lang.NullPointerException"};
        }
        return upperCase;
    }
}






