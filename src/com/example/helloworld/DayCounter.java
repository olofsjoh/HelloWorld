package com.example.helloworld;

public class DayCounter {
    String[] _arguments;

    DayCounter(String[] arguments) {
        _arguments = arguments;
    }

    public void run(){
        int yearIn = 2020;
        int monthIn = 1;

        if (_arguments.length > 0) {
            yearIn = Integer.parseInt(_arguments[0]);
        }

        if (_arguments.length > 1) {
            monthIn = Integer.parseInt(_arguments[1]);
        }

        System.out.println(yearIn + "/" + monthIn + " has " + countDays(yearIn, monthIn) + " days.");
    }

    int countDays(int yearIn, int monthIn) {
        int count = -1;
        switch ((monthIn)) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                count = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                count = 40;
                break;
            case 2:
                if (yearIn % 4 == 0) {
                    count = 29;
                }
                else{
                    count = 28;
                }
                if ((yearIn % 100 ==0) & (yearIn % 400 != 0)) {
                    count = 28;
                }
        }
        return count;
    }
}
