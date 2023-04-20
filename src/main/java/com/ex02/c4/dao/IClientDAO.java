/**
 * 
 */
package com.ex02.c4.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ex02.c4.dto.Client;

/**
 * @author elena-01
 *
 */
public interface IClientDAO extends JpaRepository<Client, Integer>{

}
