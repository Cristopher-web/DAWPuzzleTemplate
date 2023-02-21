/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dawpuzzletemplate;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author DAWTarde
 */
public class Shuttle {
   private float angle;
   private Bubble Actual;
   private Bubble Siguiente;
   private Float Incr;
   private Point2D Center;
   private static final float MIN_ANGLE=0f;
   private static final float MAX_ANGLE=180.0f;
   private boolean debug;

    public Shuttle(){
        this.angle = angle;
        this.Actual = Actual;
        this.Siguiente = Siguiente;
        this.Incr = Incr;
        this.Center = Center;
        this.debug = debug;
    }
    public Shuttle(Point2D Center) {
        this.Center = Center;
    }
      /**
     * @return the Actual
     */
    public Bubble getActual() {
        return Actual;
    }
    /**
     * @param debug the debug to set
     */
    public void setDebug(boolean debug) {
        this.debug = debug;
    }
    private Bubble generateBall(){
        this.Actual.init(Center, MIN_ANGLE);
        return this.Actual;
    }
    public void paint(GraphicsContext gc){
        Resources r = Resources.getInstance();
        gc.drawImage(r.getImage("ruleta"),
        
    }
    public void moveRight(){
        
    }
    private void updateAngle(){
        
    }
    public void moveLeft(){
        
    }
  
    public boolean isDebug(){
        return this.debug;
    }
    
    public void TicTac(){
        
    }
}
