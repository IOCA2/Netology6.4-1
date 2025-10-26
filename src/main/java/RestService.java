public class RestService {
    public int calculate(int income, int expenses) {
        int count = 0; // счётчик месяцев отдыха
        int threshold = 20000; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (threshold >= expenses) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                threshold = threshold - expenses;
            } else {
                threshold = threshold + income;
            }
        }
        return count / 3;
    }
}

