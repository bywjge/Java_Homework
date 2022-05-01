package ThirdAssignment.TaskThree.china.beijing;

import ThirdAssignment.TaskThree.china.hb.hd.Family;

public class SubFamily extends Family {
    public static void main(String[] args) {

        SubFamily subFamily = new SubFamily();
        // 别人家把秘密传授给你
        subFamily.getSecret();
        // 别人家的门牌号是公开的
        subFamily.getDoorPlate();

        // 不能用别人家私有的运输工具
        // subFamily.getVehicle();

        // 不能直接看别人家的财富
        // System.out.println(subFamily.money);

        // 别人家开车出来炫耀
        subFamily.showOffCar();

        // 别人家炫耀财富
        subFamily.showOffMoney();

    }
}
