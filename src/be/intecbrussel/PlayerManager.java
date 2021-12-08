package be.intecbrussel;

public class PlayerManager implements IPlayerManager{

    private IPlayerCheckManager playerCheckmanager;

    public PlayerManager (IPlayerCheckManager playerCheckManager) {
        this.playerCheckmanager = playerCheckManager;
    }


    @Override
    public void register(Player player) {
        if(playerCheckmanager.isRealPerson(player)) {
            System.out.println("Player saved: " + player.firstName);
        }else {
            System.out.println("Player Information Not Verified: " + player.firstName);
        }

    }

    @Override
    public void remove(Player player) {
        System.out.println("Player removed: " + player.firstName);

    }

    @Override
    public void update(Player player) {
        System.out.println("Player Information Updated: " + player.firstName);
    }

}
