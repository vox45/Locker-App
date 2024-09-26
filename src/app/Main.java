package src.app;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new DataRepository().getData();  // Отримуємо числа
        DataHandler dataHandler = new DataHandler();     // Створюємо об'єкт для обробки даних

        // Обробляємо кожне число з масиву
        for (int num : numbers) {
            System.out.println("Initial value is " + num);
            int newNum = dataHandler.modify(num);  // Модифікуємо число
            System.out.println("New value is " + newNum);
        }
    }
}
