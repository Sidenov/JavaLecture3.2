public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 100;          // вес в килограммах
        double height = 190;       // рост в сантиметрах
        double result = service.calculate(weight, height);
        System.out.println(result);
    }
}
