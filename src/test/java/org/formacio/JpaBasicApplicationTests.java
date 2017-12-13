package org.formacio;


import org.formacio.domain.Persona;
import org.formacio.servei.PersonaService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import org.junit.Assert;


@RunWith(SpringRunner.class)
@SpringBootTest
@Sql(statements= {
		"delete from t_cotxes","delete from t_persones","delete from t_municipis",
		"insert into t_municipis (mun_id, mun_nom) values (1, 'Sant Antoni')",
        "insert into t_persones (per_id, per_nom, per_munid) values (1, 'Joan', 1)",
        "insert into t_cotxes (cot_matricula, cot_model, cot_propietari) values ('CCC-0000', 'Tesla', 1)"
        })
public class JpaBasicApplicationTests {

	@Autowired
	private PersonaService servei;

	@Test
	public void test_lazy() { 
		
		Persona joan = servei.carrega(1).get();
		Assert.assertEquals(1, joan.getCotxes().size());
	}	
	
		
}
