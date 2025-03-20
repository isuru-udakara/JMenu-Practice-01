import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;

public class Main{
    JFrame window;
    JMenuBar menuBar;
    JMenu mFile, mEdit, mView, mHelp;
    // items for file menu
    JMenuItem iNewFile, iNewFolder, iOpenFile, iOpenFolder, iSave, iSaveAs, iExit;
    public Main(){
        CreateWindow();
        CreateMenuBar();
        CreateMenu();
        CreateFileMenu();

        // make visible all components 
        window.setVisible(true);
    }

    private void CreateWindow(){
        window= new JFrame();
        window.setTitle("JMenu Practice");
        window.setResizable(true);
        window.setSize(800, 600);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(new Color(100, 200, 150));
        ImageIcon icon= new ImageIcon("icon.png");
        window.setIconImage(icon.getImage());
    }

    private void CreateMenuBar(){
        menuBar= new JMenuBar();
        window.setJMenuBar(menuBar);
    }

    private void CreateMenu(){
        mFile= new JMenu("File");
        menuBar.add(mFile);

        mEdit= new JMenu();
        mEdit.setText("Edit");
        menuBar.add(mEdit);

        mView= new JMenu("View");
        menuBar.add(mView);

        mHelp= new JMenu("Help");
        menuBar.add(mHelp);
    }

    private void CreateFileMenu(){
        iNewFile= new JMenuItem("New File");
        mFile.add(iNewFile);

        iNewFolder= new JMenuItem("New Folder");
        mFile.add(iNewFolder);

        iOpenFile= new JMenuItem("Open File");
        mFile.add(iOpenFile);
    }

    public static void main(String args[]){
        new Main();
    }
}