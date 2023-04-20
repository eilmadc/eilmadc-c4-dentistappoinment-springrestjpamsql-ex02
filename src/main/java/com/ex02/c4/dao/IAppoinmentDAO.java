/**
 * 
 */
package com.ex02.c4.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ex02.c4.dto.Appoinment;

/**
 * @author elena-01
 *
 */
public interface IAppoinmentDAO extends JpaRepository<Appoinment, Integer> {

}
