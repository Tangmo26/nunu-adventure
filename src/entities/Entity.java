package entities;

import java.awt.Graphics;
import java.awt.geom.Rectangle2D;

public abstract class Entity {
    
    protected float x,y ;
    protected int width, height ;
    protected Rectangle2D.Float hitbox ;
    
    public Entity(float x,float y,int width, int height){
        this.x = x ;
        this.y = y ;
        this.width = width ;
        this.height = height ;
    }
    
    protected void drawHitbox(Graphics g, int xLvlOffset){}

    protected void initHitbox(float x,float y,int width,int height) {
        hitbox = new Rectangle2D.Float(x,y,width,height) ;   
    }

    public Rectangle2D.Float getHitbox (){
        return hitbox ;
    }
    
    public abstract void update() ;
    public abstract void render(Graphics g, int lvlOffset) ;
    
}

