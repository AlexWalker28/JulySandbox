package kg.kloop.android.julysandbox;


class XoController {

    private XoModel xoModel;
    private int[][] fieldArray;
    private int playerTurn;
    private boolean winner;

    public XoController(XoModel xoModel) {
        this.xoModel = xoModel;
        fieldArray = xoModel.getFieldArray();
        playerTurn = xoModel.getPlayerTurn();
        winner = xoModel.isWinner();
    }

    public void move(int x, int y) {
        if (fieldArray[x][y] == Constants.EMPTY_CELL && !winner) {
            if (playerTurn == Constants.PLAYER_X) {
                fieldArray[x][y] = Constants.PLAYER_X;
                xoModel.setFieldArray(fieldArray);
                playerTurn = Constants.PLAYER_O;
                xoModel.setPlayerTurn(playerTurn);
            } else if (playerTurn == Constants.PLAYER_O) {
                fieldArray[x][y] = Constants.PLAYER_O;
                xoModel.setFieldArray(fieldArray);
                playerTurn = Constants.PLAYER_X;
                xoModel.setPlayerTurn(playerTurn);
            }
        }
    }
}
