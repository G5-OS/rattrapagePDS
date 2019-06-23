package fr.octosoft.rattrapage.services;

import fr.octosoft.rattrapage.daos.CampaignDAO;
import fr.octosoft.rattrapage.entities.Campaign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class CampaignService {

    public CampaignService() {
    }

    @Autowired
    private CampaignDAO campaignDAO;

    @Autowired
    public CampaignService(CampaignDAO campaignDAO) {
        this.campaignDAO = campaignDAO;
    }

    // CRUD

    public void createCampaign(Campaign campaign) {
        campaignDAO.save(campaign);
    }

    public Iterable<Campaign> listCampaigns() {
        return campaignDAO.findAll();
    }

    public Iterable<Campaign> listCampaign(Long id) {
        return campaignDAO.findById(id).stream().collect(Collectors.toList());
    }

    public void deleteCampaign(Long id) {
        campaignDAO.deleteById(id);
    }
}
