package com.jap;

public class QuizDemo {

    public String highestScore(String []nameOfSchool , String[] scores ) {
        int flag = 0;
        try {
            int highestScore = Integer.parseInt(scores[0]);
            int index;
            for (index = 0; index < scores.length; index++) {
                if (Integer.parseInt(scores[index]) > highestScore) {
                    highestScore = Integer.parseInt(scores[index]);
                    flag = index;
                }

            }
        } catch (NumberFormatException exception) {
            return exception.toString();
        }

        return nameOfSchool[flag];
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






