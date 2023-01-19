/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.evaluacion03;

/**
 *
 * @author Jose
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FiguraEnVentana extends JFrame {

  private int clickCount = 0;
  private int[] xPoints = new int[3];
  private int[] yPoints = new int[3];

  public FiguraEnVentana() {
    setTitle("Figura en Ventana");
    setSize(500, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);

    addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        xPoints[clickCount] = e.getX();
        yPoints[clickCount] = e.getY();
        clickCount++;
        if (clickCount == 3) {
          Graphics g = getGraphics();
          g.drawLine(xPoints[0], yPoints[0], xPoints[1], yPoints[1]);
          g.drawLine(xPoints[1], yPoints[1], xPoints[2], yPoints[2]);
          g.drawLine(xPoints[2], yPoints[2], xPoints[0], yPoints[0]);
        }
      }
    });
  }}
  
