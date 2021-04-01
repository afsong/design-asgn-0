import java.util.LinkedList;

public class Quarantine {
    public LinkedList<Integer> record;

    public Quarantine() {
        record = new LinkedList<Integer>();
    }

    public void add(Integer identifyNum) {
        if (!record.contains(identifyNum)) {
            record.add(identifyNum);
        }

    }

    public void remove(Integer identifyNum) {
        record.remove(identifyNum);
    }

    public int quarantineNum() {
        return record.size();
    }

    public static void main(String[] args) {
        Quarantine testDrive = new Quarantine();
        testDrive.add(1001);
        testDrive.add(1002);
        testDrive.add(1003);
        testDrive.add(1004);
        testDrive.remove(1004);
        System.out.println(testDrive.quarantineNum());

    }
}