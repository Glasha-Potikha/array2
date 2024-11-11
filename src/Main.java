public class Main {
    public static void main(String[] args) {
        //Задача №1
        int[] payments = new int[]{45003, 23000, 78900, 10000, 36000};
        int sum = 0;
        for (int i : payments) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        // Задача №2
        int minPayment = Integer.MAX_VALUE;
        int maxPayment = -1;
        for (final int current : payments) {
            if (current < minPayment) {
                minPayment = current;
            }
            if (current > maxPayment) {
                maxPayment = current;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minPayment + " рублей");
        System.out.println("Максимальная сумма трат за неделю составила " + maxPayment + " рублей");
        // Задача №3
        int averagePaymentInRubles = sum / payments.length;
        int averagePaymentInKopecks = (sum % payments.length) * 100;
        averagePaymentInKopecks = averagePaymentInKopecks / payments.length;
        System.out.println("Средняя сумма трат за месяц составила " + averagePaymentInRubles + " рублей и " + averagePaymentInKopecks + " копеек");
        // Задача №4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = 0; i < reverseFullName.length / 2; i++) {
            final char current = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = current;
        }
        for (char el : reverseFullName) {
            System.out.print(el);
        }
        System.out.println();
    }
}