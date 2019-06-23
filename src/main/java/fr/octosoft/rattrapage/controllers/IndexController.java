package fr.octosoft.rattrapage.controllers;

import fr.octosoft.rattrapage.entities.Client;
import fr.octosoft.rattrapage.mocks.MajorMock;
import fr.octosoft.rattrapage.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class IndexController {

    @Autowired
    ClientService clientService;

    @Value("${login.error}")
    private String loginError;

    @Value("${registration.information.error}")
    private String registrationInformationError;

    @Value("${registration.password.error}")
    private String registrationPasswordError;

    @ModelAttribute(value = "client")
    public Client newClient()
    {
        return new Client();
    }

    @GetMapping(value = { "/", "/index" })
    public String index(Model model) {
        Client client = new Client();
        model.addAttribute(client);
        MajorMock mm = new MajorMock();
        mm.createStores();
        mm.createProducts();
        mm.createClients();
        mm.createTransactions();
        return "login";
    }

    @PostMapping(value = { "/logPerson" })
    public String loggedPerson(Model model, @ModelAttribute("client") Client client) {
        model.addAttribute("client", client);
        model.addAttribute("clientFname", client.getFname());
        model.addAttribute("clientLname", client.getLname());
        if(clientService.existsByLogs(client)) {
            return "welcome";
        }
        model.addAttribute("loginError", loginError);
        return "login";
    }

    @GetMapping(value = { "/welcome" })
    public String homepage(Model model, @ModelAttribute("client") Client client) {
        model.addAttribute(client);
        return "welcome";
    }

    @PostMapping(value = { "/logout"})
    public String logOutPerson(Model model, @ModelAttribute("client") Client client) {
        return "redirect:/";
    }

    @GetMapping(value={"/suggestionCampaignMenu"})
    public String suggestionCampaignMenu() {
        return "suggestionCampaignMenu";
    }

    @GetMapping(value={"/launchSuggestionCampaign"})
    public String suggestionCampaignLaunch() {
        return "launchSuggestionCampaign";
    }

    @GetMapping(value={"/suggestionCampaignList"})
    public String suggestionCampaignList() {
        return "listSuggestionCampaign";
    }
}
