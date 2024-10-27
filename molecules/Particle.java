public class Particle {
    private double[] position;
    private double[] velocity;
    private double[] force;
    private double mass;

    public Particle(double[] position, double[] velocity, double mass) {
        this.position = position;
        this.velocity = velocity;
        this.force = new double[3];
        this.mass = mass;
    }

    public double[] getPosition() { return position; }
    public double[] getVelocity() { return velocity; }
    public double[] getForce() { return force; }
    public double getMass() { return mass; }

    public void setPosition(double[] position) { this.position = position; }
    public void setVelocity(double[] velocity) { this.velocity = velocity; }
    public void setForce(double[] force) { this.force = force; }
}