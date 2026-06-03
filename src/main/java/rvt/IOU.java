package rvt;

import java.util.HashMap;
import java.util.Map;

public class IOU {
     private final Map<String, Double> debts = new HashMap<>();

    public IOU() {
    }

    public void setSum(String toWhom, double amount) {
        debts.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return debts.getOrDefault(toWhom, 0.0);
    }

    public static void main(String[] args) {
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Timur", 20);
        mattsIOU.setSum("Artjom", 52.5);
        System.out.println(mattsIOU);
        System.out.println("How much do I owe to Timur? " + mattsIOU.howMuchDoIOweTo("Timur"));
        System.out.println("How much do I owe to Artjom? " + mattsIOU.howMuchDoIOweTo("Artjom"));
        mattsIOU.setSum("Timur", 10);
        System.out.println(mattsIOU);
    }
}

