import java.util.List;

public class Simulation {
    private List<Particle> particles;
    private ForceField forceField;
    private Integrator integrator;
    private BoundaryCondition boundaryCondition;
    private Thermostat thermostat;
    private Logger logger;
    private int steps;

    public Simulation(List<Particle> particles, int steps) {
        this.particles = particles;
        this.forceField = new ForceField();
        this.integrator = new Integrator();
        this.boundaryCondition = new BoundaryCondition();
        this.thermostat = new Thermostat();
        this.logger = new Logger();
        this.steps = steps;
    }

    public void run() {
        for (int i = 0; i < steps; i++) {
            forceField.calculateForces(particles);
            integrator.update(particles);
            boundaryCondition.apply(particles);
            thermostat.apply(particles);
            logger.log(particles, i);
        }
    }
}