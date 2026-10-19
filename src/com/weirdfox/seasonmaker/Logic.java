package com.weirdfox.seasonmaker;

import javax.swing.*;
import javax.swing.plaf.synth.SynthListUI;
import java.awt.*;
import java.io.File;
import java.security.cert.CertPathBuilderResult;

public class Logic {

    //Choose folder function
    public String chooseFolder(JFileChooser chooser, Component parent, JButton btnMakeFolders, JTextField txtFolderChoose) {
        int result = chooser.showOpenDialog(parent);
        String path = "";
        
        if (result == JFileChooser.APPROVE_OPTION){
            //Setting the path
            path = chooser.getSelectedFile().getPath();

            //Writing text field
            if (path != ""){
                txtFolderChoose.setText(path);
            }else{
                txtFolderChoose.setText("Please choose a folder...");
            }

            //Enabling the make button
            if (path != "" && !btnMakeFolders.isEnabled()){
                btnMakeFolders.setEnabled(true);
            }
        }
        
        return path;
    }

    //Create folders function
    public void createFolders(String path, JTextField txtPrefix, JSpinner spnTotalSeasons, JCheckBox chkIncSeason0, Component parent) {
        try {
            int startFrom = chkIncSeason0.isSelected() ? 0 : 1;
            int totalSeasons = (Integer) spnTotalSeasons.getValue() + 1;

            for(int i = startFrom; i < totalSeasons; i++){
                String folderName = txtPrefix.getText() + i;
                new File(path, folderName).mkdir();
            }

            JOptionPane.showMessageDialog(parent, "Successfully made folders!", "Success", JOptionPane.INFORMATION_MESSAGE);

        }catch (Exception e){
            JOptionPane.showMessageDialog(parent, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
