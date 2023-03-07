/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dawpuzzletemplate;
import javafx.scene.canvas.GraphicsContext;
import javafx.geometry.Point2D;

/**
 *
 * @author DAWTarde
 */
public class Ballgrid {
 private int startx;
    private int starty;
    private static final int ROWS= 12;
    private static final int COLS= 8;
    private static final int MIN_BALLS_CONECT= 3;
    private Bubble bubblegrid[][];
    
    public Ballgrid(){
        this.bubblegrid = new Bubble[Ballgrid.ROWS][Ballgrid.COLS];
    }
    public Ballgrid(int startx, int starty){
        this.bubblegrid = new Bubble[Ballgrid.ROWS][Ballgrid.COLS];
        this.startx = startx;
        this.starty = starty;
    }
    public Ballgrid(BubbleType matrix[][],int startx, int starty){
        this.bubblegrid = new Bubble[Ballgrid.ROWS][Ballgrid.COLS];
        this.startx = startx;
        this.starty = starty;
        //matrix = BubbleType.values();
    }

    /**
     * @return the startx
     */
    public int getStartx() {
        return startx;
    }

    /**
     * @param startx the startx to set
     */
    public void setStartx(int startx) {
        this.startx = startx;
    }

    /**
     * @return the starty
     */
    public int getStarty() {
        return starty;
    }

    /**
     * @param starty the starty to set
     */
    public void setStarty(int starty) {
        this.starty = starty;
    }
    
    //La colision en la primera fila del grid
    public boolean colision(Bubble b){
        int f=0,c;
        if(b.getPosicion().getY() - (Bubble.WIDTH / 2) <= this.starty){
            b.stop();
            c=(int)((b.getPosicion().getX()-this.startx)/16);
            this.bubblegrid[f][c]=b;
            //Asigna la posicion de la bola en la primera fila del grid o vector de bolas.
            b.setPosicion(new Point2D(this.startx+Bubble.WIDTH*c+Bubble.WIDTH/2,this.starty+Bubble.HEIGHT*f+Bubble.WIDTH/2));
            return true;
        }else{
            boolean collision = false;
            for(int i=0; i<this.bubblegrid.length && !collision;i++){
                for(int j=0; j<this.bubblegrid[i].length && !collision;j++){
                           
        }
    }
     return false;
    }
}
   public void paint(GraphicsContext gc){
        for(int i=0; i<this.bubblegrid.length;i++){
            for(int j=0; j<this.bubblegrid[i].length;j++){
               if(this.bubblegrid[i][j] != null)
                this.bubblegrid[i][j].paint(gc);
                 
            }
        }
    }
   
}