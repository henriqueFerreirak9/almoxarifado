package interface1;


import busines.Address;
import busines.User;


import repository.Connect;

public class Main {
    public  static void main (String[] agrs){

        InterfaceScreenUsers tela = new InterfaceScreenUsers();


        User user1 = new User();
        user1.setId(1);
        user1.setName("henrique");
        user1.setPassword("s1");

        Address end1 = new Address();
        end1.setId(1);
        end1.setDistrict("goiass");
        end1.setNumber(22);
        end1.setStreet("Av. Goias");

        user1.setAddress(end1);

        String user_teste =
          "user 1"
            + "\nId: " + user1.getId()
            + "\nNome: " + user1.getName()
            + "\nSenha: " + user1.getPassword();
        String user_adress =
          "endereço user 1"
            + "\nId adress: " + user1.getAddress().getId()
            + "\nrua: " + user1.getAddress().getStreet()
            + "\nEstado: " + user1.getAddress().getDistrict()
            + "\nNumero: " + user1.getAddress().getNumber();


        System.out.println(user_teste);
        if (user1.getAddress()!= null){
            System.out.println(user_adress);
        };


        Connect.createConnection();
        System.out.println(Connect.connectionStatus());
    }

}
