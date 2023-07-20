import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame object = new JFrame();
        GamePlay gamePlay = new GamePlay();
        object.setBounds(10, 10, 700, 600); // to set the position and size of a component within its container
        object.setTitle("Brick Breaker II");
        object.setResizable(false);
        object.setVisible(true);
        object.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // starting game play
        object.add(gamePlay);

    }
}
