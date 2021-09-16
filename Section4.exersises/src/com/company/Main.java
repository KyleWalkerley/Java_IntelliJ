package com.company;

public class Main {

//    public static long toMilesPerHour(double kilometersPerHour){
//        if (kilometersPerHour < 0){
//            return -1;
//        }
//        return Math.round((kilometersPerHour / 1.609));
//    }
//
//    public static void printConversion(double kilometersPerHour){
//        if (kilometersPerHour < 0){
//            System.out.println("Invalid Value");;
//        }
//        else{
//            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
//        }
//    }



//    public static void main(String[] args) {
//        public static void printMegaBytesAndKiloBytes(int kiloBytes) {
//            int megabytes = kiloBytes / 1024;
//            int remainderKilobytes = kiloBytes % 1024;
//
//            if (kiloBytes < 0) {
//                System.out.println("Invalid Value");
//            } else {
//                System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainderKilobytes + " KB");
//            }
//        }
//    }

//    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
//        if (hourOfDay <0 || hourOfDay >23){
//            return false;
//        }
//        else if ((barking) && (hourOfDay < 8 || hourOfDay > 22)){
//            return true;
//        }
//        return false;
//    }

//    public static boolean isLeapYear(int year) {
//        if (year >= 1 && year <= 9999) {
//            if ((year % 4) == 0) {
//                if ((year % 100) == 0) {
//                    if ((year % 400) == 0) {
//                        return true;
//                    }
//                } else {
//                    return true;
//                }
//            }
//
//        }
//        return false;
//    }

//    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
//
//        int num11 = (int)(num1 * 1000);
//        int num22 = (int)(num2 * 1000);
//
//        if(num11 == num22){
//            return true;
//        }
//        return false;
//
//    }

//    public static boolean hasEqualSum(int num1, int num2, int num3){
//        if ((num1 + num2) == num3){
//            return true;
//        }
//        return false;
//    }

    public static boolean hasTeen(int a, int b, int c){
        return ((13 <= a && a <= 19)||
                (13 <= b && b <= 19)||
                (13 <= c && c <= 19));
    }
    public static boolean isTeen(int a){
        return (13 <= a && a <= 19);
    }
}

