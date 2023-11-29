package Algorithms_TelRanPro.Homework.RangeSort;

public class BlockOfFlats {
    private Lift[] lift;
    private int numberOfLifts;
    private Floor floor;
    private int levelsAmount;

    public Floor getFloor() {
        return floor;
    }

    public int getLevelsAmount() {
        return levelsAmount;
    }

    public BlockOfFlats(Lift[] lift, Floor floor, int levelsAmount) {
        this.lift = lift;
        this.numberOfLifts = this.lift.length - 1;
        this.floor = floor;
        this.levelsAmount = levelsAmount;
    }

    public int getNumberOfLifts() {
        return numberOfLifts;
    }

    public Lift[] getLift() {
        return lift;
    }

}
