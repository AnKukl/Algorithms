package Algorithms_TelRanPro.Homework.RangeSort;

public class Floor {
    private int level;

    public Floor(int level) {
        this.level = level;
    }


    public Lift callElevator(BlockOfFlats block) throws Exception {
        int i;
        int j;
        if (block.getLevelsAmount() > block.getFloor().level) {
            int result = block.getLevelsAmount();
            for (i = 0; i <= block.getNumberOfLifts(); i++) {
//                System.out.println(result);

                int sample = block.getLift()[i].getCurrentLevel() - this.level;
                if (Maths.positive(result) > Maths.positive(sample)) {
                    result = sample;
//                    System.out.println(result);
                }

            }
            for (j = 0; j < block.getNumberOfLifts(); j++) {
                if (result == block.getLift()[j].getCurrentLevel() - this.level) {
                    break;
                }
            }
        } else throw new Exception("Sorry, there is no elevators to call");
        return block.getLift()[j];
    }
}
