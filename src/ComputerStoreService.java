import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ComputerStoreService {
    private final static int SORT_BY_NAME = 1;
    private final static int SORT_BY_CPU_SPEED = 2;
    private final static int SORT_BY_MEMORY_SIZE = 3;

    private ComputerStoreService() {
    }

    public static List<Computer> createComputersList() {
        List<Computer> computers = new ArrayList<>();
        computers.add(new Computer("Komputer A", 3000, 2048));
        computers.add(new Computer("Komputer B", 3200, 4096));
        computers.add(new Computer("Komputer B", 3200, 8192));
        computers.add(new Computer("Komputer B", 2800, 16384));
        computers.add(new Computer("Komputer C", 2800, 16384));
        return computers;
    }

    public static void printHead() {
        System.out.println("Wybierz jak posortować listę:");
        System.out.println("1 - wg nazwy, 2 - wg prędkości procesora, 3 - wg rozmiaru pamięci RAM");
    }

    public static void sortByOptionSelected(List<Computer> computers, int option) {
        switch (option) {
            case SORT_BY_NAME -> Collections.sort(computers);
            case SORT_BY_CPU_SPEED -> computers.sort(new CpuSpeedComparator());
            case SORT_BY_MEMORY_SIZE -> computers.sort(new MemorySizeComparator());
            default -> throw new IncorrectOptionNumber("Wybrano nieprawidłowy numer opcji");
        }
    }

    public static void printList(List<Computer> computers) {
        for (Computer computer : computers) {
            System.out.println(computer);
        }
    }
}
