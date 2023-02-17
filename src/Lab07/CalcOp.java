package Lab07;

public interface CalcOp {
    default float add(float num1, float num2) { return num1 + num2; }
    default float subtract(float num1, float num2) { return num1 - num2; }
    default float multiply(float num1, float num2) { return num1 * num2; }
    default float divide(float num1, float num2) { return num1 / num2; }
}
