/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dawpuzzletemplate;

/**
 *
 * @author DAWTarde
 */
public class Ballgrid {
    private int starty;
    private int startx;
    private static final int ROWS=12;
    private static final int COLS=8;
    private static final int MIN_BALLS_CONECTED=3;
    private boolean debug;
    private Bubble bubblev[][];
   
    public Ballgrid(){
        this.bubblev = new Bubble[Ballgrid.ROWS][Ballgrid.COLS];
    }
    public Ballgrid(int startx, int starty){
    this.startx = startx;
    this.starty = starty;
    }

    public int getStarty() {
        return starty;
    }

    public void setStarty(int starty) {
        this.starty = starty;
    }

    public int getStartx() {
        return startx;
    }

    public void setStartx(int startx) {
        this.startx = startx;
    }

public boolean collision(Bubble b){
   
}
}
