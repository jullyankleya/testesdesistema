package school.cesar.unit.examples;

public class BmiCalculator {

    public static final String SEVERELY_UNDERWEIGHT = "Severely underweight";
    public static final String UNDERWEIGHT = "Underweight";
    public static final String NORMAL = "Normal";
    public static final String OVERWEIGHT = "Overweight";
    public static final String MODERATELY_OBESE = "Moderately obese";
    public static final String SEVERELY_OBESE = "Severely obese";

    public String calc(double height, double weight){
        double imc = weight / (height * height);

        if(imc < 17){
            return SEVERELY_UNDERWEIGHT;
        }
        if(imc < 18.5){
            return UNDERWEIGHT;
        }
        else if(imc < 25) {
            return NORMAL;
        }
        if(imc < 30) {
            return OVERWEIGHT;
        }
        if(imc < 40) {
            return MODERATELY_OBESE;
        }
        return SEVERELY_OBESE;
    }
}