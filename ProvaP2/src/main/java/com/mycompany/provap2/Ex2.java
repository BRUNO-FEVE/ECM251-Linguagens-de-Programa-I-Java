/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.provap2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author bruno-fevereiro
 */
public class Ex2 extends JFrame implements ActionListener{
    private JTextField mUmPUm, mUmPDois, mUmPtres, mUmPQuatro, mUmTUm, mUmtDois, mUmMP, mUmMT, mUmMF;
    private JTextField mDoisPUm, mDoisPDois, mDoisPtres, mDoisPQuatro, mDoisTUm, mDoistDois, mDoisMP, mDoisMT, mDoisMF;
    private JTextField mTresPUm, mTresPDois, mTresPtres, mTresPQuatro, mTresTUm, mTrestDois, mTresMP, mTresMT, mTresMF;
    private JTextField mQuatroPUm, mQuatroPDois, mQuatroPtres, mQuatroPQuatro, mQuatroTUm, mQuatrotDois,  mQuatroMP, mQuatroMT, mQuatroMF;

    private JTextField pUm, pDois, pTres, pQuatro;

    private JLabel materia, tUm, tDois, mp, mt, mf, tPUm, tPDois, tPTres, tPQuatro;

    private JButton ler, save, sair;

    private JPanel grid, top, bottom;

    private Container caixa;

    public Connection conn;

    public Ex2() {
        setTitle("IMT - Cálculo das Médias por Matéria");

        Connection conn = null;

        caixa = new Container();
        caixa.setLayout(new BorderLayout());

        grid = new JPanel(new GridLayout(4,10));
        top = new JPanel(new GridLayout(1, 10));
        bottom = new JPanel(new FlowLayout());

        pUm = new JTextField("MATÉRIA 1");
        pDois = new JTextField("MATÉRIA 2");
        pTres = new JTextField("MATÉRIA 3");
        pQuatro = new JTextField("MATÉRIA 4");

        mUmPUm = new JTextField("");
        mUmPDois = new JTextField("");   
        mUmPtres = new JTextField("");
        mUmPQuatro = new JTextField("");       

        mUmTUm = new JTextField("");
        mUmtDois = new JTextField("");
        
        mUmMP = new JTextField("");
        mUmMT = new JTextField("");
        mUmMF = new JTextField("");

        // -----------

        mDoisPUm = new JTextField("");
        mDoisPDois = new JTextField("");   
        mDoisPtres = new JTextField("");
        mDoisPQuatro = new JTextField("");       

        mDoisTUm = new JTextField("");
        mDoistDois = new JTextField("");
        
        mDoisMP = new JTextField("");
        mDoisMT = new JTextField("");
        mDoisMF = new JTextField("");

        // --------

        mTresPUm = new JTextField("");
        mTresPDois = new JTextField("");   
        mTresPtres = new JTextField("");
        mTresPQuatro = new JTextField("");       

        mTresTUm = new JTextField("");
        mTrestDois = new JTextField("");
        
        mTresMP = new JTextField("");
        mTresMT = new JTextField("");
        mTresMF = new JTextField("");

        // -----------

        mQuatroPUm = new JTextField("");
        mQuatroPDois = new JTextField("");   
        mQuatroPtres = new JTextField("");
        mQuatroPQuatro = new JTextField("");       

        mQuatroTUm = new JTextField("");
        mQuatrotDois = new JTextField("");
        
        mQuatroMP = new JTextField("");
        mQuatroMT = new JTextField("");
        mQuatroMF = new JTextField("");

        // TITOLU COLUNA

        materia = new JLabel("Matéria");
        tPUm = new JLabel("P1");
        tPDois = new JLabel("P2");
        tPTres = new JLabel("T1");
        tPQuatro = new JLabel("P3");
        tUm = new JLabel("P4");
        tDois = new JLabel("T2");
        mp = new JLabel("MP");
        mt = new JLabel("MT");
        mf = new JLabel("MF");

        ler = new JButton("Ler do BD");
        save = new JButton("Salvar no BD");
        sair = new JButton("Sair");

        ler.addActionListener(this);
        save.addActionListener(this);
        sair.addActionListener(this);

        top.add(materia);
        top.add(tPUm);
        top.add(tPDois);
        top.add(tUm);
        top.add(tPTres);
        top.add(tPQuatro);
        top.add(tDois);
        top.add(mp);
        top.add(mt);
        top.add(mf);

        grid.add(pUm);
        grid.add(mUmPUm);
        grid.add(mUmPDois);
        grid.add(mUmTUm);
        grid.add(mUmPtres);
        grid.add(mUmPQuatro);
        grid.add(mUmtDois);
        grid.add(mUmMP);
        grid.add(mUmMT);
        grid.add(mUmMF);

        grid.add(pDois);
        grid.add(mDoisPUm);
        grid.add(mDoisPDois);
        grid.add(mDoisTUm);
        grid.add(mDoisPtres);
        grid.add(mDoisPQuatro);
        grid.add(mDoistDois);
        grid.add(mDoisMP);
        grid.add(mDoisMT);
        grid.add(mDoisMF);

        grid.add(pTres);
        grid.add(mTresPUm);
        grid.add(mTresPDois);
        grid.add(mTresTUm);
        grid.add(mTresPtres);
        grid.add(mTresPQuatro);
        grid.add(mTrestDois);
        grid.add(mTresMP);
        grid.add(mTresMT);
        grid.add(mTresMF);

        grid.add(pQuatro);
        grid.add(mQuatroPUm);
        grid.add(mQuatroPDois);
        grid.add(mQuatroTUm);
        grid.add(mQuatroPtres);
        grid.add(mQuatroPQuatro);
        grid.add(mQuatrotDois);
        grid.add(mQuatroMP);
        grid.add(mQuatroMT);
        grid.add(mQuatroMF);

        bottom.add(ler);
        bottom.add(save);
        bottom.add(sair);

        caixa.add(top, BorderLayout.NORTH);
        caixa.add(grid, BorderLayout.CENTER);
        caixa.add(bottom, BorderLayout.SOUTH);

        add(caixa);

        pack();
        setLocationRelativeTo(null);
        setSize(600, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sair) {
            setVisible(false);
        } else if (e.getSource() == ler) {
            String sqlGetData = "SELECT M1P1, M1P2, M1P3, M1P4, M1T1, M1T2 FROM NOTAS WHERE nome = ?";
        }
    }
}
