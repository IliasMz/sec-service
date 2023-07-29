package org.sid.secservice.sec.repository;

import org.sid.secservice.sec.entities.AppRoles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRoles,Long> {
AppRoles findByRolesName(String roleName);
}
