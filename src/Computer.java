import java.util.Objects;

public class Computer {
    private String name;
    private int cpuSpeed;
    private int memorySize;

    public Computer(String name, int speed, int memory) {
        this.name = name;
        this.cpuSpeed = speed;
        this.memorySize = memory;
    }

    public Computer(String name, int speed) {
        this.name = name;
        this.cpuSpeed = speed;
    }

    public Computer(String name) {
        this.name = name;
    }

    public Computer() {
    }

    public String getName() {
        return name;
    }

    public int getCpuSpeed() {
        return cpuSpeed;
    }

    public int getMemorySize() {
        return memorySize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return cpuSpeed == computer.cpuSpeed &&
                memorySize == computer.memorySize &&
                Objects.equals(name, computer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cpuSpeed, memorySize);
    }

    @Override
    public String toString() {
        return name + " (procesor: " + cpuSpeed + ", pamięć RAM: " + memorySize + ")";
    }
}


