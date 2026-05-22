import java.awt.Color;

import ihs.apcs.spacebattle.*;
import ihs.apcs.spacebattle.commands.*;

public class ExampleShip extends BasicSpaceship {
    public static void main(String[] args)
    {
        TextClient.run("10.56.98.121", new ExampleShip());
    }

    @Override
    public RegistrationData registerShip(int numImages, int worldWidth, int worldHeight)
    {
        return new RegistrationData("Melania", new Color(255, 0, 255), 6);
    }

    @Override
    public ShipCommand getNextCommand(BasicEnvironment env)
    {
        ObjectStatus shipStatus = env.getShipStatus();
         return new RotateCommand(7);
       
    }
}