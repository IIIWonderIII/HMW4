public class Function {
    public static double calculatePerimeter(int a, int b, int c){
        return (a + b + c) / 2.0;
    }
    public static double areaOfaTriangle(int a, int b, int c){
        double result = calculatePerimeter(a, b, c);
        return Math.sqrt(result * (result - a) * (result - b) * (result - c));
    }
}
