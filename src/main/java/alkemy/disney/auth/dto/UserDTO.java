package alkemy.disney.auth.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Getter
@Setter
public class UserDTO {

    @Email(message = "Username must be an email")
    private String username;

    @Size(min = 8, max = 16)
    private String password;

}
