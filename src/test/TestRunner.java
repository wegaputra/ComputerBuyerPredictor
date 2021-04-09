package test;

import predictor.ComputerBuyerPredictor;

public class TestRunner {
    public static void main(String[] args) {
        ComputerBuyerPredictor predictor = new ComputerBuyerPredictor();
        
        System.out.println(predictor.predict(0, 0, 0));
        System.out.println(predictor.predict(0, 0, 1));
        System.out.println(predictor.predict(0, 1, 0));
        System.out.println(predictor.predict(0, 1, 1));
        System.out.println(predictor.predict(1, 0, 0));
        System.out.println(predictor.predict(1, 0, 1));
        System.out.println(predictor.predict(1, 1, 0));
        System.out.println(predictor.predict(1, 1, 1));
        System.out.println(predictor.predict(2, 0, 0));
        System.out.println(predictor.predict(2, 0, 1));
        System.out.println(predictor.predict(2, 1, 0));
        System.out.println(predictor.predict(2, 1, 1));
    }
}
