package ThirdAssignment.TaskThree.china.hb.hd;

public class Family {

    private long money=100000000;
    public String doorPlate="A1204";

    // 仅家族成员可以使用的运输工具
    private void getVehicle() {
        System.out.println("我开我的法拉利");
    }

    protected void getSecret() {
        System.out.println("祖传的秘密被看见咯");
    }
    // 门牌号是公开的
    public void getDoorPlate() {
        System.out.println("我的门牌号是:" + doorPlate);
    }
    // 公开在别人面前炫耀车
    public void showOffCar() {
        getVehicle();
    }

    // 公开在别人面前炫耀钱
    public void showOffMoney() {
        System.out.println("我有" + money + "这么多钱");
    }
}
