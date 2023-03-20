# Contexto y problema:

 Durante la última década, han aumentado los índices de accidentabilidad, especialmente en el rubro industrial, minero y construcción. A pesar de las leyes y normativas las cifras son alarmantes. Para poder dar cumplimiento a la normativa y mantener ambientes de trabajo seguros, muchas empresas se ven en la obligación de contratar asesoría profesional, que representa un costo elevado y la disminución o la no implementación de medidas necesarias para la seguridad. Muchas empresas que han optado por no invertir en asesorías preventivas se han visto expuestas a multas por parte de las entidades fiscalizadoras, gastos, bajas en producción, alzas en pago de cotizaciones, entre otros. A demás de verse expuestos a posibles demandas y pagos de indemnizaciones a los trabajadores y familiares por accidentes ocurridos en el trabajo.

Por todo esto, un grupo de profesionales ha fundado una compañía de asesorías en prevención de riesgos laborales y necesita una solución tecnológica.
La empresa no posee un sistema de información que permita administrar toda la cantidad de información que se genera ni controlar actividades y recurso humano.
Existen problemas con la planificación de visitas, los profesionales en terreno no están disponibles para información de actividades futuras.
No existe registro de profesional que ha estado con mayor actividad ni se sabe dónde está cada uno.
Las visitas a terreno a veces no tienen el efecto indicado por la falta de coordinación con el cliente. Asisten trabajadores que no tienen que ver con la charla, o bien, no se coordina la ejecución de la capacitación, lo que trae consigo multas para la empresa. No se tiene un control de los clientes que pagan y los que no, lo que hace que muchas actividades de los profesionales corran por cuenta de la empresa, generando desbalances financieros. Las actividades se registran en carpetas lo que dificulta el seguimiento de las asesorías y el resumen de resultados por empresa. A demás, generalmente, no se cumplen ciertas actividades de control de implementacion de soluciones y a veces no se ha cumplido con la dirección del trabajo, lo que genera multas para los clientes, bajando la calidad del servicio. Los profesionales que han atendido a la empresa esporádicamente han variado, no existiendo un registro de la totalidad de actividades preventivas realizadas y no se tiene certeza de los avances.



# Descripción del proyecto:

  Ésta es una solución tecnólogica que cubre los procesos de negocios proponiendo una nueva gestión, control, seguridad y disponibilidad de información para la empresa y clientes.
  Este sistema permite la planificación de actividades controlando la ejecución de éstas, la gestión de clientes, coordinación empresa - profesionales - clientes para la respuesta temprana ante incidentes de seguridad. 
  A demás el sistema genera reportes y estadísticas que ayudan a la toma de decisiones mejorando el rendimiento de la empresa, considera carga laboral, demanda de clientes y las actividades involucradas para el cumplimiento de los contratos. Mantiene la comunicación con los profesionales en todo momento y da la posibilidad de realizar sus actividades aun cuando no cuenten con conectividad.

# Integrantes: 
  - Benjamin Paez
  - Maria Fernanda Zuñiga
  - Javiera Saavedra
  - Jose Zamora
  
 # IDE de desarrollo:
  - Eclipse
  - Intellij
  - Jdk 19
  
  # Descripción del menu:
  El sistema dispone de un menu en el cual se permite crear usuario, cliente, profesional, administrativo. Una vez creado el cliente se puede crear capacitaciones, asi como visitas en terreno y accidentes. Es obligatorio que cada vez que se cree un cliente se cree una visita en terreno asi como tambien a esta visita una revisión, se puede crear uno o más accidentes.
+ El menu también despliega las siguiente lista de reportes:
  - Listar usuarios: permite desplegar la lista completa de usuarios, independiente
del tipo. En este método solo se deben desplegar los datos de la clase usuario.
  - Listar usuarios por tipo: recibe un tipo de usuario (cliente, administrador o
profesional), y retorna los datos respectivos según el tipo de usuario.
  - Listar capacitaciones: este método despliega las capacitaciones registradas en la
lista respectiva, junto con los datos del cliente al que está asociada dicha
capacitación.
+ A demás permite almacenar los siguientes aspectos:
  - Almacenar cliente: permite agregar un nuevo cliente a la lista de instancias
dela interface Asesoria.
  - Almacenar profesional: permite agregar un nuevo profesional a la lista de
instancias de la interface Asesoria.
  - Almacenar administrativo: permite agregar un nuevo administrativo a la
lista de instancias de la interface Asesoria.
  - Almacenar capacitación: permite agregar una nueva capacitación a la lista de
instancias de la clase Capacitación.
+ Eliminar usuario: permite eliminar un usuario desde la lista de interfaces de
Asesoría acuerdo con el RUN del usuario.
+ Por ultimo permite enlistar lo siguiente:
  - Usuarios sin tipo: permite desplegar la lista completa de usuarios, independiente del tipo.
  - Usuarios por tipo: recibe un tipo de usuario y retorna los datos respectivos según el tipo.
  - Capacitaciones: éste método despliega las capacitaciones registradas en la lista respectiva, junto con los datos del cliente al que está asociada dicha capacitación.
