
public class TicTacToe {
    
        public static void main(String args[]) {
        Controller kontroller=new Controller();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                kontroller.view.setVisible(true);
            }
        });
    }
}
