package Algorithms_TelRanPro.Homework.RangeSort;

public class Lift {
    private int currentLevel;
    private String name;

    public String getName() {
        return name;
    }

    public Lift(int currentLevel, String name) {
        this.currentLevel = currentLevel;
        this.name = name;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    @Override
    public String toString() {
        return name;
    }
}
