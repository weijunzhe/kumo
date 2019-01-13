package com.kennycason.kumo.bg;

import com.kennycason.kumo.collide.Collidable;
import com.kennycason.kumo.collide.RectanglePixelCollidable;

import java.awt.*;

/**
 * Created by kenny on 6/30/14.
 */
public class CircleBackground implements Background {

    private final int radius;

    private final Point position;

    public CircleBackground(final int radius) {
        this.radius = radius;
        this.position = new Point(0, 0);
    }

    @Override
    public void mask(RectanglePixelCollidable backgroundCollidable) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    /*
    
    @Override
    public boolean isInBounds(final Collidable collidable) {
        final Point position = collidable.getPosition();
        return inCircle(position.x, position.y)
                && inCircle(position.x + collidable.getDimension().width, position.y)
                && inCircle(position.x, position.y + collidable.getDimension().height)
                && inCircle(position.x + collidable.getDimension().width, position.y + collidable.getDimension().height);
    }*/

    private boolean inCircle(final int x, final int y) {
        final int centerX = x - radius ;
        final int centerY = y - radius;
        return  (centerX * centerX) + (centerY * centerY) <= radius * radius;
    }

}
