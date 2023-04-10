package team.skyprojava.websitebackend.service;

import team.skyprojava.websitebackend.dto.RegisterReq;
import team.skyprojava.websitebackend.dto.Role;

public interface AuthService {
    boolean login(String userName, String password);
    boolean register(RegisterReq registerReq, Role role);
}
