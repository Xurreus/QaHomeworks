package HM7;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Jose", 25.32, 12.76, 17, 57, 90);
        Player player2 = new Player("Diego", 70, 67, 85, 76, 9);

        Team team = new Team("Real Madrid");

        team.addPlayer(player1);
        team.addPlayer(player2);

        double teamRating = team.calculateTeamRating();

        System.out.println("Barca rating: " + teamRating);

        for (Player player : team.getPlayers()) {
            System.out.println(player.getName() + ": " + player.calculateSkillLevel());
        }
    }
}
