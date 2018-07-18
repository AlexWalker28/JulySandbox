package kg.kloop.android.julysandbox;

class XoModel {
    private int[][] fieldArray;
    private int playerTurn;
    private boolean winner;

    public XoModel() {
        fieldArray = new int[3][3];
        playerTurn = Constants.PLAYER_X;
        winner = false;
    }

    public int[][] getFieldArray() {
        return fieldArray;
    }

    public int getPlayerTurn() {
        return playerTurn;
    }

    public boolean isWinner() {
        return winner;
    }

    public void setFieldArray(int[][] fieldArray) {
        this.fieldArray = fieldArray;
    }

    public void setPlayerTurn(int playerTurn) {
        this.playerTurn = playerTurn;
    }
}
