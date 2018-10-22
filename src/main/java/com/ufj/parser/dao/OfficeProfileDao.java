package org.lm.edm.api.office.dao;

import org.lm.edm.api.office.model.entity.Office;
import org.lm.edm.api.office.model.entity.TeamInfo;

import java.util.List;

/**
 * DAO Interface method declarations consuming data from EDH
 * Created by vkalakotahe7160 on 10/17/2018
 */
public interface OfficeProfileDao {

    Office fetchOfficeById(String officeId) throws Exception;

    List<TeamInfo> fetchTeamsByOfficeId(String officeId) throws Exception;

    boolean isAuthorized(String officeId, String userName) throws Exception;

}
