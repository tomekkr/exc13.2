import java.util.Comparator;

class MemorySizeComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer c1, Computer c2) {
        return Integer.compare(c2.getMemorySize(), c1.getMemorySize());
    }
}