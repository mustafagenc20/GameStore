package be.intecbrussel;

public class Main {

    public static void main(String[] args) {

        Player player1 = new Player(1, "Mustafa", "Genc", 1983, "123123123");

        PlayerManager playerManager = new PlayerManager(new PlayerCheckManager());

        playerManager.register(player1);
        playerManager.remove(player1);
        playerManager.update(player1);

        Product playStation = new Product(1, "PlayStation", 8700);

        Campaign campaign = new Campaign("game", 20);

        SalesManager salesManager = new SalesManager(campaign);

        CampaignManager campaignManager = new CampaignManager();
        campaignManager.addCampaign(playStation, campaign);
        campaignManager.updateCampaign(playStation, campaign, "game1", 25);

        salesManager.buy(player1, playStation);

        campaignManager.removeCampaign(playStation, campaign);

        salesManager.buy(player1, playStation);
    }


}
