package com.gameshopcorp.supershapes;

import com.jme3.math.Vector3f;

import java.util.HashMap;

public class SuperCircle {

    public Vector3f origin;
    public Vector3f anchor;
    public byte numPoints;
    public HashMap<Float, Vector3f> degreeVectors;
    public SuperCircle(Vector3f origin, Vector3f anchor, byte numPoints){

        this.origin = origin;
        this.anchor = anchor;
        this.numPoints = numPoints;
        this.degreeVectors = new HashMap<>();
    }

    public void make(){

        for (int i = 0; i < numPoints; i++){

        }
    }

    public void cull(){

    }

    public void render(){

    }





}
