package FourthAssignment.TaskTwo;

import java.util.Arrays;

public class StrategyFour implements Strategy{
    @Override
    public double computerScore(double[] a) {
        if (a.length<=2) return 0;
        // product是算几何平均值过程中的乘积
        double score, product = 1;
        Arrays.sort(a);
        for (int i = 1; i<a.length - 1; i++) {
            product = product * a[i];
        }
        score = Math.pow(product, (double)1/(a.length-2));
        return score;
    }

    public static void main(String[] args) {
        // 测试computerScore方法
        StrategyFour strategyFour = new StrategyFour();
        double[] a = {90, 80, 78, 70, 65, 60};
        double result = strategyFour.computerScore(a);
        System.out.println("几何平均值结果为：" + result);
    }
}
