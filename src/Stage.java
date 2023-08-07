import java.awt.Color;
import java.util.Random;

public class Stage {

    Random random = new Random();
    static int actorAmount;
    Grid grid = new Grid();
    Actor[] actors = new Actor[actorAmount];


    public void initialiseActors() {
        actors[0] = Actor.createActor(random.nextInt(grid.cells.length - 0), random.nextInt(grid.cells.length - 0), "Cat", Color.BLUE);
        actors[1] = Actor.createActor(random.nextInt(grid.cells.length - 0), random.nextInt(grid.cells.length - 0), "Dog", Color.YELLOW);
        actors[2] = Actor.createActor(random.nextInt(grid.cells.length - 0), random.nextInt(grid.cells.length - 0), "Bird", Color.GREEN);
    }

    public Actor[] returnActors()
    {
        return actors;
    }
}
