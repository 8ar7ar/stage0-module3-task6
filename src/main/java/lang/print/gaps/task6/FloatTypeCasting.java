package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        if (numberToBeRounded % 1 < 0.5){
            int result = (int) Math.floor(numberToBeRounded);
            System.out.println(result);
        } else {
            int result = (int) Math.ceil(numberToBeRounded);
            System.out.println(result);
        }
    }
}
