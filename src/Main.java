public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double parameters = service.calculate(50.0, 1.64);// вес в кг, рост в метрах
        System.out.printf("Индекс массы тела " + "%.2f", parameters);
    }
}
