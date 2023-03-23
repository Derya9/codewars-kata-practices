package kyu_7;

public class PatternNo4 {
    public String pattern(int n) {

        String string = "";


        for (int i = 1; i < n+1;) {
            string =string.concat(String.valueOf(i));
            i++;
            System.out.println(string);
        }

        return string;
    }
}

//Task:

//You have to write a function pattern which creates the following pattern upto n number of rows.
//If the Argument is 0 or a Negative Integer then it should return "" i.e. empty string.