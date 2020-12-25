package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test
        while (System.in.available() > 0) {
            int byteFromIn = System.in.read();
            System.in.mark(1);
            int nextByteFromIn = System.in.read();
            if (!(byteFromIn == '\r' && nextByteFromIn == '\n')) {
                System.out.write(byteFromIn);
            }
            System.in.reset();
        }
        System.out.flush();
    }
}
