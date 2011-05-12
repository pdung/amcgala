package cga.scenegraph.shape;

import cga.scenegraph.camera.Camera;
import cga.scenegraph.math.Vector3d;
import cga.scenegraph.renderer.Renderer;

/**
 * Eine Linie im 3d Raum.
 * @author Robert Giacinto
 */
public class Line3d extends Renderable {

  public double x1, y1, z1;
  public double x2, y2, z2;
  private Vector3d start, end;

  public Line3d(Vector3d start, Vector3d end) {
    x1 = start.x;
    y1 = start.y;
    z1 = start.z;

    x2 = end.x;
    y2 = end.y;
    z2 = end.z;

    this.start = new Vector3d(x1, y1, z1);
    this.end = new Vector3d(x2, y2, z2);

  }

  @Override
  public void render(Camera camera, Renderer renderer) {
    start = new Vector3d(x1, y1, z1);
    end = new Vector3d(x2, y2, z2);
    
    
  }
}
