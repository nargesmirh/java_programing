package model;

import java.util.List;

public class ClientServ {
    private ClientServ(){
    }
    private static ClientServ clientServ=new ClientServ();
    public static ClientServ getInstance(){
        return clientServ;
    }
    public List<ClientEnti> check(ClientEnti clientEnti) throws Exception{
        List<ClientEnti> clientEntis;
        try (ClientRepo personRepo=new ClientRepo ()){
            clientEntis=personRepo.select (clientEnti);
        }
        return clientEntis;
    }
    public void save(ClientEnti clientEnti) throws Exception{
        try (ClientRepo personRepo = new ClientRepo ()) {
            //if(clientEnti.getId()==1){
                //clientEnti.setInternet_size(clientEnti.getInternet_size()+2);
                //clientEnti.setPrice(clientEnti.getPrice()+1000);
                personRepo.update (clientEnti);
                personRepo.commit ();
            //}else if (clientEnti.getId()==2){
               // clientEnti.setInternet_size(clientEnti.getInternet_size()+4);
               // clientEnti.setPrice(clientEnti.getPrice()+2000);
                personRepo.update (clientEnti);
                personRepo.commit ();
            //}else if (clientEnti.getId()==3){
               // clientEnti.setInternet_size(clientEnti.getInternet_size()+10);
               // clientEnti.setPrice(clientEnti.getPrice()+5000);
                personRepo.update (clientEnti);
                personRepo.commit ();
            //}else if (clientEnti.getId()==4){
                //clientEnti.setInternet_size(clientEnti.getInternet_size()+25);
                //clientEnti.setPrice(clientEnti.getPrice()+10000);
                personRepo.update (clientEnti);
                personRepo.commit ();
          //  }
        }
    }
    public List<ClientEnti> report()throws Exception{
        List<ClientEnti> entities;
        try (ClientRepo repository = new ClientRepo()) {
            entities = repository.selecting();
        }
        return entities;
    }
    public int money(ClientEnti clientEnti)throws Exception{
        int money;
        try (ClientRepo clientRepo=new ClientRepo()){
            money=clientRepo.money(clientEnti);
        }
        return money;
    }
    public int size(ClientEnti clientEnti)throws Exception{
        int size;
        try (ClientRepo clientRepo=new ClientRepo()){
            size=clientRepo.size(clientEnti);
        }
        return size;
    }
}
