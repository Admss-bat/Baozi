package com.baozi.demo.dao;

import org.springframework.stereotype.Repository;
import com.baozi.demo.entity.Cliente;


@Repository
public class ClienteDaoImpl extends AbstractDao<Cliente, Long> implements ClienteDao{

}
