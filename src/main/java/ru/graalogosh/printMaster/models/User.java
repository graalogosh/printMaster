package ru.graalogosh.printMaster.models;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * Created by Anton Mukovozov (graalogosh@gmail.com) on 18.01.2017.
 */
@Data
@Builder
public class User {
    @Id
    private String id;

    private String username;
    private String password;
    private String department;
    private String phone;
    private String email;
}
