package HM7;
public class Player {
    private String name;
    private double endurance;
    private double sprint;
    private double dribble;
    private double passing;
    private double shooting;

    public Player(String name, double endurance, double sprint, double dribble, double passing, double shooting) {
        this.name = name;
        this.endurance = validateStat(endurance);
        this.sprint = validateStat(sprint);
        this.dribble = validateStat(dribble);
        this.passing = validateStat(passing);
        this.shooting = validateStat(shooting);
    }

    private double validateStat(double stat) {
        if (stat < 0 || stat > 100) {
            throw new IllegalArgumentException("Invalid stat value: " + stat + ". Stat values must be between 0 and 100.");
        }
        return stat;
    }

    public double calculateSkillLevel() {
        double totalStats = endurance + sprint + dribble + passing + shooting;
        return totalStats / 5.0;
    }

    public String getName() {
        return name;
    }
}