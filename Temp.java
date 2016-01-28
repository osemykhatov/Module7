package Module4_1_3;

public class Temp {

    public static void main(String[] args){

        Celsius convert = new Celsius(98);
        Celsius convert1 = new Celsius(44.6f);



        System.out.println("If Celsius temperature is 98 - equal value in Fahrenheit is " + convert.getCelsToFahr());
        System.out.println("If Fahrenheit temperature is 98 - equal value in Celsius is " + convert1.getFahrToCels());

    }

}
