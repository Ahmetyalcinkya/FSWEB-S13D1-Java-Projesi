public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java!");

        // barking system
        boolean shouldWakeUp2 = shouldWakeUp(true, 25);
        System.out.println(shouldWakeUp2);

        // age detection
        boolean ageDetection = hasTeen(19,36,51);
        System.out.println(ageDetection);

        //playful cat
        boolean playfulCat = isCatPlaying(false, 20 );
        System.out.println(playfulCat);

        // rectangle area
        double result = reactangleArea(6.2, 7.9);
        System.out.println(result);

        // circle area
        double circleResult = circleArea(5.7);
        System.out.println(circleResult);
    }

    public static boolean shouldWakeUp(boolean isBarking, int hours){
       if(hours > 0 && hours <= 23) {
            if(hours >= 8 && hours <= 20) {
                if(isBarking == true){
                    return true;
                }else {
                    return false;
                }
            } else {
                return false;
            }
        }else {
            return false;
        }
    }

    public static boolean hasTeen(int age1, int age2, int age3) {
        int max = 19;
        int min = 13;

        if(age1 >= min && age1 <= max || age2 >= min && age2 <= max || age3 >= min && age3 <= max){
            return true;
        }else {
            return false;
        }
    }

    public static boolean isCatPlaying(boolean season, int temperature){
        if(season){
            if(temperature >= 25 && temperature <= 45){
                return true;
            }else{
                return false;
            }
        }else {
            if(temperature >= 25 && temperature <= 35){
                return true;
            }else{
                return false;
            }
        }
    }

    public static double reactangleArea(double x, double y){
        if(x < 0 || y < 0){
            return -1;
        }else {
            return x * y ;
        }
    }

    public static double circleArea(double radius){
        if(radius < 0){
            return -1;
        }else {
           return radius * radius * Math.PI;
        }
    }
}