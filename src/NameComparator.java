import java.util.Comparator;

class NameComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer c1, Computer c2) {
        if (c1 != null && c2 == null)
            return -1;
        if (c1 == null && c2 != null)
            return 1;
        if (c1.getName() != null && c2.getName() == null)
            return -1;
        if (c1.getName() == null && c2.getName() != null)
            return 1;
        return Integer.compare(c1.getName().compareTo(c2.getName()), 0);
    }
}