package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        if ((Math.pow(firstSide,2))*(Math.pow(secondSide,2))==Math.pow(thirdSide,2)){
            System.out.println("this is a valid triangle");
        }else{
            System.out.println("it's not a triangle");
        }

    }
}
