package ChapterFour.Exercise5_2;

public class Test {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        HardDisk hardDisk = new HardDisk();
        cpu.setSpeed(2200);
        hardDisk.setCapacity(200);
        PC pc = new PC();
        pc.setCPU(cpu);
        pc.setHardDisk(hardDisk);
        pc.show();
    }
}
