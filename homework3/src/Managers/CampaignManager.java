package Managers;

import Entities.*;
import Services.*;

public class CampaignManager implements ICampaignService {

	@Override
	public void Add(Campaign campaign) {
		campaign.getGame().setPrice(campaign.getGame().getPrice() - campaign.getGame().getPrice() * campaign.getDiscount() / 100);
		System.out.println(campaign.getName() + " adl� kampanya eklendi");
	}

	@Override
	public void Update(Campaign campaign) {
		System.out.println(campaign.getName() + " adl� kampanya g�ncellendi");
	}

	@Override
	public void Delete(Campaign campaign) {
		System.out.println(campaign.getName() + " adl� kampanya silindi");
	}

}
