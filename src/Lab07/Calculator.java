package Lab07;

public class Calculator implements CalcOp {
    @Override
    public float add(float num1, float num2) { return CalcOp.super.add(num1, num2); }
    @Override
    public float subtract(float num1, float num2) { return CalcOp.super.subtract(num1, num2); }
    @Override
    public float multiply(float num1, float num2) { return CalcOp.super.multiply(num1, num2); }
    @Override
    public float divide(float num1, float num2) { return CalcOp.super.divide(num1, num2); }
}
