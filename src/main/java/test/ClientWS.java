package test;

import proxy.CalculatriceWS;
import proxy.CalculatriceWSService;

public class ClientWS {
    public static void main(String[] args) {

        CalculatriceWS calculatriceWS=new CalculatriceWSService().getCalculatriceWSPort();
        double rs =calculatriceWS.somme(4,9);
        double rss =calculatriceWS.soustraction(4,9);
        double rm =calculatriceWS.multiplication(4,9);
        double rd =calculatriceWS.division(4,9);
       // double rdd =calculatriceWS.division(4,0);
        System.out.println(rs);
        System.out.println(rss);
        System.out.println(rm);
        System.out.println(rd);
      //  System.out.println(rdd);
    }
}
