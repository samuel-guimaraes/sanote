package com.samg.sanote.gui;

import javax.swing.JPanel;

/**
 * Painel principal da aplicação
 */
public class PrincipalPane extends JPanel {

    /**
     * Inicialização gráfica dos componentes.
     */
    public PrincipalPane() {
        initComponents();
    }

    private void adicionarAba() {
        System.out.println(tabbedPane.getSelectedIndex());
        Tab aba = new Tab();
        tabbedPane.addTab("", aba);
    }

    private void removerAbaAtual() {
        tabbedPane.removeTabAt(tabbedPane.getSelectedIndex());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPane = new javax.swing.JTabbedPane();
        footerPanel = new javax.swing.JPanel();
        buttonNewTab = new javax.swing.JButton();
        buttonCloseTab = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(328, 540));
        setLayout(new java.awt.BorderLayout());

        tabbedPane.setName(""); // NOI18N
        add(tabbedPane, java.awt.BorderLayout.CENTER);

        footerPanel.setPreferredSize(new java.awt.Dimension(25, 25));
        footerPanel.setRequestFocusEnabled(false);

        buttonNewTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_add_tab.png"))); // NOI18N
        buttonNewTab.setBorderPainted(false);
        buttonNewTab.setContentAreaFilled(false);
        buttonNewTab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonNewTab.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonNewTab.setPreferredSize(new java.awt.Dimension(25, 25));
        buttonNewTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonNewTabMouseClicked(evt);
            }
        });

        buttonCloseTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_remove_tab.png"))); // NOI18N
        buttonCloseTab.setToolTipText("");
        buttonCloseTab.setBorderPainted(false);
        buttonCloseTab.setContentAreaFilled(false);
        buttonCloseTab.setPreferredSize(new java.awt.Dimension(25, 25));
        buttonCloseTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCloseTabMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout footerPanelLayout = new javax.swing.GroupLayout(footerPanel);
        footerPanel.setLayout(footerPanelLayout);
        footerPanelLayout.setHorizontalGroup(
            footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(buttonNewTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(buttonCloseTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 230, Short.MAX_VALUE))
        );
        footerPanelLayout.setVerticalGroup(
            footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonNewTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCloseTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(footerPanel, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonNewTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonNewTabMouseClicked
        adicionarAba();
    }//GEN-LAST:event_buttonNewTabMouseClicked

    private void buttonCloseTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCloseTabMouseClicked
        removerAbaAtual();
    }//GEN-LAST:event_buttonCloseTabMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCloseTab;
    private javax.swing.JButton buttonNewTab;
    private javax.swing.JPanel footerPanel;
    private javax.swing.JTabbedPane tabbedPane;
    // End of variables declaration//GEN-END:variables
}
