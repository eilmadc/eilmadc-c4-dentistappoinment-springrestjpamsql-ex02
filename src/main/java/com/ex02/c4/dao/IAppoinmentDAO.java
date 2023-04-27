/**
 * 
 */
package com.ex02.c4.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ex02.c4.dto.Appoinment;

/**
 * @author elena-01
 *
 */
public interface IAppoinmentDAO extends JpaRepository<Appoinment, Integer> {

	List<Appoinment> findAllByDentist(int i);
	
	List<Appoinment> findAllByClient(int i);

}
