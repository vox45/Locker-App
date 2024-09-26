package src.app;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DataHandler {

    private final Lock lock = new ReentrantLock();  // Створюємо об'єкт блокування

    // Метод для модифікації числа з використанням блокування
    public int modify(int num) {
        lock.lock();  // Блокуємо доступ
        try {
            num = num * 3;  // Модифікуємо число (множимо на 3)
            return num;
        } finally {
            lock.unlock();  // Знімаємо блокування
        }
    }
}
