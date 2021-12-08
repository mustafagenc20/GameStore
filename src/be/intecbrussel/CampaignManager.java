package be.intecbrussel;

public class CampaignManager implements ICampaignManager{
    double newPrice;

    @Override
    public void addCampaign(Product product, Campaign campaign) {
        newPrice = product.price - product.price*campaign.discount/100;
        System.out.println(product.productName + " Product " + campaign.campaignName + " % " + campaign.discount + " discount");
        System.out.println(product.productName + " New price of selected item: " + newPrice);

    }

    @Override
    public void updateCampaign(Product product, Campaign campaign, String newCampaign, double discount) {
        campaign.setCampaignName(newCampaign);
        campaign.setDiscount(discount);
        newPrice = product.price - product.price*campaign.discount/100;
        System.out.println("New campaign");
        System.out.println(product.productName + " Product " + campaign.campaignName + " % " + discount + " discount");
        System.out.println(product.productName + " New price of selected item: " + newPrice);

    }

    @Override
    public void removeCampaign(Product product, Campaign campaign) {
        System.out.println(product.productName + " From this product " + campaign.campaignName + " campaign removed." );
        System.out.println(product.productName + " Price of selected item: " + product.price );
        campaign.setCampaignName("");
        campaign.setDiscount(0);

    }
}
