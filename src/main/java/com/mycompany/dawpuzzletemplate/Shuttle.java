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
   private Bubble actual;
   private Bubble siguiente;
   private Float Incr=180f/128f;
   private Point2D center;
   private static final float MIN_ANGLE=0f;
   private static final float MAX_ANGLE=180.0f;
   private boolean debug;

   
    public Shuttle(Point2D center) {
        this.center = center;
        this.actual = new Bubble();
        this.angle = 0.0f;
        this.siguiente = new Bubble();
    }
      /**
     * @return the Actual
     */
    public Bubble getActual() {
        return actual;
    }
    /**
     * @param debug the debug to set
     */
    public void setDebug(boolean debug) {
        this.debug = debug;
    }
    private Bubble generateBall(){
        Bubble temp;
        temp = new Bubble();
        temp.setBalltype(BubbleType.values()[ (int)(Math.random()*BubbleType.values().length)]);
       return temp;
    }
    public void shoot(){
        
    }
    public void paint(GraphicsContext gc){
        Resources r = Resources.getInstance();
        gc.drawImage(r.getImage("spriters"), 1,
        1805,
        61,
        41,
        (this.center.getX() - 60 / 2) * Game.SCALE,
        (this.center.getY() - 40 / 2) * Game.SCALE,
        61 * Game.SCALE,
        41 * Game.SCALE);
    }
    public void moveRight(){
        this.angle-=this.Incr;
        if(this.angle>Shuttle.MAX_ANGLE){
            this.angle=Shuttle.MAX_ANGLE;
        }
    }
    public void moveLeft(){
             this.angle+=this.Incr;
        if(this.angle>Shuttle.MIN_ANGLE){
            this.angle=Shuttle.MIN_ANGLE;
        }
    }
    private void updateAngle(){
     
    }
    public boolean isDebug(){
        return this.debug;
    }
    
    public void TicTac(){
        
    }
}
