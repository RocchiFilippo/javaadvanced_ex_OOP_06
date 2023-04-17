package _6;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    private enum YouCanUseClassLocalEnumsLikeThis {
        THIS_CAN_ONLY_BE_ACCESSED_IN_THIS_CLASS,
        THIS_TOO
    }

    /**
     * 1:
     *
     *
     * Create an enum called "Days" with the values "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY".
     *
     * Loop over the values with Days.values() and print them out.
     */
    private enum Days {
        MONDAY(false),
        TUESDAY(false),
        WEDNESDAY(false),
        THURSDAY(false),
        FRIDAY(false),
        SATURDAY(true),
        SUNDAY(true);

        private boolean isWeekend;

        Days(boolean isWeekend){this.isWeekend = isWeekend;}

        public boolean getIsWeekend(){return isWeekend;}
    }

    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        for (Days day : Days.values()){
            System.out.println(day);
        }
    }

    /**
     * 2:
     *
     *
     * Create an enum called "Seasons" with the values "SPRING", "SUMMER", "FALL", "WINTER".
     *
     * Write a method that takes a Seasons value as input and returns the corresponding date range of months in that season.
     *
     */
    private enum Season{
        SPRING, SUMMER, FALL, WINTER;
    }
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Season season = Season.WINTER;

        switch (season){
            case SPRING -> System.out.println("Spring = 21 March - 21 June");
            case SUMMER -> System.out.println("Summer = 22 June - 22 September");
            case FALL -> System.out.println("Fall = 23 September - 21 December");
            case WINTER -> System.out.println("Winter = 22 December - 20 March");
        }
    }

    /**
     * 3:
     *
     *
     * Create an enum called "TrafficLight" with the values "RED", "YELLOW", "GREEN".
     *
     * Write code that simulates the behavior of a traffic light. It should take the current state of the traffic light as input and return the next state.
     *
     */
    private enum TrafficLight{
        RED,
        YELLOW,
        GREEN;
    }
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        TrafficLight currentColour = TrafficLight.GREEN;


        System.out.println("Current traffic light = " + currentColour);

        if (currentColour.equals(TrafficLight.RED)){
            currentColour = TrafficLight.GREEN;
        } else if (currentColour.equals(TrafficLight.YELLOW)){
            currentColour = TrafficLight.RED;
        } else {
            currentColour = TrafficLight.YELLOW;
        }

        System.out.println("New traffic light = " + currentColour);
    }

    /**
     * 4:
     *
     * Given the Days enum from exercise 1, add a local field called isWeekend and set it to true for the weekend days and false for the weekdays.
     *
     * Write an if statement that prints weekend or weekday based on the enum
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here
        for (Days day : Days.values()){
            if (day.getIsWeekend() == true){
                System.out.println(day + " are a weekend day");
            } else {
                System.out.println(day + " are a week day");
            }
        }
    }

    /**
     * 5:
     *
     *
     * Create an enum called "Operator" with the values "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE".
     *
     * Write a method that takes two integers and an Operator value as input, performs the corresponding operation on the integers, and returns the result.
     */
    private enum Operator{
        ADD,
        SUBTRACT,
        MULTIPLY,
        DIVIDE;
    }

    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        // Your code here
        double num1 = 5;
        double num2 = 2;
        Operator myOperator = Operator.MULTIPLY;

        if (myOperator.equals(Operator.ADD)){
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        } else if (myOperator.equals(Operator.SUBTRACT)){
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        } else if (myOperator.equals(Operator.MULTIPLY)){
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        } else {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        }
    }

}
