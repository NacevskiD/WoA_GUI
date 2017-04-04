package com.david;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Scanner;

/**
 * Created by David on 4/3/2017.
 */
public class GUI extends JFrame {


    private JTextField enterProjectNameTextField;
    private JCheckBox programmers10CheckBox;
    private JCheckBox firmDeadlineAndFixedCheckBox;
    private JCheckBox programmersExp;
    private JCheckBox stringentQualityControlRequirementsCheckBox;
    private JCheckBox earlyIntegrationIsDesirableCheckBox;
    private JCheckBox workingModelsEarlyInCheckBox;
    private JPanel rootPanel;
    private JButton recommendButton;
    private JLabel results;


    boolean programmers;
    boolean schedule;
    boolean experience;
    boolean quality;
    boolean integration;
    boolean wModels;

    protected GUI(){
        setContentPane(rootPanel);
        pack();
        setTitle("Decision Maker");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        programmers10CheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                programmers = programmers10CheckBox.isSelected();

            }
        });
        firmDeadlineAndFixedCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                schedule = firmDeadlineAndFixedCheckBox.isSelected();

            }
        });
        programmersExp.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                experience = programmersExp.isSelected();

            }
        });
        stringentQualityControlRequirementsCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                quality = stringentQualityControlRequirementsCheckBox.isSelected();

            }
        });
        earlyIntegrationIsDesirableCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                integration = earlyIntegrationIsDesirableCheckBox.isSelected();

            }
        });
        workingModelsEarlyInCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                wModels = workingModelsEarlyInCheckBox.isSelected();
            }
        });
        recommendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                update();
            }
        });
    }

    void update(){
        int waterfall =0;
        int agile = 0 ;

        if (programmers){
            waterfall++;
        }
        else {
            agile++;
        }
        if (schedule){
            waterfall++;
        }
        else {
            agile++;
        }
        if (experience){
            agile++;
        }
        else {
            waterfall++;
        }
        if (quality){
            waterfall++;
        }
        else {
            agile++;
        }
        if (integration){
            agile++;
        }
        else {
            waterfall++;
        }
        if (wModels){
            agile++;
        }
        else {
            waterfall++;
        }
        if (waterfall > 3){
            results.setText(enterProjectNameTextField.getText() + " should you the waterfall system.");
        }
        else if (agile >3){
            results.setText(enterProjectNameTextField.getText() + " should use the agile system");
        }
        else {
            results.setText(enterProjectNameTextField.getText() + " either system would work.");
        }

    }

}





