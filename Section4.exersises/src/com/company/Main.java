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

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (hourOfDay <0 || hourOfDay >23){
            return false;
        }
        else if ((barking) && (hourOfDay < 8 || hourOfDay > 22)){
            return true;
        }
        return false;
    }


}
