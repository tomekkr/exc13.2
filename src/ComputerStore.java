import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class ComputerStore {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<Computer> computers = ComputerStoreService.createComputersList();
            ComputerStoreService.printHead();
            int option = scanner.nextInt();
            ComputerStoreService.sortByOptionSelected(computers, option);
            ComputerStoreService.printList(computers);
        } catch (IncorrectOptionNumber e) {
            System.err.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.err.println("Wpisana wartość nie jest liczbą całkowitą");
        }
    }
}
