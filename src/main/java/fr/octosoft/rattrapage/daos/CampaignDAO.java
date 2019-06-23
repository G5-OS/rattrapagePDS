package fr.octosoft.rattrapage.daos;

import fr.octosoft.rattrapage.entities.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampaignDAO extends JpaRepository<Campaign, Long> {
}

