public class While {
    public static void main(String[] args) {
//	    int count = 6;
//        while(count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        for(int i=6; i!= 6; i++) {
//            System.out.println("Count value is " + count);
//        }
//
//        count = 6;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//
//            if(count >100) {
//                break;
//            }
//
//        } while(count != 6);

//        int number = 5;
//        int finishNumber = 20;
//        while(number <= finishNumber) {
//            if(!isEvenNumber(number)) {
//                number++;
//                continue;
//            }
//
//            System.out.println("Even number " + number);
//            number++;
//        }


        int number = 5;
        int finishNumber = 20;
        int evenNumbersFound = 0;
        while(number <= finishNumber) {
            if(!isEvenNumber(number)) {
                number++;
                continue;
            }

            System.out.println("Even number " + number);
            number++;

            evenNumbersFound++;
            if(evenNumbersFound >=5) {
                break;
            }
        }

        System.out.println("Total even numbers found = " + evenNumbersFound);


    }

    public static boolean isEvenNumber(int number) {
        if((number % 2)  == 0) {
            return true;
        } else {
            return false;
        }
    }


}
