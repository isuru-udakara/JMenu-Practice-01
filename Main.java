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
    // nested menu
    JMenu mNew, mAppearance, mPanelPosition, mAlignPanel;
    // items for file menu
    JMenuItem iNewFile, iNewFolder, iNewWindow, iOpenFile, iOpenFolder, iSave, iSaveAs, iExit;
    JMenuItem iUndo, iRedo, iCut, iCopy, iPaste, iFind, iReplace;
    JMenuItem iFullScreen, iMaximize, iMinimize, iTop, iLeft, iRight, iCenter, iJustify, iLeftP, iRightP;
    JMenuItem iDocumentation, iViewLicense, iReportIssue, iPrivacyStatement, iUpdate, iAbout;
    public Main(){
        CreateWindow();
        CreateMenuBar();
        CreateMenu();
        CreateFileMenu();
        CreateEditMenu();
        CreateViewMenu();
        CreateHelpMenu();
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

        mNew= new JMenu("New");
        mFile.add(mNew);

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
        mNew.add(iNewFile);

        iNewFolder= new JMenuItem("New Folder");
        mNew.add(iNewFolder);

        iNewWindow= new JMenuItem("New Window");
        mNew.add(iNewWindow);

        iOpenFile= new JMenuItem("Open File");
        mFile.add(iOpenFile);

        iOpenFolder= new JMenuItem("Open Folder");
        mFile.add(iOpenFolder);

        iSave= new JMenuItem("Save");
        mFile.add(iSave);

        iSaveAs= new JMenuItem("Save As");
        mFile.add(iSaveAs);

        iExit= new JMenuItem("Exit");
        mFile.add(iExit);
    }

    private void CreateEditMenu(){
        iUndo= new JMenuItem("Undo");
        mEdit.add(iUndo);

        iRedo= new JMenuItem("Redo");
        mEdit.add(iRedo);

        iCut= new JMenuItem("Cut");
        mEdit.add(iCut);

        iCopy= new JMenuItem("Copy");
        mEdit.add(iCopy);

        iPaste= new JMenuItem("Paste");
        mEdit.add(iPaste);

        iFind= new JMenuItem("Find");
        mEdit.add(iFind);

        iReplace= new JMenuItem("Replace");
        mEdit.add(iReplace);
    }
   
    private void CreateViewMenu(){
        mAppearance= new JMenu("Appearance");
        mView.add(mAppearance);

        iFullScreen= new JMenuItem("Full Screen");
        mAppearance.add(iFullScreen);

        iMaximize= new JMenuItem("Maximize");
        mAppearance.add(iMaximize);

        iMinimize= new JMenuItem("Minimize");
        mAppearance.add(iMinimize);

        mPanelPosition= new JMenu("Panel Position");
        mView.add(mPanelPosition);

        iTop= new JMenuItem("Top");
        mPanelPosition.add(iTop);

        iLeft= new JMenuItem("Left");
        mPanelPosition.add(iLeft);

        iRight= new JMenuItem("Right");
        mPanelPosition.add(iRight);

        mAlignPanel= new JMenu("Align Panel");
        mView.add(mAlignPanel);

        iCenter= new JMenuItem("Center");
        mAlignPanel.add(iCenter);

        iJustify= new JMenuItem("Justify");
        mAlignPanel.add(iJustify);

        iLeftP= new JMenuItem("Left");
        mAlignPanel.add(iLeftP);

        iRightP= new JMenuItem("Right");
        mAlignPanel.add(iRightP);
    }
  
    private void CreateHelpMenu(){
        iDocumentation= new JMenuItem("Documentation");
        mHelp.add(iDocumentation);

        iViewLicense= new JMenuItem("View License");
        mHelp.add(iViewLicense);

        iReportIssue= new JMenuItem("Report Issue");
        mHelp.add(iReportIssue);
    }
    public static void main(String args[]){
        new Main();
    }
}