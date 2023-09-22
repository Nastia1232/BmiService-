public class BmiService {
    public int calculate(double weight, double height) {
        // Рассчитываем BMI по формуле: вес / (рост * рост)
        double bmi = weight / (height * height);

        // Преобразуем результат в целое число
        int roundedBmi = (int) bmi;

        return roundedBmi;
    }

    public static void main(String[] args) {
        // Создание объекта BmiService
        BmiService bmiService = new BmiService();

        // Входные данные (вес в килограммах и рост в метрах)
        double weight = 98.0;
        double height = 1.87;

        // Вызов метода calculate для расчета BMI
        int bmi = bmiService.calculate(weight, height);

        // Вывод результата в консоль
        System.out.println("BMI: " + bmi);
    }
}
