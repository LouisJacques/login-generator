package geco;
import java.util.UUID;
/**
 * Created by 21506354 on 30/11/2016.
 */
public class PasswordGeneration {
    public String getRandomPassword(){

        String res =UUID.randomUUID().toString();
        return res.substring(0,7);
    }
}
