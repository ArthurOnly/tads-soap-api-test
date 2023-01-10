package server.interfaces;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface IUserServer {
  @WebMethod String index();
  @WebMethod String create(String nome, String email);
  @WebMethod String delete(int id);
}