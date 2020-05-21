import java.util.Comparator;

class CpuSpeedComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer c1, Computer c2) {
        if (c1 != null && c2 == null)
            return -1;
        if (c1 == null && c2 != null)
            return 1;
        return Integer.compare(c2.getCpuSpeed(), c1.getCpuSpeed());
    }
}
