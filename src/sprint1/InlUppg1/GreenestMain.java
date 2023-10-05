package sprint1.InlUppg1;

import javax.swing.*;

public class GreenestMain {
    public static void main(String[] args) {


        Plant[] plantArray = {new Cactus("Igge", 0.20), //Polymorfism
                new Palm("Laura", 5),                   //Polymorfism
                new CarnivorousPlant("Meatloaf", 0.7),  //Polymorfism
                new Palm("Olof", 1)};                   //Polymorfism

        String inputPlant = JOptionPane.showInputDialog("Vilken växt ska få vätska? (Igge, Laura, Meatloaf eller Olof)");

        for (Plant plant : plantArray)
            if (plant.name.equals(inputPlant)) {
                JOptionPane.showMessageDialog(null, "Växten behöver " + plant.liquidVolume() + " liter " + plant.liquidOfChoice() + ".");
                System.exit(0);
            }

        JOptionPane.showMessageDialog(null, "Namnet matchar inte någon av växterna.");

    }
}
