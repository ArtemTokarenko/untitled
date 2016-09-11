package untitled.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import untitled.bean.ClientBean;
import untitled.entity.Client;
import untitled.entity.User;
import untitled.enumm.Role;
import untitled.repository.ClientRepository;

import java.text.ParseException;
import java.util.Date;

@Service
public class ClientService {

@Autowired

private ClientRepository clientRepository;


    public ClientBean createClient(ClientBean clientBean) throws ParseException {
        Client client = new Client();
        client.setLogin(clientBean.getLogin());
        client.setPassword(clientBean.getPassword());
        client.setEmail(clientBean.getEmail());
        client.setCreatedDate(new Date());
        client.setRole(Role.ROLE_ADMIN);
        client.setBan(clientBean.isBan());

        clientRepository.save(client);

        return ClientBean.toBean(client);
    }


}
