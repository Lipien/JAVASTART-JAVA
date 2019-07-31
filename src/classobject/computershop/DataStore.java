package classobject.computershop;

public class DataStore {

    private static final int MAX_COMPUTERS = 100;

    private Computer[] computers = new Computer[MAX_COMPUTERS];
    private int computersCount;

    public Computer[] getComputers() {
        Computer[] comps = new Computer[computersCount];
        for (int i = 0; i < computersCount; i++) {
            comps[i] = computers[i];
        }
        return comps;
    }

    public void setComputers(Computer[] computers) {
        this.computers = computers;
    }

    public int getComputersCount() {
        return computersCount;
    }

    public void setComputersCount(int computersCount) {
        this.computersCount = computersCount;
    }

    public void add(Computer computer) {
        if (computersCount < MAX_COMPUTERS && computer != null) {
            computers[computersCount] = computer;
            computersCount++;
        }
    }

    public int checkAvailability(Computer find) {
        if (find == null)
            return 0;

        int count = 0;
        for (int i = 0; i < computersCount; i++) {
            if (find.equals(computers[i])) {
                count++;
            }
        }
        return count;
    }
}

