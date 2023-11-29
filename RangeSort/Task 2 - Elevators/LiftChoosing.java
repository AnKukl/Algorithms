package Algorithms_TelRanPro.Homework.RangeSort;

public class LiftChoosing {
    public static void main(String[] args) throws Exception {
        Lift lift1 = new Lift(4, "A");
        Lift lift2 = new Lift(8, "B");
        Lift lift3 = new Lift(9, "C");
        Lift[] lifts = {lift1, lift2, lift3};
        BlockOfFlats block = new BlockOfFlats(lifts, new Floor(8), 20);
        System.out.println(block.getFloor().callElevator(block));
    }
}
