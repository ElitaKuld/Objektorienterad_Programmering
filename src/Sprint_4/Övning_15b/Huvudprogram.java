package Sprint_4.Övning_15b;

import Sprint_4.Övning_15a.MinKö;

public class Huvudprogram {
    public static void main(String[] args) {
        MinKö<Integer> kö = new MinKö<>();
        kö.put(5);
        kö.put(7);
        kö.put(9);
        Integer i = kö.take();
        System.out.println(i);
        System.out.println("size: " + kö.size());

        MinKö<String> kö2 = new MinKö<>();
        kö2.put("Jej!");
        kö2.put("Joj!");
        String ord = kö2.take();
        System.out.println(ord);
        System.out.println("size: " + kö2.size());

        MinKö_Bounded<Integer> kö3 = new MinKö_Bounded<>();
        kö3.put(25);
        kö3.put(22);
        kö3.put(20);
        Integer i2 = kö3.take();
        System.out.println(i2);
        System.out.println("size: " + kö3.size());
        System.out.println("sum: " + kö3.sumOfDigitsVersionTwo());

        if (kö3.sumOfDigitsVersionTwo().getClass() == Integer.class) {
            System.out.println("yes");
        }

        MinKö_Bounded<Double> kö4 = new MinKö_Bounded<>();
        kö4.put(5.7);
        kö4.put(7.4);
        kö4.put(3.3);
        Double d = kö4.take();
        System.out.println(d);
        System.out.println("size: " + kö4.size());
        System.out.println("sum: " + kö4.sumOfDigitsVersionTwo());
    }
}