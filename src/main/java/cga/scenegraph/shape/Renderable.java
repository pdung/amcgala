package cga.scenegraph.shape;

import cga.scenegraph.camera.Camera;
import cga.scenegraph.renderer.Renderer;

/**
 * Created by IntelliJ IDEA.
 * User: lichtsprung
 * Date: 2/22/11
 * Time: 2:59 AM
 * To change this template use File | Settings | File Templates.
 */
public interface Renderable {
    void render(Camera camera, Renderer renderer);
}
