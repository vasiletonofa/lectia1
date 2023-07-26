package examples.lectia2;

public class Calculator {

    private MotherBoard motherBoard;
    private Cpu cpu;


    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }

    public String getProducatorMotherBoard() {
        return motherBoard.getProducator();
    }

}
