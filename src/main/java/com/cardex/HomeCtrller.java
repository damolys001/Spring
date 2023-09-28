

package com.cardex;

import com.cardex.forms.User;
import model.CardModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List; 



@Controller
public class HomeCtrller {

    @RequestMapping("/main")
    String home(){
        return "home";
    }

    @RequestMapping("/")
    String login(@Valid User user, BindingResult bindingResult){
      /*  System.out.println("userid: " + user.getUserid());
        System.out.println("password: " + user.getPassword());
        if(bindingResult.hasErrors()){
            return "login";
        }
        if(user.getUserid() == null || user.getPassword() == null){
            System.out.println("user cred is null.");
            return "login";
        }else if(user.getUserid().equals("admin") && user.getPassword().equals("password123")){
            System.out.println("user authenticated!");
            return "home";
        }else{
            System.out.println("Incorrect userid or password.");
            return "login" ;
        }
*/
        return "login" ;
    }

    @RequestMapping("/cards")
    String card(Model model){
        List<CardModel> cardList = new ArrayList<>();

  /*      CardModel cardModel = new CardModel();
        cardModel.setAccountName("John Doe");
        cardModel.setSolId("001");
        cardModel.setCardId("012");
        cardModel.setCardPan("092XXXXXXXXXX1234");
        cardModel.setRequestDate("14-12-2016");
        cardModel.setUserId("admin");
        cardModel.setPrintedBy("admin");
        cardModel.setPrintedDate("14-12-2016");
        cardModel.setStatus("ISSUED");

        CardModel cardModel1 = new CardModel();
        cardModel1.setAccountName("John Zoe");
        cardModel1.setSolId("001");
        cardModel1.setCardId("012");
        cardModel1.setCardPan("092XXXXXXXXXX1234");
        cardModel1.setRequestDate("14-12-2016");
        cardModel1.setUserId("admin");
        cardModel1.setPrintedBy("admin");
        cardModel1.setPrintedDate("14-12-2016");
        cardModel1.setStatus("UNISSUED");
        cardList.add(cardModel);
        cardList.add(cardModel1);

        model.addAttribute("cardList", cardList);
        */
        return "cards";
        
    }
}

