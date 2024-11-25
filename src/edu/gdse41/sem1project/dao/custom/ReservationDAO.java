/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gdse41.sem1project.dao.custom;

import edu.gdse41.sem1project.dao.SuperDAO;
import edu.gdse41.sem1project.dto.ReservationDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Hansani Kariyawasam
 */
public interface ReservationDAO extends SuperDAO<ReservationDTO>{
    public  ArrayList<String> getAllResIDs()throws SQLException,ClassNotFoundException;
}
