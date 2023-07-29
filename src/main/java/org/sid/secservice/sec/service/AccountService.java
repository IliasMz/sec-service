package org.sid.secservice.sec.service;

import org.sid.secservice.sec.entities.AppRoles;
import org.sid.secservice.sec.entities.AppUser;

import java.util.List;

public interface AccountService {
    AppUser addNewUser(AppUser appUser);
    AppRoles addNewRole(AppRoles appRoles);
    void addRoleToUser(String username,String roleName);
    AppUser loadUserByUserName(String username);
    List<AppUser> listUsers();
}
