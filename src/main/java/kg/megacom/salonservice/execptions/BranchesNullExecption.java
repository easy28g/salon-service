package kg.megacom.salonservice.execptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class BranchesNullExecption extends RuntimeException{
    public BranchesNullExecption(String message){
        super(message);
    }
}
