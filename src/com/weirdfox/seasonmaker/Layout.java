package com.weirdfox.seasonmaker;
import javax.swing.*;
import java.awt.*;

public class Layout extends JPanel{
    public Layout() {
        //Layout settings
        BoxLayout bl = new BoxLayout(this, BoxLayout.Y_AXIS);

        setLayout(bl);

        //Lines
        JPanel prefixLayout = new JPanel(new FlowLayout());
        JPanel incSeason0Layout = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel totalSeasonsLayout = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel labelLocationLayout = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel locationLayout = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel makeLayout = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        //Labels
        JLabel lblPrefix = new JLabel("Prefix:");
        JLabel lblIncSeason0 = new JLabel("Include season 0:");
        JLabel lblTotalSeasons = new JLabel("Total seasons:");
        JLabel lblLocation = new JLabel("Location:");

        //Prefix field
        JTextField txtPrefix = new JTextField(30);

        //Include season 0 checkbox
        JCheckBox chkIncSeason0 = new JCheckBox();

        //Total seasons number
        JSpinner spnTotalSeasons = new JSpinner(new SpinnerNumberModel(1, 1, 128, 1));
        spnTotalSeasons.setPreferredSize(new Dimension(60, 20));

        //Location field
        JFileChooser fcLocation = new JFileChooser();
        fcLocation.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        JButton btnFolderChoose = new JButton("Choose");
        JTextField txtFolderChoose = new JTextField(15);
        txtFolderChoose.setEditable(false);

        //Make folders button
        JButton btnMakeFolders = new JButton("Make!");

        //Adding in layouts
        prefixLayout.add(lblPrefix);
        prefixLayout.add(txtPrefix);

        incSeason0Layout.add(lblIncSeason0);
        incSeason0Layout.add(chkIncSeason0);

        totalSeasonsLayout.add(lblTotalSeasons);
        totalSeasonsLayout.add(spnTotalSeasons);

        labelLocationLayout.add(lblLocation);

        locationLayout.add(btnFolderChoose);
        locationLayout.add(txtFolderChoose);

        makeLayout.add(btnMakeFolders);

        //Adding elements
        add(prefixLayout);
        add(incSeason0Layout);
        add(totalSeasonsLayout);
        add(labelLocationLayout);
        add(locationLayout);
        add(makeLayout);

    }
}
