package kr.ac.hansung.cse.controller;

import jakarta.servlet.http.HttpServletRequest;
import kr.ac.hansung.cse.model.Offer;
import kr.ac.hansung.cse.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class OfferController {
    //Controller -> Service -> Dao
    @Autowired
    private OfferService offerService;

    @GetMapping("/offers") // /offers라고 하는 url을 처리하는 메소드를 만들기
    public String showOffers(Model model) {
        List<Offer> offers = offerService.getAllOffers();
        model.addAttribute("id_offers", offers);

        return "offers";
    }
}
