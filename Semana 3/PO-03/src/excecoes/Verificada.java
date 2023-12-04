package excecoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Verificada {
    public static void main(String[] args) {
        try {
            File file = new File("arquivo.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        }
    }
}