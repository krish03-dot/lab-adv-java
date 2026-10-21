import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            View theView = new View();
            Model theModel = new Model();
            new Controller(theView, theModel);
            theView.setVisible(true);
        });
    }
}
