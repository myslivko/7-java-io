package com.example.task04;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Formatter;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - запустить программу
        // - проверить, что получилось 351.731900

        double sum = 0.0;
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        while (inputStreamReader.ready()) {
            stringBuilder.appendCodePoint(inputStreamReader.read());
        }
        String[] parsed = stringBuilder.toString().split("\\s");
        for (String num : parsed) {
            try {
                sum += Double.parseDouble(num);
            } catch (NumberFormatException ignored) {
            }
        }
        System.out.println(new Formatter(Locale.US).format("%.6f", sum));

    }
}
