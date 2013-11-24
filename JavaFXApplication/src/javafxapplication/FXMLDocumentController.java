package javafxapplication;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Akim
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField text1;
    @FXML
    private TextField text2;
    @FXML
    private TextField text3;
    @FXML
    private PasswordField text4;
  
    @FXML
    private void handleButtonAction(ActionEvent event) {

        String shopName, sellerName, login, password;
        shopName=text1.getText();
        sellerName=text2.getText();
        login=text3.getText();
        password=text4.getText();
        
        RestTemplate restTemplate = new RestTemplate();
        String url = String.format("http://localhost:8080/addSeller/%s/%s/%s/%s",shopName,sellerName,login,password);
        Seller customer = restTemplate.getForObject(url, Seller.class); 
        JOptionPane.showMessageDialog(null, shopName +"дүкөнүнө жаңы сатуучу кошулду");
    }
    @FXML
    private void textTazala(ActionEvent event){
    text1.setText("");
    text2.setText("");
    text3.setText("");
    text4.setText("");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
