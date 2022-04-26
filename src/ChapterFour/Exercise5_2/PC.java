package ChapterFour.Exercise5_2;

public class PC {

    CPU cpu;
    HardDisk hardDisk;

    void setCPU(CPU cpu) {
        this.cpu = cpu;
    }

    void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    void show() {
        System.out.println("CPU速度:" + cpu.getSpeed());
        System.out.println("硬盘容量:" + hardDisk.getCapacity());
    }

}
