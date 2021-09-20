package com.company;

public class Main {

    public static void main(String[] args) {
//	int value = 1;
//    if(value == 1) {
//        System.out.println("Value was 1");
//    }else if (value == 2){
//        System.out.println("Value was 2");
//    }else {
//        System.out.println("Value was not 1 or 2");
//    }

//    int switchValue = 3;
//
//    switch (switchValue) {
//        case 1:
//            System.out.println("Value was 1");
//            break;
//        case 2:
//            System.out.println("Value was 2");
//            break;
//
//        case 3:case 4:case 5:
//            System.out.println("Was a 3, or a 4 or a 5");
//            System.out.println("Was actually a " + switchValue);
//            break;
//
//        default:
//            System.out.println("Was not one or two");
//            break;
//    }

        char Letter = 'Z';

        switch (Letter) {

            case 'A':
                System.out.println("Letter is A");
                break;
                case 'B':
                System.out.println("Letter is B");
                break;
            case 'C':
                System.out.println("Letter is C");
                break;
            case 'D':
                System.out.println("Letter is D");
                break;
            case 'E':
                System.out.println("Letter is E");
                break;

            default:
                System.out.println("Letter is not A,B,C,D or E");
        }
    }
}
