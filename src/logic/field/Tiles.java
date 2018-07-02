package logic.field;

import logic.IGameEntity;

public class Tiles {

    IGameEntity[] currentOnField;
    int xCoord;
    int yCoord;


    Tiles() {
        currentOnField = null;
        for (int i = 0;i < currentOnField.length; i++) {
            for (int j = 0; j < currentOnField.length; j++) {
                //сука блядь, иди нахуи

            }
        }
    }

    /**
     * Determines if this tile is empty or not
     * @return empty?
     */
    public boolean empty() {
        return currentOnField == null;
    }

    /**
     * Adds the new entity on te first not null cell
     * @param newEntity new
     */
    public void enterField(IGameEntity newEntity) {
        for (int i  = currentOnField.length; i > 0; i--) {
            if (currentOnField[i] == null) {
                currentOnField[i] = newEntity;
            }
        }
    }

    public void leaveField() {
        //TODO
    }

    public IGameEntity[] getCurrentOnField() {
        return currentOnField;
    }
}
