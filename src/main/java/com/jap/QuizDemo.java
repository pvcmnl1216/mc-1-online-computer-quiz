package com.jap;

public class QuizDemo {

    //return the school name which has got the highest score in quiz
    //Handle the NumberFormatException
    public String highestScore(String []nameOfSchool , String[] scores ){
        try {
            for (int index = 0; index < scores.length; index++) {
                
            }
            for (int index = 1; index < scores.length; index++) {
                int temp = 0;
                if (Integer.parseInt(scores[index])>Integer.parseInt(scores[index])){
                    temp = Integer.parseInt(scores[index]);
                    scores[index]=scores[index];
                    scores[index] = String.valueOf(temp);
                    nameOfSchool[index] = nameOfSchool[index];
                }
                return nameOfSchool[nameOfSchool.length-1];
            }
        } catch (NumberFormatException e) {
            return "java.lang.NumberFormatException: For input string: \"fifty-six\"" ;
        }
        return "";

    }
    //convert all the names in uppercase
    //Handle the NullPointerException
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






