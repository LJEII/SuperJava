package com.lyndenjayevansjr.superjava;


import com.jme3.app.SimpleApplication;
import com.jme3.math.Vector3f;
import com.jme3.renderer.RenderManager;

/**
 * 
 * @Authorship Lynden Jay Evans
 * @Copyright Lynden Jay Evans
 * @FOSS Lynden Jay Evans
 * @Patent Lynden Jay Evans
 */
public class SuperJavaLocal extends SimpleApplication {

    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    @Override
    public void simpleInitApp() {
      Pixel pixel = new Pixel(this, new Vector3f(0f,0f,0f), 1f);
    }

    @Override
    public void simpleUpdate(float tpf) {
        //TODO: add update code
    }

    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code
    }
}