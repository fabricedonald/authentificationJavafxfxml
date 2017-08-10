
package fxmlexample;
 
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
 
public class FXMLExampleController {
    @FXML private TextField loginName;
    @FXML private PasswordField passwordField;
    @FXML private Text actiontarget;

    public TextField getLoginName() {
        return loginName;
    }    

    public PasswordField getPasswordField() {
        return passwordField;
    }
    
    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
        
        boolean verifie = verifieChamp(getLoginName().getText(), getPasswordField().getText());
        if(verifie == true) {
            actiontarget.setText("Connexion avec succès");
        } else {
            actiontarget.setText("Connexion refusé");
        }
            
    }
    
    //verifie l'invalidité des champs
    public boolean  verifieChamp(String nomUtilisateur, String motDePasse) {
        boolean test = false;
        
        if (((nomUtilisateur.equals("Bob")) & (motDePasse.equals("lebucheron"))) == test){
            System.out.println("Nom ou mot de passe incorrect!");
            return test;
        } else {
            System.out.println("Authentification reussi...");
            return true;
        }
    }

}
