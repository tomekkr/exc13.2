import java.util.Comparator;

class CpuSpeedComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer c1, Computer c2) {
        return Integer.compare(c2.getCpuSpeed(), c1.getCpuSpeed());
    }
}
