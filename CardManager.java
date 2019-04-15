package com.company;

import static com.company.CardType.AMEX;
import static com.company.CardType.Mastercard;
import static com.company.CardType.Visa;

public class CardManager {
    public static void main(String[] args) {
        CardInfo john=new CardInfo();
        CardHolder.getInstance().addClient(john);

        CardInfo achi=new CardInfo("1111222233334444","20/20",123,"Archili",
                "Vardidze",Visa);
        CardHolder.getInstance().addClient(achi);

        CardInfo rati= new CardInfo("1111222233334444","12/20", 777,"rati"," laitadze", Visa);
        CardHolder.getInstance().addClient(rati);
        CardInfo [] c={
                new CardInfo("4929370647252219","01/2021",386,"Beverly","Walkowiak",Visa),
                new CardInfo("4485753871439543","01/2020",126,"Susan"," Vogt",Mastercard),
                new CardInfo("5443408276597217","11/2021",656,"Anna","Maynard",AMEX),
                new CardInfo("4929557410800535","09/2040",345,"nika","Walkowiak",Visa),
                new CardInfo("4929370647252219","01/2021",386,"tornike","Walkowiak",Mastercard),
                new CardInfo("4929370647252219","01/2021",386,"malxazi","Walkowiak",Visa),
                new CardInfo("4929370647252219","01/2021",386,"oto","Walkowiak",Visa),
                new CardInfo("4929370647252219","01/2021",386,"giorgi","Walkowiak",Mastercard),
                new CardInfo("4929370647252219","01/2021",386,"nino","Walkowiak",Visa),
                new CardInfo("4929370647252219","01/2021",386,"khatia","Walkowiak",AMEX)
        };

        for(int i=0;i<c.length;i++){
            CardHolder.getInstance().addClient(c[i]);
        }

        CardHolder.getInstance().getAllCards();

        System.out.println("ბარათების რაოდენობა არის : " +CardHolder.getInstance().getSize());

        CardHolder.getInstance().removeByIdentificator(3);
        System.out.println("ახლანდელი რაოდენობა არის : "+CardHolder.getInstance().getSize());



    }
}
